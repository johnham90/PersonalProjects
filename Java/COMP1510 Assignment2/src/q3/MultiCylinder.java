package q3;

import java.util.Scanner;

/**
 * <p>MultiCylinder checks whether the Cylinder class is working properly by
 * instantiating two Cylinder objects and using the methods inside the Cylinder
 * class.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class MultiCylinder {
    /**
     * <p>Drives the program.</p>
     *
     * @param args 
     *          Unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the double values for the radius and"
                + " height of the first cylinder separated by spaces : ");
        Cylinder cylinder1 = new Cylinder(scan.nextDouble(), scan.nextDouble());

        System.out.println("Please enter the double values for the radius and"
                + " height of the second cylinder separated by spaces : ");
        Cylinder cylinder2 = new Cylinder(scan.nextDouble(), scan.nextDouble());
        
        System.out.println("First " + cylinder1.toString() 
                + "\nSecond " + cylinder2.toString());
        
        System.out.println();
        
        System.out.println("Please enter new double values for the radius and"
                + " height of the first cylinder separated by spaces : ");
        cylinder1.setRadius(scan.nextDouble());
        cylinder1.setHeight(scan.nextDouble());
        
        System.out.println("Please enter new double values for the radius and"
                + " height of the second cylinder separated by spaces : ");
        cylinder2.setRadius(scan.nextDouble());
        cylinder2.setHeight(scan.nextDouble());

        System.out.println("After modification : " + "\nFirst "
                + cylinder1.toString() + "\nSecond " + cylinder2.toString());
        
        System.out.println();
        
        System.out.println("Cylinder 1 [Volume : " + cylinder1.getVolume() 
                + " Surface area : " + cylinder1.getSurfaceArea()
                + "\nCylinder 2 [Volume : " + cylinder2.getVolume() 
                + " Surface area : " + cylinder2.getSurfaceArea());
        scan.close();
    }
    
};
