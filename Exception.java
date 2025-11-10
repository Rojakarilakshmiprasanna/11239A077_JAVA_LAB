public class Exception {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int a = 10;
            int b = 0;
            int result = a / b;  // This will cause ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Exception Message: " + e.getMessage());
        }
        finally {
            // Code that always executes
            System.out.println("This is the finally block, it always executes.");
        }

        System.out.println("Program continues after exception handling...");
    }
}