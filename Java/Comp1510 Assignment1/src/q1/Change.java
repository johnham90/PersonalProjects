package q1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <p>Change takes a double value, calculates the fewest number of bills and
 * coins necessary to represent that amount, starting from ten dollar bills to
 * pennies, and prints it out.</p>
 * <p>User is prompted to input a double value. The value is then divided by ten
 * to determine the number of ten dollar bills necessary. The remainder is then
 * divided by five to determine the number of five dollar bills necessary. The
 * process is repeated for two and one dollar coins, quarters, dimes, nickels,
 * and pennies. Each value is rounded down to make it a integer value and is
 * formatted before printing out so they become integers. The result is
 * printed out.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class Change {

    /**
     * Constant for ten dollar bill.
     */
    static final int TEN = 10;
    /**
     * Constant for five dollar bill.
     */
    static final int FIVE = 5;
    /**
     * Constant for quarters.
     */
    static final double QUARTER = 0.25;
    /**
     * Constant for dimes.
     */
    static final double DIME = 0.1;
    /**
     * Constant for nickels.
     */
    static final double NICKEL = 0.05;
    /**
     * Constant for pennies.
     */
    static final double PENNY = 0.01;

    /**
     * <p>Drives the program.</p>
     *
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a value of money : ");
        // Variable for storing user input for money value.
        double money = userInput.nextDouble();

        // Variable for storing number of ten dollar bills.
        double tens = Math.floor(money / TEN);
        // Variable for storing the remainder.
        double leftover = money % TEN;
        // Variable for storing number of five dollar bills.
        double fives = Math.floor(leftover / FIVE);
        leftover = leftover % FIVE;
        // Variable for storing number of two dollar coins.
        double twos = Math.floor(leftover / 2);
        leftover = leftover % 2;
        // Variable for storing number of one dollar coins.
        double ones = Math.floor(leftover / 1);
        leftover = leftover % 1;
        // Variable for storing number of quarters.
        double quarters = Math.floor(leftover / QUARTER);
        leftover = leftover % QUARTER;
        // Variable for storing number of dimes.
        double dimes = Math.floor(leftover / DIME);
        leftover = leftover % DIME;
        // Variable for storing number of nickels.
        double nickels = Math.floor(leftover / NICKEL);
        // Variable for storing number of pennies.
        double pennies = leftover % NICKEL / PENNY;
        DecimalFormat trunc = new DecimalFormat("0");

        System.out.println(trunc.format(tens) + " ten dollar bills\n"
                + trunc.format(fives) + " five dollar bills\n"
                + trunc.format(twos) + " two dollar coins\n"
                + trunc.format(ones) + " one dollar coins\n"
                + trunc.format(quarters) + " quarters\n"
                + trunc.format(dimes) + " dimes\n"
                + trunc.format(nickels) + " nickels\n"
                + trunc.format(pennies) + " pennies");

        userInput.close();
    }

};
