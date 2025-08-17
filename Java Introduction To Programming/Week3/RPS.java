package Week3;
import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your move");
        System.out.println("scissor (0), rock (1), paper (2): ");
        int computer = (int) (Math.random() * 3);
        int move = sc.nextInt();

        if (move < 0 || move >= 3 ) {
            System.out.println("Invalid input. Please enter 0, 1, or 2.");
        }
        else{
            switch (move) {
                case 0:
                    if (computer == 0){
                        System.out.println("The computer is scissor. You are scissor. You draw ");
                    }
                    else if (computer == 1){
                        System.out.println("The computer is rock. You are scissor. You lose ");

                    }
                    else {
                        System.out.println("The computer is paper. You are scissor. You won ");
                    }break;
                case 1:
                    if (computer == 0){
                        System.out.println("The computer is scissor. You are rock. You won ");
                    }
                    else if (computer == 1){
                        System.out.println("The computer is rock. You are rock. You draw ");
                    }
                    else {
                        System.out.println("The computer is paper. You are rock. You lose ");
                    }break;
                case 2:
                    if (computer == 0){
                        System.out.println("The computer is scissor. You are paper. You lose ");
                    }
                    else if (computer == 1){
                        System.out.println("The computer is rock. You are paper. You won ");
                    }
                    else {
                        System.out.println("The computer is paper. You are paper. You draw ");
                    }break;
            }
        }
    }
}
