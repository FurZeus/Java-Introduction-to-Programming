package Week8;

import java.util.Scanner;
import java.util.Arrays;

public class Example_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array length: ");
        int n = input.nextInt();
        while (n > 10 || n < 1) {
            System.out.println("Invalid number please try again: ");
            n = input.nextInt();
        }
        int[] arr = new int[n];
        System.out.println(FillArr(arr));
    }

    public static String FillArr(int[] arr) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return Arrays.toString(arr);
    }
}