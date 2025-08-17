package Week8;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};

        System.out.print("Enter the number of elements found in the array: ");

        int valueToFind = input.nextInt();
        boolean found = search(array, valueToFind);

        System.out.println("Is " + valueToFind + " in the array? " + found);
    }
    public static boolean search(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}
