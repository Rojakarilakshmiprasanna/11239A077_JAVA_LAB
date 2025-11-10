import java.io.*;

public class MaxMinInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of elements: ");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
