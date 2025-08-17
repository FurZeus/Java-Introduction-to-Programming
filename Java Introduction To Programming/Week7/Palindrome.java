package Week7;


import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        boolean isPalindrome = palindrome(s);
        if (isPalindrome) {
            System.out.println("Yes. The String is a palindrome.");
        }
        else {
            System.out.println("No. The String is not a palindrome.");
        }
    }
    public static boolean palindrome(String word) {
        int length = word.length();
        word = word.toLowerCase();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}