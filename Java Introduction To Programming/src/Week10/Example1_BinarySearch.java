package Week10;
public class Example1_BinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        int target = 16;
        int[] position = searchMatrix(matrix, target);

        if (position != null) {
            System.out.println("Target found at position: (" + position[0] + ", " + position[1] + ")");
        } else {
            System.out.println("Target not found in the matrix.");
        }
    }
    public static int[] searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return null;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length - 1] < target) {
                continue;
            }
            int left = 0;
            int right = matrix[i].length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[i][mid] == target) {
                    return new int[]{i, mid};
                } else if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return null;
    }
}
