import java.util.*; //for taking input using Scanner class Object

public class NumberGuessingGame {
    static String name;    //declared globally to be used in all methods
    static int n;
    static int randomNum;
    static Scanner sc= new Scanner(System.in);


    public static void main (String[] args) {
        System.out.println();
        Random rand = new Random(); //to generate a random number
        System.out.println("\tWelcome to the number guessing game\t");
        randomNum = rand.nextInt(100) + 1; //the range of the random number
        game(); //static method call
        System.out.println("The number was "+randomNum);
    }

    public static void exit(){
        System.exit(0); //exits
    }

   public static void game(){


       System.out.println("Enter your name: ");
       name=sc.next();
       int lives = 5; //how many turns till you have to start again
       while(lives!=0) {

           System.out.println("Enter your guess: ");
           n = sc.nextInt();
           System.out.println(name + " guessed " + n);


           if(n==randomNum){
               System.out.println("HURRAY!!! you win, The number was"+ randomNum);
               exit(); //exit static method called
           } else if (n>randomNum) {
               System.out.println("The number is higher!! TRY AGAIN"); //if guessed number is larger than the random number
               lives--; //decrease life by one
           }
           else{
               System.out.println("The number is lower!! TRY AGAIN"); //if guessed number is lower than the random number
               lives--;//decrease life by one



           }

       }
   }
}
