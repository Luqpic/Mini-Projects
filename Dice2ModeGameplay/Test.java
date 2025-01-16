/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dice2ModeGameplay;

/**
Create a Dice game. The first dice game allows the player to roll two dices each time.
* 
If both dice is equal, the player can roll again. The player score each time they roll the
dices. Player that reaches 100 points or more wins the game. 
* 
* The second dice game allows the player to roll one dice each time. When the dice is 6, the player can roll
one more time. However, if the player rolls 6 again in second attempt, the player
won’t have any score. Player that reaches 100 point wins the game. 
* 
* If the player scores more than 100, the last score is not counted and the player needs to roll again
in next turn. 
* 
* Create a Tester class to test the program. 
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Game1 One = new Game1();
        Game2 Two = new Game2();

        boolean mode1Played = false; // Tracks if Mode 1 has been played
        boolean mode2Played = false; // Tracks if Mode 2 has been played

        while (true) {
            System.out.println("Which mode would you like to play?");
            System.out.println("1. Mode 1 (Roll again if both dice are equal)");
            System.out.println("2. Mode 2 (Roll again if dice equates to 6)");
            System.out.println("3. Exit");
            System.out.print("> ");
            int choice = read.nextInt();

            switch (choice) {
                case 1:
                    if (mode1Played) {
                        System.out.println("Mode 1 has already been played. Please choose another mode.\n");
                    } else {
                        System.out.println("Mode 1 Gameplay: \n");
                        One.gameplay();
                        mode1Played = true; // Mark Mode 1 as played
                    }
                    break;
                case 2:
                    if (mode2Played) {
                        System.out.println("Mode 2 has already been played. Please choose another mode.\n");
                    } else {
                        System.out.println("Mode 2 Gameplay: \n");
                        Two.gameplay();
                        mode2Played = true; // Mark Mode 2 as played
                    }
                    break;
                case 3:
                    System.out.println("Exiting the game. Goodbye!");
                    read.close(); 
                    return; 
                default:
                    System.out.println("Please enter a valid mode (1, 2, or 3).\n");
                    break;
            }

            // Check if both modes have been played
            if (mode1Played && mode2Played) {
                System.out.println("Both modes have been played. Exiting the game. Goodbye!");
                read.close(); 
                return; 
            }

        }
    }
}