import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        double mark1 = sc.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double mark2 = sc.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double mark3 = sc.nextDouble();

        double total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total);
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
            System.out.println("Result: Needs Improvement");
        }

        sc.close();
    }
}
