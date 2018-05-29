package q4;

import java.util.Scanner;

/**
 * <p>Cube takes in a double value, calculates the volume and surface area
 * of a cube that has the input value as the length of a side, and prints
 * out the volume and surface area.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class Cube {

    /**
     * Constant for the number of sides of a cube.
     */
    static final int SIDES = 6;

    /**
     * <p>Drives the program.</p>
     *
     * @param args
     *          unused.
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a value for "
                + "the length of a cube's side : ");
        // Variable for storing user input for length of a side.
        double side = userInput.nextDouble();

        // Variable for storing the volume of the cube.
        double volume = side * side * side;
        // Variable for storing the surface area of the cube.
        double surfaceArea = side * side * SIDES;

        System.out.println("The cube's volume is " + volume
                + " and the cube's surface area is " + surfaceArea);

        userInput.close();
    }

};
