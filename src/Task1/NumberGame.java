package Task1;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(10);
        System.out.println("Try to guess the number!");
        int guessednumber;
        int gameCounter = 0;
        int score = 0;

        do {
            guessednumber = getNumberFromUser();
            gameCounter++;
            if (guessednumber == secretNumber) {
                System.out.println("Congratulation! You found it with " + gameCounter + " attempts!");
                score++;
                break;
            }
            if (guessednumber > secretNumber) {
                System.out.println("Too high!");
            } else if (guessednumber < secretNumber) {
                System.out.println("Too low!");
            }
        }
        while(true) ;
        System.out.println("Your score: " +score + "/" +gameCounter);
    }
    //creating a method for getting number from user
    public static int getNumberFromUser (){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
}


