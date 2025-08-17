package Week9;

import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int diff= Difference(arr);
        System.out.println("The difference between max and min of array is  " + diff );
    }

    public static int Difference(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max - min;
    }
}