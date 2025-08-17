package Week10;

import java.util.Scanner;
import java.util.Random;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length of the row: ");
        int rows = scanner.nextInt();
        System.out.print("Please enter the length of the column: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        fillMatrix(matrix, rows, columns);
        System.out.println("Created Matrix:");
        printMatrix(matrix);
    }
    public static void fillMatrix(int[][] matrix, int rows, int columns) {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int number = 1 + random.nextInt(100);
                matrix[i][j] = checkEven(number);
            }
        }
    }
    public static int checkEven(int number) {
        if (number % 2 == 0) {
            return number;
        } else {
            return 0;
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}