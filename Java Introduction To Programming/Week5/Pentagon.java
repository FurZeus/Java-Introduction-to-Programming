package Week5;

import java.util.Scanner;
public class Pentagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vertex of the pentagon");
        double r = sc.nextDouble();
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area =  (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The side length of the pentagon is: %.2f%n",s);
        System.out.printf("The area of the pentagon is: %.2f%n", area);


    }

}