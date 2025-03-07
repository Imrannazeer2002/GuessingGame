package Github;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rand =new Random();
        int randomnumber = rand.nextInt(100)-1;
        int guess;
        int guessnum=0;
        boolean correct = false;

        System.out.println("Enter a number between 1 to 100");

        while (!correct) {
            guess=sc.nextInt();
            guessnum++;
            if(guess==randomnumber){
                System.out.println("good you guessed correct "+guessnum+" number");
            }else if(guess<randomnumber){
                    System.out.println("the value is to low ");
            }else{
                System.out.println("the value is to high");

            }
        }
    }
}
