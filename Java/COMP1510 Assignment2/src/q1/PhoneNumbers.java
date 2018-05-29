package q1;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * <p>PhoneNumbers generates a random 10 digit phone number. The first three
 * digits do not have an 8 or a 9 and the next three digits are not greater
 * than 635.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class PhoneNumbers {
    /**
     * Constant for first three digits. 
     */
    static final int EIGHT = 8; 
    /**
     * Constant for second set of three digits.
     */
    static final int MIDDLE = 636;
    /**
     * Constant for last four digits.
     */
    static final int LAST = 10000;
    
    /**
     * <p>Drives the program.</p>
     *
     * @param args 
     *          Unused.
     */
    public static void main(String[] args) {
        DecimalFormat fmtMid = new DecimalFormat("000");
        DecimalFormat fmtLast = new DecimalFormat("0000");
        Random random = new Random();
        
        System.out.println("Random phone number : " + random.nextInt(EIGHT) 
                    + random.nextInt(EIGHT) + random.nextInt(EIGHT) + "-" 
                    + fmtMid.format(random.nextInt(MIDDLE)) + "-" 
                    + fmtLast.format(random.nextInt(LAST)));
    }

};
