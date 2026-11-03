import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Beginner JDBC practice: add, view and delete books in a MySQL database.
 *
 * Update DB_URL, DB_USER and DB_PASSWORD for your local MySQL setup.
 * Do not commit real credentials to GitHub.
 */
public class LibraryManagement {
    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/internship_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "change_me";

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    private static void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter author: ");
        String author = scanner.nextLine().trim();

        if (title.isEmpty() || author.isEmpty()) {
            System.out.println("Title and author cannot be empty.");
            return;
        }

        String sql = "INSERT INTO books (title, author) VALUES (?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, title);
            statement.setString(2, author);
            int rows = statement.executeUpdate();
            System.out.println(rows == 1 ? "Book added successfully." : "Book was not added.");
        } catch (SQLException e) {
            System.err.println("Could not add book: " + e.getMessage());
        }
    }

    private static void viewBooks() {
        String sql = "SELECT id, title, author FROM books ORDER BY id";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet results = statement.executeQuery()) {
            System.out.println("\nID | TITLE | AUTHOR");
            System.out.println("-------------------------");
            while (results.next()) {
                System.out.printf("%d | %s | %s%n",
                        results.getInt("id"),
                        results.getString("title"),
                        results.getString("author"));
            }
        } catch (SQLException e) {
            System.err.println("Could not fetch books: " + e.getMessage());
        }
    }

    private static void deleteBook(Scanner scanner) {
        System.out.print("Enter book ID to delete: ");
        String input = scanner.nextLine().trim();

        try {
            int id = Integer.parseInt(input);
            if (id <= 0) {
                System.out.println("ID must be a positive number.");
                return;
            }

            String sql = "DELETE FROM books WHERE id = ?";
            try (Connection connection = getConnection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                int rows = statement.executeUpdate();
                System.out.println(rows == 1 ? "Book deleted." : "No book found with that ID.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid numeric ID.");
        } catch (SQLException e) {
            System.err.println("Could not delete book: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("\n=== Library Management (JDBC) ===");
                System.out.println("1. Add book");
                System.out.println("2. View books");
                System.out.println("3. Delete book");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");

                String choice = scanner.nextLine().trim();
                switch (choice) {
                    case "1":
                        addBook(scanner);
                        break;
                    case "2":
                        viewBooks();
                        break;
                    case "3":
                        deleteBook(scanner);
                        break;
                    case "0":
                        running = false;
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
