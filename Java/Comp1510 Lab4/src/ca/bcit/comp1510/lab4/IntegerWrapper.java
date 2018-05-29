/**
 * 
 */
package ca.bcit.comp1510.lab4;

import java.util.Scanner;

/**
 * Prints out the binary, octal, and hexadecimal interpretation of an integer.
 * Prints out the maximum and minimum possible values of the int primitive.
 * Takes two integers, converts them to Strings, converts the Strings back to
 * integers, then adds them.
 * 
 * @author hamj1
 * @version 2018.02.05
 */
public class IntegerWrapper {

    /**
     * Drives the program.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter an integer value : ");
        Integer int1 = userInput.nextInt();

        System.out.println("The number in binary is : " 
                + Integer.toBinaryString(int1));
        System.out.println("The number in octal is : " 
                + Integer.toOctalString(int1));
        System.out.println("The number in hexadecimal is : " 
                + Integer.toHexString(int1));

        System.out.println("The maximun int value is : " + Integer.MAX_VALUE);
        System.out.println("The maximun int value is : " + Integer.MIN_VALUE);

        System.out.println("Please enter two integers on two lines : ");
        String stringInt1 = userInput.next();
        String stringInt2 = userInput.next();

        System.out.println("The sum of the two numbers is : " 
                + (Integer.parseInt(stringInt1) 
                + Integer.parseInt(stringInt2)));

        userInput.close();
    }

}
