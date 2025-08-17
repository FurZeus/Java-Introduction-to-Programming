package Week7;
import java.util.Scanner;
public class path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        Path(n);
        System.out.println();
        reversePath(n);
    }
    public static void Path(int k){
        for(int i = 1 ; i<=k ;i++){
            for (int j=i ; j<=k ;j++){
                System.out.print(j + "  ");
            }
            System.out.println();
            for(int m =0;m<i;m++){
                System.out.print(" ");
            }
        }
    }
    public static void reversePath(int k){
        for(int i = k ; i>0 ;i--){
            for(int m =1;m<i;m++){
                System.out.print(" ");
            }
            for (int j=i ; j<=k ;j++){
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}
