package ZZZjcrud.repository;

import ZZIjbdc.conn.ConnectionFactory;
import ZZZjcrud.dominio.Monitor;
import ZZZjcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class MonitorRepository {
    public static List<Monitor> findByName(String names) {
        log.info("Finding Producers by id monitor, name, hertz, producer id and producer name '{}", names);
        List<Monitor> monitores = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement statement = createPreparedStatementFindByName(conn, names );
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Producer producer = Producer.builder().name(resultSet.getString("producer_name")).id(resultSet.getInt("producer_id")).build();
                Monitor build = Monitor.builder().id(resultSet.getInt("id")).name(resultSet.getString("name"))
                        .hz(resultSet.getInt("hertz")).producer(producer).build();
                monitores.add(build);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all monitores", e);
        }
        return monitores;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = """
                SELECT a.idmonito, a.name, a.hertz, a.producer_id, p.name as producer_name from monitor_store.monito a inner join
                monitor_store.producer p on a.producer_id = p.idproducer
                where a.name like '%%';
                """;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, "%" + name + "%");
            return preparedStatement;
        }
    }

    public static Optional<Monitor> findById(Integer id) {
        log.info("Finding Producers by id '{}", id);
        String sql = "SELECT * FROM Monitor where idproducer = ?;";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement statement = createPreparedStatementFindById(conn, id);
             ResultSet resultSet = statement.executeQuery()) {
            if (!resultSet.next()) Optional.empty();
            Producer producer = Producer.builder().name(resultSet.getString("producer_name")).id(resultSet.getInt("producer_id")).build();
            Monitor build = Monitor.builder().id(resultSet.getInt("id")).name(resultSet.getString("name"))
                    .hz(resultSet.getInt("hertz")).producer(producer).build();
            return Optional.of(build);

        } catch (SQLException e) {
            log.error("Error while trying to find all monitores", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindById(Connection connection, Integer id) throws SQLException {
        String sql = """
                SELECT a.idmonito, a.name, a.hertz, a.producer_id, p.name as producer_name from monitor_store.monito a inner join
                monitor_store.producer p on a.producer_id = p.idproducer
                where a.name = ?;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement statement = createPreparedStatementDelete(conn, id)) {
            statement.execute();
            log.info("Deleted Monitor '{}' from database", id);
        } catch (SQLException e) {
            log.error("Error while trying to insert Monitor '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM monito WHERE idmonito = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }

    public static void save(Monitor Monitor) {
        log.info("Saving Monitor '{}", Monitor);
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement preparedStatement = createPrepareStatementSave(conn, Monitor)) {
            preparedStatement.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update Monitor '{}'", Monitor.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection connection, Monitor Monitor) throws SQLException {
        String sql = "INSERT INTO `monitor_store`.`monito` (`name`, `hertz`, `producer_id`) VALUES (?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, Monitor.getName());
        preparedStatement.setInt(2, Monitor.getHz());
        preparedStatement.setInt(3, Monitor.getProducer().getId());
        return preparedStatement;
    }

    public static void update(Monitor Monitor) {
        log.info("Updating Monitor '{}'", Monitor);
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement statement = createPreparedStatementUpdate(conn, Monitor)) {
            statement.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update Monitor '{}'", Monitor.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection connection, Monitor Monitor) throws SQLException {
        String sql = "UPDATE `monitor_store`.`monito` SET `name` = ?, `hertz` = ? WHERE (`idmonito` = ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, Monitor.getName());
        preparedStatement.setInt(2, Monitor.getHz());
        preparedStatement.setInt(3, Monitor.getId());
        return preparedStatement;
    }
}
