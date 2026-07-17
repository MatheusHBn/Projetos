package ZZIjbdc.repository;

import ZZIjbdc.conn.ConnectionFactory;
import ZZIjbdc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    /*
    Criando um metodo onde mandará os valores para o BD
     */
    public static void save(Producer producer) {
        String sql = "INSERT INTO `monitor_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database rows affecteds '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void saveTransaction(List<Producer> producers) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            conn.setAutoCommit(false);
            preparedStatementSaveTransaction(conn, producers);
            conn.commit();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producers, e);
        }
    }

    private static void preparedStatementSaveTransaction(Connection connection, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO `monitor_store`.`producer` (`name`) VALUES (?);";
        for (Producer p: producers){
            try( PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
                log.info("Save producer '{}'", p.getName());
                preparedStatement.setString(1, p.getName());
                preparedStatement.execute();
            } catch (SQLException e) {
                log.error("Error to save a producer '{}'",p.getName(), e);
            }
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `monitor_store`.`producer` WHERE idproducer = ?;".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from database rows affecteds '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", id, e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `monitor_store`.`producer` SET `name` = '%s ' WHERE (`idproducer` = '%d');".formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer '{}', rows affecteds '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    public static void updatePreparedStatement(Producer producer) {
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement statement = preparedStatementUpdate(conn, producer)) {
            int rowsAffected = statement.executeUpdate();
            log.info("Updated producer '{}', rows affecteds '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementUpdate(Connection connection, Producer producer) throws SQLException {
        String sql = "UPDATE `monitor_store`.`producer` SET `name` = ? WHERE `idproducer` = ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        preparedStatement.setInt(2, producer.getId());
        return preparedStatement;
    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        return findByName("");
//        String sql = "SELECT idproducer, name FROM producer;";
//        List<Producer> producers = new ArrayList<>();
//        try (Connection conn = ConnectionFactory.getConnection()) {
//            Statement statement = conn.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()){
//                int id = resultSet.getInt("idproducer");
//                String name = resultSet.getString("name");
//                Producer build = Producer.builder().id(id).name(name).build();
//                producers.add(build);
//            }
//        } catch (SQLException e) {
//            log.error("Error while trying to find all producers", e);
//        }
//        return producers;
    }

    public static List<Producer> findByName(String names) {
        log.info("Finding Producers by name");
        String sql = "SELECT * FROM producer where name like '%s';".formatted("%" + names + "%");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("idproducer");
                String name = resultSet.getString("name");
                Producer build = Producer.builder().id(id).name(name).build();
                producers.add(build);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static void showProducerMetaData() {
        log.info("Showing Producer Metadata");
        String sql = "SELECT * FROM monitor_store.producer";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            ResultSetMetaData rsmetaData = resultSet.getMetaData();
            resultSet.next();
            int columnCount = rsmetaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);
            for (int i = 1; i < columnCount; i++) {
                log.info("Table name '{}'", rsmetaData.getTableName(i));
                log.info("Column name '{}'", rsmetaData.getColumnName(i));
                log.info("Column size '{}'", rsmetaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", rsmetaData.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static void showDriverMetaData() {
        log.info("Showing Driver Metadata");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData metaData = conn.getMetaData();
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCUR_UPDATABLE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCUR_UPDATABLE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM monitor_store.producer";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery(sql);) {
            log.info("Last row? '{}'", resultSet.last());
            log.info("Row number '{}'", resultSet.getRow());
            log.info(Producer.builder().id(resultSet.getInt("idproducer")).name(resultSet.getString("name")).build());

            log.info("First row? '{}'", resultSet.first());
            log.info("Row number '{}'", resultSet.getRow());
            log.info(Producer.builder().id(resultSet.getInt("idproducer")).name(resultSet.getString("name")).build());

            log.info("Absolute row? '{}'", resultSet.absolute(3));
            log.info("Row number '{}'", resultSet.getRow());
            log.info(Producer.builder().id(resultSet.getInt("idproducer")).name(resultSet.getString("name")).build());

            log.info("---------------------");
            while (resultSet.previous()) {
                log.info(Producer.builder().id(resultSet.getInt("idproducer")).name(resultSet.getString("name")).build());
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String names) {
        log.info("Finding Producers by name and updating to upper case");
        String sql = "SELECT * FROM producer where name like '%s';".formatted("%" + names + "%");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                resultSet.updateString("name", resultSet.getString("name").toUpperCase());
                resultSet.updateRow();
                int id = resultSet.getInt("idproducer");
                String name = resultSet.getString("name");
                Producer build = Producer.builder().id(id).name(name).build();
                producers.add(build);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static List<Producer> findByNameInsertWhenNotFound(String names) {
        log.info("Finding Producers by name if it not found");
        String sql = "SELECT * FROM producer where name like '%s';".formatted("%" + names + "%");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery(sql)) {
            if (resultSet.next()) return producers;
            resultSet.moveToInsertRow();
            resultSet.updateString("name", names);
            resultSet.insertRow();
            producers.add(getProducer(resultSet));
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Producer.builder().id(rs.getInt("idproducer")).name(rs.getString("name")).build();
    }

    public static List<Producer> findByNameAndDelete(String names) {
        log.info("Finding Producers by name and deleting it");
        String sql = "SELECT * FROM producer where name like '%s';".formatted("%" + names + "%");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                log.info("Deleting '{}'", resultSet.getString("name"));
                resultSet.deleteRow();
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static List<Producer> findByNamePreparedStatement(String names) {
        log.info("Finding Producers by name");
        String sql = "SELECT * FROM producer where name like ?;";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement statement = preparedStatementFindByName(conn, names);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("idproducer");
                String name = resultSet.getString("name");
                Producer build = Producer.builder().id(id).name(name).build();
                producers.add(build);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static List<Producer> findByNameCallableStatement(String names) {
        log.info("Finding Producers by callable name");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement statement = callablepreparedStatementFindByName(conn, names);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("idproducer");
                String name = resultSet.getString("name");
                Producer build = Producer.builder().id(id).name(name).build();
                producers.add(build);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    private static PreparedStatement preparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM producer where name like ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + name + "%");
        return preparedStatement;
    }

    private static CallableStatement callablepreparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "CALL `monitor_store`.`sp_get_producer_by_name`(?);";
        CallableStatement callableStatement = connection.prepareCall(sql);
        callableStatement.setString(1, "%" + name + "%");
        return callableStatement;
    }
}
