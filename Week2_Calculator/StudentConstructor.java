package Week2_Calculator;

class StudentConstructor {
    String name;
    int age;
    String branch;

    StudentConstructor(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }

    public static void main(String[] args) {
        StudentConstructor s1 =
            new StudentConstructor("Shravani", 21, "CSE");
        StudentConstructor s2 =
            new StudentConstructor("Ananya", 22, "ECE");

        s1.display();
        System.out.println("----------------");
        s2.display();
    }
}
