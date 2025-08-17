package Week9;
import java.util.Scanner;
import java.util.Arrays;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the search value: ");
        int searchValue = sc.nextInt();
        System.out.print("Enter the replacement value: ");
        int replacementValue = sc.nextInt();
        int arr[] = {3, 76, 53, 45, 87, 90, 12, 33, 24, 48, 62};
        Arrays.sort(arr);
        int index = BinarySearch(arr, searchValue);
        if (index != -1) {
            arr[index] = replacementValue;
            System.out.println("Replacement successful!");
        } else {
            System.out.println("Value not found.");
        }
        System.out.print("Updated Array: " + Arrays.toString(arr));
    }
    public static int BinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}