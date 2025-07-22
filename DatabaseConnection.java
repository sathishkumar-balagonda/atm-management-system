package atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public Connection connect() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/atmdb";
            String user = "root";
            String password = "sathish@01";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully to Database!");

        } catch (SQLException e) {
            System.out.println("Connection Failed!");
        }

        return conn;
    }
}