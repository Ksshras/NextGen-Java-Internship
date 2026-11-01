public class Student {
    String name;
    int age;
    String branch;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shravani";
        s1.age = 21;
        s1.branch = "CSE";
        s1.displayDetails();
    }
}
