import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Take input for the operator
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        // Result variable to store the result of the operation
        double result;

        // Switch statement to perform the operation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Error: Invalid operator entered.");
                break;
        }
    }
}