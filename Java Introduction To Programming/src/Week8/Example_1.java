package Week8;

public class Example_1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;
        numbers[4] = 25;

        System.out.println("Array Elements:");
        printArray(numbers);
        numbers[2] = 30;
        System.out.println();
        System.out.println("Altered Array Elements:");
        printArray(numbers);
    }

    public static void printArray(int[] array) {
            /*for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }*/
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
