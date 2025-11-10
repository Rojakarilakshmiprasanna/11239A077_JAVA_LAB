import java.io.*;

public class ArraySumAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of elements: ");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
