package Week6;

import java.util.Scanner;
public class FindPrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + ":");

        if (end < 1) {
            System.out.println("There are no prime numbers between " + start + " and " + end + " because all numbers are negative.");
            return;
        }

        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
    }
}