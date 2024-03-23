package com.hello_java.Package2;

/*Create a game, which allows a user to play "Guess the number" game once
1.Constructor to generate the random number
2.takeUserInput() to take a user input of number
3.isCorrectNumber() to detect whether the number entered by the user is true
4.getter and setter for noOfGuess
Use properties such as noOfGuesses(int), etc to get this task done!
 */


import java.util.Random;
import java.util.Scanner;

class Game{

    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
       Random random = new Random();
       this.number = random.nextInt(100);
   }
   void takeUserInput(){
       System.out.println("Guess the number");
       Scanner scan = new Scanner(System.in);
       inputNumber = scan.nextInt();
   }
    boolean isCorrectNumber(int num){
        if (num == number){
            return true;
        }
        else if(num<number){
            System.out.println("Too low ...");
        }
        else if (num>number) {
            System.out.println("Too high ...");
        }
        return false;
    }

}

public class guessTheNumber {
    public static void main(String[] args) {

    Game game = new Game();
    game.takeUserInput();
//    boolean b = game.isCorrectNumber();
    }


}

