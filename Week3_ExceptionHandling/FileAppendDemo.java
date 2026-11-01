import java.io.FileWriter;
import java.io.IOException;

public class FileAppendDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("Course: Java Programming\n");
            writer.write("Internship: Next Gen Software Hub\n");
            writer.close();

            System.out.println("New data appended successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
