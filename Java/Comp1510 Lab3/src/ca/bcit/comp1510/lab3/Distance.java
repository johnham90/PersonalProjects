/**
 * 
 */
package ca.bcit.comp1510.lab3;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Distance
 * Calculates distance.
 * @author hamj1
 * @version 2018.01.28
 */
public class Distance {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first x and y coordinates "
                + "separated by a space : ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        
        System.out.println("Please enter the second x and y coordinates"
                + " separated by a space : ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the first point " 
                + "and second point is " + result);
        
        DecimalFormat decimal2 = new DecimalFormat("#.##");
        System.out.println("The distance to two decimal places is " 
                + decimal2.format(result));
        
        scan.close();
    }

}
