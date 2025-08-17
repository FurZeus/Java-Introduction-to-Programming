package Week9;

import java.util.Arrays;
public class Example4 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10, 12, 14, 16};
        reverseArr(a);
        System.out.println("Reversed array is : ");
        System.out.println(Arrays.toString(a));
    }
    public static int[] reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
}