package ZZZjcrud.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    /*
    Metodo para entrar no BD
     */
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/monitor_store";
        String username = "root";
        String password = "root";
        try {
           return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
