package Week2;

import java.util.Scanner;

public class AnnualTax {

    public static void main(String[] args) {

        System.out.println("Please Enter Annual Tax (TL): ");

        Scanner input = new Scanner(System.in);

        double annualTax = input.nextDouble();
        double KDV = annualTax * (0.18);

        System.out.println("Your Annual Tax: " + (KDV * 100)/100.0 + " TL");

    }
}