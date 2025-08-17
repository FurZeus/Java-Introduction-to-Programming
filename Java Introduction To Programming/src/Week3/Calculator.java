package Week3;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose the operation");
        System.out.println("Addition (+) : 1");
        System.out.println("Subtraction (-) : 2");
        System.out.println("Multiplication (*) : 3");
        System.out.println("Division (/) : 4");

        int operation = sc.nextInt();

        if (operation <= 0 || operation > 4) {
            System.out.println("Invalid operation");
        }
        else{
            switch (operation) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    if (num2 ==0){
                        System.out.println("ERROR.Division by zero is not allowed");
                    }
                    else {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    }break;
            }
        }
    }
}
