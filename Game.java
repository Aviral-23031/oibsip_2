import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int randomNum = ran.nextInt(100)+1;
        System.out.println("Enter your Guess(1-100): ");
        int number=sc.nextInt();
        if(number==randomNum){
            System.out.println("Bravo!! You win!");
        } else if (number>randomNum) {
            System.out.println("You guessed a higher number, try again :'\' ");
        }
        else {
            System.out.println("Your guess was smaller :'\' ");
        }
    }
}
