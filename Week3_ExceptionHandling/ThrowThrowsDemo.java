public class ThrowThrowsDemo {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("You are not eligible to vote!");
        }
        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
