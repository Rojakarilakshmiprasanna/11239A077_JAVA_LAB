import java.util.Scanner;

public class SearchNumber {
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

        // Take input for the element to search
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        // Perform the search and track the index
        boolean found = false;
        int index = -1; // To store the index if element is found

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = true;
                index = i; // Save the index of the found element
                break; // Exit loop once element is found
            }
        }

        // Print the result
        if (found) {
            System.out.println(target + " is found in the array at index " + index + ".");
        } else {
            System.out.println(target + " is not found in the array.");
        }
    }
}
