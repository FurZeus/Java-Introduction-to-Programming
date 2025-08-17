package Week5;

import java.util.Scanner;
public class Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: (0-F)");
        String hex = sc.nextLine().toUpperCase();

        if (hex.length() == 1 &&  (hex.charAt(0) >= '0' && hex.charAt(0) <= '9' || hex.charAt(0) >= 'A' && hex.charAt(0) <= 'F')) {
            int decimalValue;
            char hexChar = hex.charAt(0);

            if (hexChar >= '0' && hexChar <= '9') {
                decimalValue = hexChar - '0';
                System.out.println(decimalValue);
            } else {
                decimalValue = hexChar - 'A' + 10;
                System.out.println(decimalValue);

            }
            int bit3 = decimalValue % 2;
            decimalValue = decimalValue / 2;
            System.out.println(decimalValue);
            int bit2 = decimalValue % 2;
            decimalValue = decimalValue / 2;
            System.out.println(decimalValue);
            int bit1 = decimalValue % 2;
            decimalValue = decimalValue / 2;
            System.out.println(decimalValue);
            int bit0 = decimalValue % 2;
            decimalValue = decimalValue / 2;
            System.out.println(decimalValue);
            String binary = bit0 +""+ bit1 + "" + bit2 + "" + bit3;

            System.out.println("Hexadecimal number: " + hexChar  );
            System.out.println("Binary : " + binary );

        }
        else {
            System.out.println("Invalid hexadecimal number");
        }
    }
}