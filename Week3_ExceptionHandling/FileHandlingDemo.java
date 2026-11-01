import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt");
            writer.write("Student Name: Shravani\n");
            writer.write("Branch: Computer Science\n");
            writer.write("Marks: 90\n");
            writer.close();

            System.out.println("File created and data written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
