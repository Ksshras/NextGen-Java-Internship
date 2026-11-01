import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/InternshipDB";
        String username = "root";
        String password = System.getenv("DB_PASSWORD");

        if (password == null || password.isBlank()) {
            System.out.println("Set the DB_PASSWORD environment variable first.");
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(url, username, password)) {
                System.out.println("MySQL Connected Successfully!");
                System.out.println("Database: InternshipDB");
            }

        } catch (Exception e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
