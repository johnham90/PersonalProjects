/**
 * 
 */
package ca.bcit.comp1510.lab3;

import java.util.Random;

/**
 * Dice
 * Prints out 6 dice outcomes and the sum.
 * @author hamj1
 * @version 2018.01.29
 */
public class Dice {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Random dice = new Random();
        
        int die4 = dice.nextInt(4) + 1;
        System.out.println("Result of 4 sided die : " + die4);
        
        int die6 = dice.nextInt(6) + 1;
        System.out.println("Result of 6 sided die : " + die6);
        
        int die8 = dice.nextInt(8) + 1;
        System.out.println("Result of 8 sided die : " + die8);
        
        int die10 = dice.nextInt(10) + 1;
        System.out.println("Result of 10 sided die : " + die10);
        
        int die12 = dice.nextInt(12) + 1;
        System.out.println("Result of 12 sided die : " + die12);
        
        int die20 = dice.nextInt(20) + 1;
        System.out.println("Result of 20 sided die : " + die20);
        
        System.out.println("The sum of the six dice is : " 
                + (die4 + die6 + die8 + die10 + die12 + die20));
    }

}
