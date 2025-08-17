package Week10;

public class Example2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {4, 5, 6},
                {70, 80, 90}
        };
        int[][] transpose = new int[3][3];
        int diagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transpose[j][i] = matrix[i][j];
                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
        }

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
}