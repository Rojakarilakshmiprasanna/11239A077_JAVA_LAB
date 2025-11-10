public class ThrowExample {
    static void checkAge(int age) {
        if (age < 18) {
            // manually throwing exception
            throw new ArithmeticException("Access denied - You must be 18 or older.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}