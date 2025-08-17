package Week6;
import java.util.Scanner;
public class FindNegativeOddNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (!(number < 0 && number % 2 != 0)) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        }
        System.out.println("Program terminated.");
    }
}