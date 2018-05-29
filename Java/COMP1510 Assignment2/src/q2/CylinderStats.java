package q2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <p>CylinderStats takes in a double value input for the radius and height of
 * a cylinder, calculates the the surface area and volume of the cylinder, and
 * prints out the results to four decimal places.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class CylinderStats {
    /**
     * <p>Drives the program.</p>
     *
     * @param args
     *          Unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat(".####");
        
        System.out.println("Enter the double values for the radius and height "
                + "of the cylinder separated by spaces : ");
        double radius = scan.nextDouble();
        double height = scan.nextDouble();
        
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        double volume = Math.PI * radius * radius * height;
        
        System.out.println("Surface area : " + fmt.format(surfaceArea) 
                + "\nVolume : " + fmt.format(volume));
        
        scan.close();
    }

};
