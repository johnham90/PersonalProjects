/**
 * 
 */
package ca.bcit.comp1510.lab3;

import java.util.Random;

/**
 * CardGame 
 * enumerations.
 * @author hamj1
 * @version 2018.01.29
 */
public class CardGame {
    /**
     * Enumeration of cards Ace to six.
     */
    enum Rank { ACE, ONE, TWO, THREE, FOUR, FIVE, SIX, 
    /**
     * Enumeration of cards seven to king.
     * Enum???
     */
            SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING };
    
    /**
     * Enumeration of suits hearts to spades.
     */
    enum Suit { HEARTS, DIAMONDS, CLUBS, SPADES };
   
    /**
     * Drives the program.
     * @param args unused
     */
    
    public static void main(String[] args) {
        Random cardGenerator = new Random();
        
        int randomRankChoice = cardGenerator.nextInt(Rank.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];
        
        int randomSuitChoice = cardGenerator.nextInt(Suit.values().length);
        Suit randomSuit = Suit.values()[randomSuitChoice];
        
        System.out.println("You have pulled out a " + randomRank 
                + " of " + randomSuit);
    }
}
