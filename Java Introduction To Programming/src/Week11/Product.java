package Week11;

import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();
        int result = digitProduct(num);
        System.out.println("Final result is : " + result);
    }
    public static int digitProduct(int number) {
        if (number < 10) {
            return number;
        }
        int product = 1;
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        return digitProduct(product);
    }
}