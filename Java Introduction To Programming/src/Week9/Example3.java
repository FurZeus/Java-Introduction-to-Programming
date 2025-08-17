package Week9;

import java.util.Arrays;
public class Example3 {
    public static void main(String[] args) {
        int arr[] = {47, 15, 55, 72, 93, 15, 72, 12, 6, 15};
        SelectionSort(arr);
        int [] finalArray = RemoveDuplicates(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr));
        System.out.println("Array without the dublicates : " + Arrays.toString(finalArray));
    }
    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static int[] RemoveDuplicates(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = arr[i];
            } else {
                result[i] = 0;
            }
        }
        return result;
    }
}