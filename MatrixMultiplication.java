import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for matrix A's dimensions
        System.out.print("Enter the number of rows for Matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter the number of columns for Matrix A: ");
        int colsA = sc.nextInt();

        // Take input for matrix B's dimensions
        System.out.print("Enter the number of rows for Matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter the number of columns for Matrix B: ");
        int colsB = sc.nextInt();

        // Ensure the number of columns in A matches the number of rows in B
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. The number of columns of Matrix A must be equal to the number of rows of Matrix B.");
            return;
        }

        // Initialize matrices
        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        // Get input for Matrix A
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        // Get input for Matrix B
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;  // Initialize the result element
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j]; // Multiply and accumulate
                }
            }
        }

        // Display the result of matrix multiplication
        System.out.println("Matrix A * B:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}