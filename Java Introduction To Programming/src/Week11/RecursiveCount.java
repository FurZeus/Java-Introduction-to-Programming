package Week11;

import java.util.Scanner;
public class RecursiveCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter " + 5 + " elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value to count: ");
        int target = sc.nextInt();

        int count = countOccurrences(arr, 0, target);
        System.out.println("The value " + target + " appears " + count + " times in the array.");
    }

    public static int countOccurrences(int[] arr, int index, int target) {
        if (index == arr.length) {
            return 0;
        }
        int count = (arr[index] == target) ? 1 : 0;
        return count + countOccurrences(arr, index + 1, target);
    }
}