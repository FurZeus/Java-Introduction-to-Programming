package Week2;

import java.util.Scanner;

public class Radius {

    public static void main(String[] args) {

        System.out.println("Enter the radius of the circle: ");
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double Area = pi * radius * radius;  // Math.PI
        System.out.println("The area of the circle is: " + Area);
    }
}