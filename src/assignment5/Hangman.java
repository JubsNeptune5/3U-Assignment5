/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 * Hang man game
 *
 * @author laveh2107
 */
public class Hangman {

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
        //set to lowercase
        word = word.toLowerCase();

        //Set spaces for p2 not to see
        System.out.println("Wait until the word isn't visable before handing over device to player 2");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //Let p2 know it's thier turn
        System.out.println("Player 2, it's your change to guess your friend's word!");

        //Create a counter for lives in the game
        for (int x = 6; x > 0; x = x + 0) {
            //say persons lives
            System.out.println("You have " + x + " lives left");

            //Have p2 enter a letter
            System.out.println("Please enter your first guess.");
            String guess = input.nextLine();

            //make the guess a character
            char letter = guess.charAt(0);
            
            
            
            


        }

    }
}
