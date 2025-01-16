/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

public class Game2 extends Game {
    
    @Override
    public void round() {
        int sum = 0;
        int firstRoll, secondRoll, thirdRoll;
        
        firstRoll = dice.rollDice();
        System.out.println("Player " + currentPlayer.id + " rolled " + firstRoll);
        sum = firstRoll;
        
        if (firstRoll == 6) {
            secondRoll = dice.rollDice();
            System.out.println("Player " + currentPlayer.id + " rolled another " + secondRoll);
            
            if (secondRoll == 6) {
                System.out.println("No points is counted");
                
            } else {
                sum += secondRoll;
            }
        }
        
            currentPlayer.addPoints(sum);
            System.out.println("The Player now has a total of " + currentPlayer.getTotalPoints() + " points");
    }
}
