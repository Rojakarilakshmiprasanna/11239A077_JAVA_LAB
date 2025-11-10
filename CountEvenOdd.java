import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Get input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Variables to count even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Iterate through the array and count even and odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++; // Even number
            } else {
                oddCount++; // Odd number
            }
        }

        // Print the result
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
