package Week5;

import java.util.Scanner;
public class CityOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first city name: ");
        String city1 = sc.nextLine();

        System.out.println("Enter the second city name: ");
        String city2 = sc.nextLine();

        System.out.println("Enter the third city name: ");
        String city3 = sc.nextLine();

        city1 = city1.substring(0, 1).toUpperCase() + city1.substring(1).toLowerCase(); // (0,1) dahil edilmez sadece 0 alınır
        System.out.println(city1);
        city2 = city2.substring(0, 1).toUpperCase() + city2.substring(1).toLowerCase();
        city3 = city3.substring(0, 1).toUpperCase() + city3.substring(1).toLowerCase();

        if (city1.compareTo(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        }
        if (city1.compareTo(city3) > 0) {
            String temp = city1;
            city1 = city3;
            city3 = temp;
        }
        if (city2.compareTo(city3) > 0) {
            String temp = city2;
            city2 = city3;
            city3 = temp;
        }
        System.out.println("The cities in ascending order are: ");
        System.out.println(city1);
        System.out.println(city2);
        System.out.println(city3);
    }
}
