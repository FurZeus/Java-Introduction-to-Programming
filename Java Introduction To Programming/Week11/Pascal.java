package Week11;
import java.util.Scanner;
public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int row = sc.nextInt();
        System.out.println("Enter the column number: ");
        int column = sc.nextInt();
        int result = Pascal(row, column);
        System.out.println("Pascal(" + row + ", " + column + ") = " + result);

    }
    public static int Pascal(int row, int col) {
        if (row == col || col == 0) {
            return 1;
        }
        return Pascal(row - 1, col) + Pascal(row - 1 , col - 1);
    }
}