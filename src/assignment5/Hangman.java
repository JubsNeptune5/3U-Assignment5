/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 * Hangman game
 *
 * @author laveh2107
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create counter for lives 
        int tyler = 6;

        //Create counter so one doesn't go the length of the word
        int perry = 1;

        //Create counter for letters that are correct
        int kramer = 0;

        //Create counter to see how many times one guessed
        int whitford = 0;

        //Check if game is done
        boolean isFinished = false;

        //create a scanner
        Scanner input = new Scanner(System.in);

        //Welcome, and start the game
        System.out.println("Welcome to Hangman!!! Player one, please enter a word. NO SPACES.");

        //Set word from p1
        String word = input.nextLine();

        //Change to lower case
        word = word.toLowerCase();

        //Set spaces for p2 not to see
        System.out.println("Wait until the word isn't visable before handing over device to player 2");
        //Create for loop with a lot of spaces
        for (int z = 0; z < 50; z++) {
            System.out.println("");
        }

        //Let p2 know it's thier turn
        System.out.println("Player 2, it's your chance to guess your friend's word!");

        //Create copy of the word to be copied
        String WORD = word;

        //Get length of the word
        int length = WORD.length();

        //Make all the characters dashes
        for (int a = 0; a < length; a++) {
            //Create substring
            String blank1 = WORD.substring(a, a + 1);
            //Make a character the same as blank1
            char blank = blank1.charAt(0);

            //Change all letters to dashes
            WORD = WORD.replace(blank, '-');
        }

        //Create string builder to edit theword with dashes
        StringBuilder jaded = new StringBuilder(WORD);

        while (tyler > 0 && !isFinished) {

            //Let them know of thier life count
            System.out.println("You have " + tyler + " lives left");
            System.out.println("The current word is " + jaded);

            //tell to give first guess
            System.out.println("please enter your first guess");

            //store input as a guess
            String guess = input.nextLine();

            //Change to lower case
            guess = guess.toLowerCase();

            //Guess becomes the first letter if thier guess contained more letters
            char Guess = guess.charAt(0);

            for (int i = 0; i < length;) {
                
                //Sotes the first letter of the word trying to be guessed
                char letter = word.charAt(i);

                //If the guess is correct
                if (letter == Guess) {

                    //Change the dash in the spot of the correct letter to the correct letter
                    jaded.setCharAt(i, Guess);

                    //decrease counter
                    perry--;

                    //Increase number of correct numbers
                    kramer++;
                }
                //Increase counter
                perry++;

                //If the guess is wrong 
                if (perry > length) {
                    //decrese life number
                    tyler--;
                    //Let them know they are wrong
                    System.out.println("You guesseed wrong! you now have " + tyler + " lives left");
                }
                //increase counter to move to the next word
                i++;
                whitford++;
            }

            System.out.println("");

            //reset counter after going through every letter
            perry = 1;

            //Iif the player guesses correct
            if (kramer == length) {
                isFinished = true;
            }

        }
        if (tyler == 0) {

            //tell them they are losers
            System.out.println("Looks like you couldn't guess correctly since you lost!!!!!");
            System.out.println("The word was: " + word);
            System.out.println("Restart the program if you wish to play again");
        
        } else {

            //congragulate the winner
            System.out.println("Congratulations, you win!!!");
            System.out.println("And it only took you: " + whitford + " guesses to guess the word: " + word);
            System.out.println("If you want to beat your score of: " + whitford + ". Restart the program to play again");
        }
    }
}
