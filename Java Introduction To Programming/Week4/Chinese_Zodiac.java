package Week4;


import java.util.Scanner;

public class Chinese_Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int zodiac = year % 12;

        String animal;
        switch (zodiac) {
            case 0:
                animal = "Monkey";
                break;
            case 1:
                animal = "Rooster";
                break;
            case 2:
                animal = "Dog";
                break;
            case 3:
                animal = "Pig";
                break;
            case 4:
                animal = "Rat";
                break;
            case 5:
                animal = "Ox";
                break;
            case 6:
                animal = "Tiger";
                break;
            case 7:
                animal = "Rabbit";
                break;
            case 8:
                animal = "Dragon";
                break;
            case 9:
                animal = "Snake";
                break;
            case 10:
                animal = "Horse";
                break;
            case 11:
                animal = "Sheep";
                break;
            default:
                animal = "Unknown";
                break;
        }

        System.out.println("The Chinese Zodiac animal for year " + year + " is: " + animal);
    }
}