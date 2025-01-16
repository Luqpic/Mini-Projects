/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

import java.util.*;
public class Dice {
    
    public int rollDice() {
        Random ran = new Random();
        int dicePoints = ran.nextInt(1, 7);
        return dicePoints; 
    }
    
    
    
}
