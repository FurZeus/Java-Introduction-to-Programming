package Week3;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate of the point: ");
        double x = sc.nextDouble();
        System.out.println("Enter y coordinate of the point: ");
        double y = sc.nextDouble();
        double radius = 10.0;

        double distance = Math.sqrt(Math.pow(x , 2) + Math.pow(y , 2));

        if (distance <= radius) {
            System.out.println("The circle contains the point");
        }
        else{
            System.out.println("The circle does not contain the point");
        }
    }
}
