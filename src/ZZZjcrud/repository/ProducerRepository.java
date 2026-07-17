package ZZZjcrud.repository;

import ZZIjbdc.conn.ConnectionFactory;

import ZZZjcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String names) {
        log.info("Finding Producers by name '{}", names);
        String sql = "SELECT * FROM producer where name like ?;";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement statement = createPreparedStatementFindByName(conn, names);
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

    private static PreparedStatement createPreparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM producer where name like ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + name + "%");
        return preparedStatement;
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding Producers by id '{}", id);
        String sql = "SELECT * FROM producer where idproducer = ?;";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement statement = createPreparedStatementFindById(conn, id);
             ResultSet resultSet = statement.executeQuery()) {
            if (!resultSet.next()) Optional.empty();
            String name = resultSet.getString("name");
            return Optional.of(Producer.builder().id(id).name(name).build());

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindById(Connection connection, Integer id) throws SQLException {
        String sql = "SELECT * FROM producer where idproducer = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement statement = createPreparedStatementDelete(conn, id)) {
            statement.execute();
            log.info("Deleted producer '{}' from database", id);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM producer WHERE idproducer = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }

    public static void save(Producer producer) {
        log.info("Saving producer '{}", producer);
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement preparedStatement = createPrepareStatementSave(conn, producer)) {
            preparedStatement.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection connection, Producer producer) throws SQLException {
        String sql = "INSERT INTO `monitor_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        return preparedStatement;
    }

    public static void update(Producer producer) {
        log.info("Updating producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement statement = createPreparedStatementUpdate(conn, producer)) {
            statement.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection connection, Producer producer) throws SQLException {
        String sql = "UPDATE `monitor_store`.`producer` SET `name` = ? WHERE (`idproducer` = ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        preparedStatement.setInt(2, producer.getId());
        return preparedStatement;
    }
}
