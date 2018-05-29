/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.Scanner;

/**
 * DrunkWalker simulates a number of random walkers. A number is asked for the
 * maximum number of steps the walker can take, the boundary, and the number of
 * walkers. The walker walks until it walks out of the boundary or reaches the
 * maximum number of steps. The result is printed out.
 * 
 * @author John Ham
 * @version 1.0
 */
public class DrunkWalker {

    /**
     * Runs the program.
     * 
     * @param args
     *          Unused.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer for the maximum number of "
                + "steps the drunk walker will take and the boundary separated"
                + "by spaces : ");
        int maxSteps = scan.nextInt();
        int boundary = scan.nextInt();
        
        System.out.println("Please enter an integer for how many drunk walkers"
                + " there are :");
        int numDrunk = scan.nextInt();
        int falls = 0;
        
        for (int i = 1; i <= numDrunk; i++) {
            RandomWalker drunk = new RandomWalker(maxSteps, boundary);
            drunk.walk();
            if (!drunk.inBounds()) {
                falls++;
            }
        }
        
        System.out.println("The number of drunk walkers that fell were " 
                    + falls);
        
        scan.close();
    }

}
