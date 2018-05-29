package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * ComparePlayers tests the Player class.
 *
 * @author John Ham
 * @version 2018
 */
public class ComparePlayers {

    /**
     * Drives the program.
     * 
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Player[] playerArray = new Player[2];
        
        try {
            Player player = new Player("", "Canucks", 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Player has no name.");
        }
        try {
            Player player = new Player("John", "", 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Player has no team name.");
        }
        try {
            Player player = new Player("John", "Canucks", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Player has incorrect jersey number.");
        }
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter a name, team name, and jersey "
                    + "number separated by strings");
            
            Player player = new Player(scan.next(), scan.next(), 
                    scan.nextInt());
            
            playerArray[i] = player;
        }
        
        System.out.println(playerArray[0].compareTo(playerArray[1]));
        System.out.println(playerArray[0].equals(playerArray[1]));
        
        scan.close();
    }
}
