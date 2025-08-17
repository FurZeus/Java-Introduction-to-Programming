package Week3;
import java.util.Scanner;
public class If_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first_num = sc.nextInt();
        System.out.println("Enter second number: ");
        int second_num = sc.nextInt();

        if (first_num < second_num) {
            System.out.println(first_num + " is less than " + second_num);
        }
        else if (first_num > second_num) {
            System.out.println(first_num + " is greater than " + second_num);
        }
        else{
            System.out.println(first_num + " is equal to " + second_num);
        }
    }
}
