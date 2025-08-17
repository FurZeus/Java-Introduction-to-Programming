package Week6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (x): ");

        int x = scanner.nextInt();
        System.out.print("Enter the exponent (y): ");
        int y = scanner.nextInt();
        int power = 1;
        for (int i = 1; i <= y; i++) {
            power *= x;
        }
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        double result = (double) power / factorial;
        System.out.println("(" + x + "^" + y + ") / " + x + "! = " + result);
    }
}
