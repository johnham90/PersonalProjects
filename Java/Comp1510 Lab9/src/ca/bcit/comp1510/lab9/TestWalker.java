/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.Scanner;

/**
 * TestWalker tests if the RandomWalker class functions properly.
 * 
 * @author John Ham
 * @version 1.0
 */
public class TestWalker {

    /**
     * Drives the program.
     * 
     * @param args
     *          Unused.
     */
    public static void main(String[] args) {
        final int max = 200;
        final int boundary = 10;
        
        Scanner scan = new Scanner(System.in);
        RandomWalker robot = new RandomWalker(max, boundary);
        System.out.println(robot);
        
        robot.walk();
        System.out.println(robot);
        System.out.println(robot.getMaxDistance());
        scan.close();
    }

}
