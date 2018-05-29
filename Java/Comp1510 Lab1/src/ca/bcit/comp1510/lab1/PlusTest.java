/**
 * 
 */
package ca.bcit.comp1510.lab1;

/**
 * Demonstrates the different behaviors of the + operator.
 * 
 * @author John Ham
 * @version 01.17.18
 */
public class PlusTest {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("This is a long string that is the"
                + " concatenation of two shorter strings.");
        System.out.println("The first computer was invented about " + 70 
                + " years ago.");
        
        //the + operator is evaluated from left to right
        System.out.println("8 plus 5 is " + 8 + 5);
        //when a string and number is concatenated, the result is a string.
        System.out.println("8 plus 5 is " + (8 + 5));
        //parenthesis cause the two numbers to be added 
        //before the concatenation.
        System.out.println(8 + 5 + " equals 8 plus 5.");
        //the two numbers are added before the concatenation happens
    }
}
