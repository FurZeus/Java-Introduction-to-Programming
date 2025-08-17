package Week4;

import java.util.Scanner;

public class Season_Checker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        int daysInMonth = 0;

        if (month == 2) {
            System.out.print("Enter year: ");
            int year = input.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                daysInMonth = 29;
                System.out.println("It is a leap year, February has 29 days.");
            }
            else {
                daysInMonth = 28;
                System.out.println("It is not a leap year, February has 28 days.");
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        }
        else if (month >= 1 && month <= 12) {
            daysInMonth = 31;
        }
        else {
            System.out.printf("month %d is not a valid month\n", month);
            input.close();
            return;
        }

        switch (month) {
            case 12: case 1: case 2:
                System.out.printf("month %d is a winter month with %d days\n", month, daysInMonth);
                break;

            case 3: case 4: case 5:
                System.out.printf("month %d is a spring month with %d days\n", month, daysInMonth);
                break;

            case 6: case 7: case 8:
                System.out.printf("month %d is a summer month with %d days\n", month, daysInMonth);
                break;

            case 9: case 10: case 11:
                System.out.printf("month %d is a fall month with %d days\n", month, daysInMonth);
                break;
        }

    }
}

