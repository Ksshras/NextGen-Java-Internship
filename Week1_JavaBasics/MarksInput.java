import java.util.Scanner;

public class MarksInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Java: ");
        int java = sc.nextInt();

        System.out.print("Enter marks in Python: ");
        int python = sc.nextInt();

        System.out.print("Enter marks in DBMS: ");
        int dbms = sc.nextInt();

        int total = java + python + dbms;
        double average = total / 3.0;

        System.out.println("\nStudent: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
