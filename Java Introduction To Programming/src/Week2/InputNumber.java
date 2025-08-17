package Week2;

import java.util.Scanner;

 class InputNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number_1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number_2 = input.nextDouble();
        System.out.print(number_1 + "/" + number_2 + "= " + number_1 / number_2);
    }
}