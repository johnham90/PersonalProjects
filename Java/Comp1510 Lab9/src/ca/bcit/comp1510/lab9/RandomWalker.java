/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.Random;

/**
 * RandomWalker represents a random walker with maximum number of steps to
 * take, how far the walker can walk from the origin, x and y coordinates
 * for its current position, current number of steps, and the maximum 
 * distance the walker was from the origin.
 * 
 * @author John Ham
 * @version 1.0
 */
public class RandomWalker {
    
    /** Maximum steps the walker can take.*/
    private int maxSteps;
    
    /** Maximum distance the walker can be from its origin.*/
    private int boundary;
    
    /** The x coordinate of the walker's current position. */
    private int xCoor;
    
    /** The y coordinate of the walker's current position. */
    private int yCoor;
    
    /** The number of steps the walker has taken. */
    private int steps;
    
    /** The maximum distance the walker was from the origin. */
    private int maxDistance;
    
    /**
     * Constructs a RandomWalker object by defining the maximum number of steps
     * the walker can take and how far the walker can be from the origin. The x
     * and y coordinates are set to 0 (the origin) and the number of steps and
     * maximum distance the walker was from the origin is set to 0.
     * 
     * @param maxSteps
     *          Integer value for the maximum steps the walker can take.
     * @param boundary
     *          Integer value for how far the walker can be from the origin.
     */
    public RandomWalker(int maxSteps, int boundary) {
        this.maxSteps = maxSteps;
        this.boundary = boundary;
        xCoor = 0;
        yCoor = 0;
        steps = 0;
        maxDistance = 0;
    }
    
    /**
     * Constructs a RandomWalker object by defining the maximum number of steps
     * the walker can take, how far the walker can be from the origin, and the
     * current position of the walker, set by x and y coordinates. The number 
     * of steps and maximum distance the walker was from the origin is set to 0.
     * 
     * @param maxSteps
     *          Integer value for the maximum steps the walker can take.
     * @param boundary
     *          Integer value for how far the walker can be from the origin.
     * @param xCoor
     *          Integer value for the x coordinate of the walker.
     * @param yCoor
     *          Integer value for the y coordinate of the walker.
     */
    public RandomWalker(int maxSteps, int boundary, int xCoor, int yCoor) {
        this.maxSteps = maxSteps;
        this.boundary = boundary;
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        steps = 0;
        maxDistance = 0;
    }
    
    /**
     * Returns the current x coordinate of the walker.
     * 
     * @return Integer value containing x coordinate of walker.
     */
    public int getXCoor() {
        return xCoor;
    }
    
    /**
     * Returns the current y coordinate of the walker.
     * 
     * @return Integer value containing y coordinate of walker. 
     */
    public int getYCoor() {
        return yCoor;
    }
    
    /**
     * Returns the maximum distance the walker was from the origin.
     * 
     * @return String containing the maximum distance.
     */
    public String getMaxDistance() {
        return "The maximum distance between the where the robot was "
                + "and the origin is " + maxDistance;
    }
    
    /**
     * Checks two integer values and returns the larger integer.
     * 
     * @param firstNum
     *          Integer value. 
     * @param secondNum
     *          Integer value.
     * @return Integer value containing the larger integer.
     */
    private int max(int firstNum, int secondNum) {
        return firstNum > secondNum ? firstNum : secondNum;
//        if (firstNum >= secondNum) {
//            return firstNum;
//        } else {
//            return secondNum;
//        }
    }
    
    /**
     * Makes the walker walk one step in a random direction and increments the 
     * number of steps the walker has taken by 1.
     */
    public void takeStep() {
        if (inBounds() && moreSteps()) {
            final int directions = 4;
            final int up = 0;
            final int right = 1;
            final int down = 2;
            final int left = 3;
            Random rng = new Random();
            int go = rng.nextInt(directions);
            
            switch (go) {
            case up : 
                yCoor += 1;
                break;
            case right :
                xCoor += 1;
                break;
            case down :
                yCoor -= 1;
                break;
            case left :
                xCoor -= 1;
                break;
            default :
            }
            steps++;
        }
        maxDistance = max(maxDistance, max(Math.abs(xCoor), Math.abs(yCoor))); 
    }
    
    /**
     * Returns whether the walker has not walked more than the maximum number 
     * of steps allowed.
     * 
     * @return Boolean value for whether steps taken is less than max.
     */
    public boolean moreSteps() {
        return steps < maxSteps;
    }
    
    /**
     * Returns whether the walker is within the boundary allowed.
     * 
     * @return Boolean value for whether the walker is within bounds.
     */
    public boolean inBounds() {
        return xCoor <= boundary && xCoor >= -boundary 
                && yCoor <= boundary && yCoor >= -boundary;
    }
    
    /**
     * Makes the walker continue to take steps until it walks out of the 
     * boundary or reaches the maximum number of steps.
     */
    public void walk() {
        while (inBounds() && moreSteps()) {
            takeStep();
        }
    }
    
    /**
     * Returns the x and y coordinates and the number of steps taken.
     * 
     * @return X and y coordinates and steps taken as a string. 
     */
    public String toString() {
        return "Robot [X Coordinate : " + xCoor + " Y Coordinate : " + yCoor 
                + " Steps Taken : " + steps + "]";
    }
}
