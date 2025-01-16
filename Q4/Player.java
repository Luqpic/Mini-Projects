/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

public class Player {
    private int totalPoints;
    public int id;
    
    public Player(int id) { //Constructs a Player with an attribute of its respective ID & totalPoints
    this.id = id;
    this.totalPoints = 0;
    }
    
    public int getTotalPoints() {
        return totalPoints;
    }
    
    public void addPoints(int points) {
        totalPoints += points;
    }
}
