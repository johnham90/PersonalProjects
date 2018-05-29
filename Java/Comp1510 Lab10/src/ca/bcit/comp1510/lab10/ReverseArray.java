package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * ReverseArray takes in integers, puts them into an array, and swaps the 
 * values in reverse.
 *
 * @author John Ham
 * @version 2018
 */
public class ReverseArray {

    /** Array to hold integers. */
    private static int[] intArray;
    
    /**
     * Swaps the value in the first index in an array with the value in the 
     * last index and continues to swap values until the index is at the 
     * center. 
     */
    public static void swap() {
//        int j = 0;
//        int k = 0;
//        
//        for (int i = 0; i < intArray.length / 2; i++) {
//            j = intArray[i];
//            k = intArray[intArray.length - 1 - i];
//            intArray[i] = k;
//            intArray[intArray.length - 1 - i] = j;
//        }
        int change;
        for (int i = 0; i < intArray.length / 2; i++) {
            change = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = change;
        }
    }
    
    /**
     * Drives the program.
     * @param args
     *          Unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter an integer for the number of inputs");
        
        intArray = new int[scan.nextInt()];
        
        System.out.println("Please enter " + intArray.length 
                + " integers to insert into the array.");
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scan.nextInt();
        }
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        
        System.out.println();
        
        swap();
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        
        scan.close();
    }

}
