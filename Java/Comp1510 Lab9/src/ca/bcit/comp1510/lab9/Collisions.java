/**
 * 
 */
package ca.bcit.comp1510.lab9;

/**
 * Collisions runs two instances of the RandomWalker class until they are at
 * the same position or reaches the maximum steps or boundary.
 * 
 * @author John Ham
 * @version 1.0
 */
public class Collisions {
    
    /**
     * Checks whether two RandomWalker class have the same x and y coordinates.
     * @param one
     *          A RandomWalker class to compare.
     * @param two
     *          A RandomWalker class to compare.
     * @return Boolean value depending on whether the x and y coordinates 
     *          are the same.
     */
    public static boolean samePos(RandomWalker one, RandomWalker two) {
        return one.getXCoor() == two.getXCoor() 
                && one.getYCoor() == two.getYCoor();
    }
    
    /**
     * Drives the program.
     * 
     * @param args
     *          Unused.
     */
    public static void main(String[] args) {
        final int max = 1000000;
        final int boundary = 2000000;
        final int x = 3;
        int collisions = 0;
        
        RandomWalker robot = new RandomWalker(max, boundary, -x, 0);
        RandomWalker robot2 = new RandomWalker(max, boundary, x, 0);
        
        for (int i = 0; i < max; i++) {
            robot.takeStep();
            robot2.takeStep();
            if (samePos(robot, robot2)) {
                collisions++;
            }
        }
        
        System.out.println("The number of collisions is " + collisions + ".\n" 
                    + robot.getMaxDistance());
        
    }

}
