package ZZIjbdc.repository;

import ZZIjbdc.listener.CustomRowSetListener;
import lombok.NonNull;
import lombok.Singular;
import lombok.extern.log4j.Log4j2;


import ZZIjbdc.conn.ConnectionFactory;
import ZZIjbdc.dominio.Producer;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepositoryRowSet {
    public static List<Producer> findByNameJdbc(String name) {
        String sql = "SELECT * FROM producer where name like ?;";
        List<Producer> producers = new ArrayList<>();
        try (CachedRowSet jdbcRowSet = ConnectionFactory.getCachedRowSet()) {
            jdbcRowSet.addRowSetListener(new CustomRowSetListener());
            jdbcRowSet.setCommand(sql);
            jdbcRowSet.setString(1, String.format("%%%s%%", name));
            jdbcRowSet.execute();
            while (jdbcRowSet.next()) {
                int id = jdbcRowSet.getInt("idproducer");
                String names = jdbcRowSet.getString("name");
                Producer build = Producer.builder().id(id).name(names).build();
                producers.add(build);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }
    
//    public static void updateJdbcRowSet(Producer producer) {
//        String sql = "UPDATE `monitor_store`.`producer` SET `name` = ? WHERE (`idproducer` = ?)";
//        try (JdbcRowSet jdbcRowSet = ConnectionFactory.getJdbcRowSet()) {
//            jdbcRowSet.setCommand(sql);
//            jdbcRowSet.setString(1, producer.getName());
//            jdbcRowSet.setInt(2, producer.getId());
//            jdbcRowSet.execute();
//
//        } catch (SQLException e) {
//            log.error("Error while trying to find all producers", e);
//        }
//    }

    public static void updateJdbcRowSet(Producer producer) {
        String sql = "SELECT * FROM producer WHERE idproducer = ?;";
        try (JdbcRowSet jdbcRowSet = ConnectionFactory.getJdbcRowSet()) {
            jdbcRowSet.addRowSetListener(new CustomRowSetListener());
            jdbcRowSet.setCommand(sql);
            jdbcRowSet.setInt(1, producer.getId());
            jdbcRowSet.execute();
            if (!jdbcRowSet.next()) return;
            jdbcRowSet.updateString("name", producer.getName());
            jdbcRowSet.updateRow();

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static void updateCachedRowSet(Producer producer) {
        String sql = "SELECT * FROM producer WHERE idproducer = ?;";
        try(CachedRowSet cachedRowSet = ConnectionFactory.getCachedRowSet(); Connection connection = ConnectionFactory.getConnection()) {
            connection.setAutoCommit(false);
            cachedRowSet.setCommand(sql);
            cachedRowSet.setInt(1, producer.getId());
            cachedRowSet.execute(connection);
            if (!cachedRowSet.next()) return;
            cachedRowSet.updateString("name", producer.getName());
            cachedRowSet.updateRow();
            cachedRowSet.acceptChanges();
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }
}