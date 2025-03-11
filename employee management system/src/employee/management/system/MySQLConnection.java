package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employeemanagement";
        String user = "root";
        String password = System.getenv("DB_PASSWORD"); // Secure way to get password

        try {
            // Load MySQL Driver (Optional for MySQL 8+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Try-with-resources to auto-close connection
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","Jeeva@#638529")) {
                System.out.println("Connected to MySQL database successfully!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println(" MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(" Failed to connect to MySQL!");
            e.printStackTrace();
        }
    }
}
