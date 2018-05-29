package q3;

import java.util.Scanner;

/**
 * <p>Arithmetic takes in two double values, calculates the sum, difference,
 * quotient, and product of the two values and prints them out.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class Arithmetic {
    /**
     * <p>Drives the program.</p>
     *
     * @param args
     *          unused.
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter two numbers to calculate "
                + "separated by a space. The numbers will be calculated in"
                + " the order they were put in : ");
        // Variable for storing first user input.
        double x = userInput.nextDouble();
        // Variable for storing second user input.
        double y = userInput.nextDouble();

        System.out.println("The sum of the two numbers is : " + (x + y));
        System.out.println("The difference of the two numbers is : " + (x - y));
        System.out.println("The quotient of the two numbers is : " + (x / y));
        System.out.println("The product of the two numbers is : " + (x * y));

        userInput.close();
    }

};
