package Week4;

import java.util.Scanner;

public class Car_Race {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int speed1, speed2, area, a1 = 1, a2 = 1;
        System.out.print("Enter the initial velocity of the car 1: ");
        speed1 = scanner.nextInt();

        System.out.print("Enter the initial velocity of the car 2: ");
        speed2 = scanner.nextInt();

        System.out.print("Enter the race area (between 1 and 3): ");
        area = scanner.nextInt();

        switch (area) {
            case 1:
                a1 = 15;
                a2 = 10;
                break;
            case 2:
                a1 = 10;
                a2 = 12;
                break;
            case 3:
                a1 = 17;
                a2 = 20;
                break;
            default:
                System.out.println("Invalid area selected.");
                break;
        }

        speed1 += a1 * 10;
        speed2 += a2 * 10;

        System.out.printf("Velocity of the first car after 10 seconds: %d%n", speed1);
        System.out.printf("Velocity of the second car after 10 seconds: %d%n", speed2);

        if (speed1 > speed2) {
            System.out.println("First car won the race");
        } else {
            System.out.println("Second car won the race");
        }

    }
}