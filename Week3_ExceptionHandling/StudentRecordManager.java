import java.io.*;
import java.util.Scanner;

public class StudentRecordManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT RECORD MANAGER =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter student name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter roll number: ");
                        String rollNo = sc.nextLine();

                        System.out.print("Enter marks: ");
                        int marks = sc.nextInt();
                        sc.nextLine();

                        FileWriter writer = new FileWriter("students.txt", true);
                        writer.write("Name: " + name + "\n");
                        writer.write("Roll Number: " + rollNo + "\n");
                        writer.write("Marks: " + marks + "\n");
                        writer.write("----------------------\n");
                        writer.close();

                        System.out.println("Student saved successfully!");
                    } catch (IOException e) {
                        System.out.println("File error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        BufferedReader reader =
                                new BufferedReader(new FileReader("students.txt"));
                        String line;

                        System.out.println("\n===== STUDENT RECORDS =====");
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("No student records found yet.");
                    } catch (IOException e) {
                        System.out.println("Error reading file.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}
