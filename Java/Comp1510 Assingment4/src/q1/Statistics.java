package q1;

import java.util.Scanner;

/**
 * <p>Statistics takes in a list of integers and computes and prints the mean
 * and standard deviation of the list.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Statistics {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int intCount = 0;
        final int maxInput = 50;        
        int[] intArray = new int[maxInput];        
        
        while (scan.hasNext()) {
            intArray[intCount] = Integer.parseInt(scan.next());
            intCount++;
        }
        
        double mean = 0;
        
        for (int i = 0; i < intCount; i++) {
            mean += intArray[i];
        }
        mean /= intCount;
        
        System.out.println("The mean is " + mean);
        
        double sd = 0;
        
        for (int i = 0; i < intCount; i++) {
            sd += Math.pow(intArray[i] - mean, 2);
        }
        sd /= intCount - 1;
        sd = Math.sqrt(sd);
        
        System.out.println("The standard deviation is " + sd);
        
        scan.close();
    }

};
