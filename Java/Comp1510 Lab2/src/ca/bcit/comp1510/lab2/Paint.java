/**
 * 
 */
package ca.bcit.comp1510.lab2;

import java.util.Scanner;

/**
 * Determines how many cans are needed to paint a room.
 * @author hamj1
 * @version 01.22.2018
 */
public class Paint {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int COVERAGE = 400;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter the length of the room in feet : ");
        double length = myScanner.nextDouble();
        
        System.out.println("Enter the width of the room in feet : ");
        double width = myScanner.nextDouble();
        
        System.out.println("Enter the height of the room in feet : ");
        double height = myScanner.nextDouble();
        
        System.out.println("Enter the number of coats : ");
        int coats = myScanner.nextInt();
        
        double surfaceArea = (length + width) * height * 2 + length * width;
        double coverageNeeded = surfaceArea * coats;
        double cansOfPaintNeeded = coverageNeeded / COVERAGE;
        
        int cansOfPaintToBuy = (int) Math.ceil(cansOfPaintNeeded);
        
        System.out.println("You will use " + cansOfPaintNeeded 
                + " cans of paint, so you will need to buy "
                + cansOfPaintToBuy + " cans of paint.");
        
        myScanner.close(); // loss of resources until when?
    }

}
