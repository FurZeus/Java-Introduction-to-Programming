package Week7;
import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");
        int guessNumber = sc.nextInt();
        int number = (int)(Math.random() * 100);
        while (guessNumber != number) {
            guess(guessNumber , number);
            guessNumber = sc.nextInt();

        }
        System.out.println("Congratulations! You guessed the number " + number + "!");
    }
    public static void guess(int n, int m) {
        if (n < m){
            System.out.println(n + " is too low");
        }
        else {
            System.out.println(n + " is too high");
        }
    }
}