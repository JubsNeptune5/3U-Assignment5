/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author laveh2107
 */
public class HangmanSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //Welcome, and start the game
        System.out.println("Welcome to Hangman!!! Player one, please enter a word.");

        //Set word from p1
        String word = input.nextLine();

        //Set spaces for p2 not to see
        System.out.println("Wait until the word isn't visable before handing over device to player 2");
        //Create for loop with a lot of spaces
        for (int z = 0; z < 50; z++) {
            System.out.println("");
        }

        //Let p2 know it's thier turn
        System.out.println("Player 2, it's your chance to guess your friend's word!");

        //Create a counter for lives in the game
        for (int x = 6; x > 0; x = x + 0) {

            //Get length of the word
            int length = word.length();

            //Make all the characters dashes
            for (int a = 0; a < length; a++) {
                //get the character at position a
                char blank = word.charAt(a);
                //list the alphabet to change any character to dash 
                if (blank == 'q' || blank == 'w' || blank == 'e' || blank == 'r'
                        || blank == 't' || blank == 't' || blank == 'y' || blank == 'u'
                        || blank == 'i' || blank == 'o' || blank == 'p' || blank == 'a'
                        || blank == 's' || blank == 'd' || blank == 'f' || blank == 'g'
                        || blank == 'h' || blank == 'j' || blank == 'k' || blank == 'l'
                        || blank == 'z' || blank == 'x' || blank == 'c' || blank == 'v'
                        || blank == 'b' || blank == 'n' || blank == 'm') {
                    //replace each character with a dash
                    word = word.replace(blank, '-');
                }
            }
            //Let them know of thier life count
            System.out.println("You have " + x + " lives left");
            System.out.println("The current word is " + word);
            
            //tell to give first guess
            System.out.println("please enter your first guess");
            String guess = input.nextLine();

            //make the guess a character
            char letter = guess.charAt(0);

            //change 
            for (int a = 0; a < length; a++) {
            }

        }
    }
}
