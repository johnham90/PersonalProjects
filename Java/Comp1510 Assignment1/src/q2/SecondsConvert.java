package q2;

import java.util.Scanner;

/**
 * <p>SecondsConvert takes an integer value, converts the value into hours,
 * minutes, and seconds in the format hh:mm:ss, and prints it out.</p>
 * <p>User is prompted to input an integer value. The value is then divided
 * by 3600 to determine the number of hours. The remainder is divided by
 * 60 to determine the number of minutes. The remainder determines the
 * of seconds. The result is printed out.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * Constant to calculate seconds into hours.
     */
    static final int HOURINSECONDS = 3600;
    /**
     * Constant to calculate seconds into minutes.
     */
    static final int MINUTEINSECONDS = 60;
    /**
     * <p>Drives the program.</p>
     *
     * @param args
     *          unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter seconds to convert : ");
        // Variable for storing user input.
        int secondsInput = scan.nextInt();
        // Variable for storing number of hours.
        int hours = secondsInput / HOURINSECONDS;
        // Variable for storing number of minutes
        int minutes = secondsInput % HOURINSECONDS / MINUTEINSECONDS;
        // Variable for storing number of seconds
        int seconds = secondsInput % HOURINSECONDS % MINUTEINSECONDS;
        System.out.println(secondsInput + " seconds in hh:mm:ss format is : "
                + hours + ":" + minutes + ":" + seconds);

        scan.close();
    }

};
