/**
 * 
 */
package ca.bcit.comp1510.lab5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * GeometryDriver runs the Sphere, Cube, and Cone classes by taking in input
 * for each class and prints out each of its functions.
 * @author John Ham
 * @version 1.0
 */
public class GeometryDriver {
    /** Constant for how many decimal point to show. */
    static final int DECIMALPOINT = 3;
    /**
     * Drives the program.
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.###");
        NumberFormat nfmt = NumberFormat.getInstance();
        nfmt.setMaximumFractionDigits(DECIMALPOINT);
        
        System.out.println("Please enter the x, y, z coordinates and radius of"
                + " a sphere in order mentioned separated by spaces : ");
        Sphere sphere = new Sphere(myScanner.nextDouble(),
                myScanner.nextDouble(), myScanner.nextDouble(), 
                myScanner.nextDouble());

        System.out.println("The volume of the sphere is : " 
                + fmt.format(sphere.volume()) + "\nThe surface area of the "
                + "sphere is : " + fmt.format(sphere.surfaceArea()));
        System.out.println("The volume of the sphere is : " 
                + nfmt.format(sphere.volume()) + "\nThe surface area of the "
                + "sphere is : " + nfmt.format(sphere.surfaceArea()));

        System.out.println("\nPlease enter the x, y, z coordinates and edge "
                + "length of a cube in order mentioned separated by spaces : ");
        Cube cube = new Cube(myScanner.nextDouble(), myScanner.nextDouble(),
                myScanner.nextDouble(), myScanner.nextDouble());

        System.out.println("The volume of the cube is : " 
                + fmt.format(cube.volume()) + "\nThe surface area of the cube"
                + " is : " + fmt.format(cube.surfaceArea()) + "\nThe face "
                + "diagonal of the cube is : " + fmt.format(cube.faceDiagonal())
                + "\nThe space diagonal of the cube is : " 
                + fmt.format(cube.spaceDiagonal()));
        System.out.println("The volume of the cube is : " 
                + nfmt.format(cube.volume()) + "\nThe surface area of the cube"
                + " is : " + nfmt.format(cube.surfaceArea()) + "\nThe face "
                + "diagonal of the cube is : "
                + nfmt.format(cube.faceDiagonal())
                + "\nThe space diagonal of the cube is : " 
                + nfmt.format(cube.spaceDiagonal()));
        
        System.out.println("\nPlease enter the radius and height of a cone"
                + " in order mentioned separated by spaces : ");
        Cone cone = new Cone(myScanner.nextDouble(), myScanner.nextDouble());
        
        System.out.println("The volume of the cone is : " 
                + fmt.format(cone.volume()) + "\nThe surface area of the cone "
                + "is : " + fmt.format(cone.surfaceArea()) + "\nThe slant "
                + "height of the cone is : " + fmt.format(cone.slantHeight()));
        System.out.println("The volume of the cone is : " 
                + nfmt.format(cone.volume()) + "\nThe surface area of the cone "
                + "is : " + nfmt.format(cone.surfaceArea()) + "\nThe slant "
                + "height of the cone is : " + nfmt.format(cone.slantHeight()));
        
        myScanner.close();
    }

}
