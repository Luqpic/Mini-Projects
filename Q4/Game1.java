/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

public class Game1 extends Game {

    @Override
    public void round() {
        int sum = 0;
        int firstRoll, secondRoll;

        do {
            firstRoll = dice.rollDice();
            secondRoll = dice.rollDice();
            sum += firstRoll + secondRoll;
            System.out.println("Player " + currentPlayer.id + " rolled " + firstRoll + " and " + secondRoll + " with a sum of " + (firstRoll + secondRoll));
        } while (firstRoll == secondRoll);

            currentPlayer.addPoints(sum);
            System.out.println("The Player now has a total of " + currentPlayer.getTotalPoints() + " points");

    }
}