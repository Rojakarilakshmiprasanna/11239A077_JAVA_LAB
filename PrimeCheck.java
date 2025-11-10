import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number to check if it is prime: ");
        int num = sc.nextInt();

        // A prime number is greater than 1
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }

        boolean isPrime = true; // Assume number is prime

        // Check for factors from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false; // Found a divisor, not prime
                break;           // No need to check further
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}