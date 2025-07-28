
import java.util.Random;
import java.util.Scanner;


public class numgus {

    public static void main(String[] args) {
        System.out.println("select any number between 1 to 9");
        System.out.println("If your selected number is mstched to the computer selected number then will \"WIN\"");
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        while(true){
            int ui = sc.nextInt();
            int ci = ran.nextInt(10);
            if (ui == ci) {
                System.out.println("You Won The Game");
            } else {
                System.out.println("You Lost");
            }
            System.out.println("if you want to play again then type \"yes\" else type \"no\"");
            String yn = sc.next();
            if (yn.equals("no")) {
                break;
            }
            else if (yn.equals("yes")) {
                continue;
            }
        }
    }
}