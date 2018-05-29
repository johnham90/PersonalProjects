/**
 * 
 */
package ca.bcit.comp1510.lab2;

import java.util.Scanner;

/**
 * Calculates the circumference and area of a circle.
 * 
 * @author John Ham
 * @version 01.22.2018
 */
public class Circle {
    public static final double PI = 3.1415; // place constant out of method
    /**
     * Drives the program.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        // variables in all caps indicate constant. 
        double radius;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a radius value : ");
        radius = myScanner.nextDouble();
        double doubleRadius = radius * 2;

        double circumference = 2 * PI * radius;
        System.out.println("The circumference of the circle is : " 
                + circumference);

        double area = PI * radius * radius;
        System.out.println("The area of the circle is : " + area);

        double doubleRadiusC = 2 * PI * doubleRadius;
        double doubleRadiusA = PI * doubleRadius * doubleRadius;
        double increaseC = doubleRadiusC / circumference;
        double increaseA = doubleRadiusA / area;
        System.out
                .println("When the radius is doubled, the circumference " 
                        + "is increased by " + increaseC + " times.");
        System.out.println("The area is increased by " + increaseA + " times.");
        
        myScanner.close();
    }

}
