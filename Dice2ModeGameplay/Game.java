/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dice2ModeGameplay;

public abstract class Game {
    public Player player1;
    public Player player2;
    public Dice dice;
    
    public Player currentPlayer;
    
   public Game() {
       player1 = new Player(1);
       player2 = new Player(2);
       dice = new Dice();
       
       currentPlayer = player1; //Game always starts with player1
   }
   
   public void switchPlayer() { //Switches the player
       if (currentPlayer == player1) {
           currentPlayer = player2;
       } else {
           currentPlayer = player1;
       }
   }
   
   public boolean checkWin() { //Checks the win
       if (player1.getTotalPoints() >= 100) {
           System.out.println("Player " + player1.id + " wins the Game!");
           System.out.println();
           return true;
       } if (player2.getTotalPoints() >= 100) {
           System.out.println("Player " + player2.id + " wins the Game!");
           System.out.println();
           return true;
       }
       return false;
   }
   
   public abstract void round();
   
   
   public void gameplay() {
       while (!checkWin()) { //Loop runs until there's a win
           System.out.println();
           System.out.println("It's Player " + currentPlayer.id + "'s Turn");
           System.out.println();
       
       round(); //Plays the round
       switchPlayer(); //Switches the player
       
       }
   }
    
}
