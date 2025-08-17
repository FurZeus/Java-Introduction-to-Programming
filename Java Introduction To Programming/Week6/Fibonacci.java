package Week6;

import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many terms of the Fibonacci series do you want? ");
        int terms = scanner.nextInt();
        int a = 0, b = 1, count = 0;

        System.out.print("Fibonacci series: ");
        while (count < terms) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
    }
}