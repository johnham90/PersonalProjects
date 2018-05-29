package q4;

/**
 * <p>Box represents a box with methods to get and set each of its 
 * variables.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class Box {
    /**
     * Variable for storing height.
     */
    private double height;
    /**
     * Variable for storing width.
     */
    private double width;
    /**
     * Variable for storing depth.
     */
    private double depth;
    /**
     * Boolean variable for storing whether box is full or not.
     */
    private boolean full;
    
    /**
     * Constructs the Box class by defining the height, width, and depth. The
     * full variable for Box is not set as it is false by default.
     * @param height
     *          Double value of height.
     * @param width
     *          Double value of width.
     * @param depth
     *          Double value of depth.
     */
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    /**
     * Returns the height value.
     * @return Current value of height.
     */
    public double getHeight() {
        return height;
    }
    /**
     * Sets a new height.
     * @param height
     *          New double value of height.
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * Returns the width value.
     * @return Current value of width.
     */
    public double getWidth() {
        return width;
    }
    /**
     * Sets a new width value.
     * @param width
     *          New double value of width.
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * Returns the depth value.
     * @return Current value of depth.
     */
    public double getDepth() {
        return depth;
    }
    /**
     * Sets a new depth value.
     * @param depth
     *          New double value of depth.
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }
    /**
     * Returns the full value.
     * @return Current value of full
     */
    public boolean getFull() {
        return full;
    }
    /**
     * Sets a new full value.
     * @param full
     *          New boolean value of full.
     */
    public void setFull(boolean full) {
        this.full = full;
    }
    
    /**
     * Prints out the height, width, depth, and full values.
     * @return Height, width, depth, and full value of the box as a string.
     */
    public String toString() {
        return "Box [Height : " + height + " Width : " + width + " Depth : " 
                + depth + " Full : " + full + "]";
    }
};
