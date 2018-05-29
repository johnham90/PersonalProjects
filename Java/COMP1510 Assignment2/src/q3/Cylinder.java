package q3;

/**
 * <p>Cylinder represents a cylinder, with methods to get and set each of its
 * variables and calculate surface area and volume.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class Cylinder {
    /** 
     * Variable for storing radius.
     */
    private double radius;
    /**
     * Variable for storing height.
     */
    private double height;
    
    /**
     * Constructs the Cylinder class by defining radius and height.
     * @param radius 
     *          Double value of radius.
     * @param height 
     *          Double value of height.
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    /**
     * Returns the radius value.
     * @return Current value of radius.
     */
    public double getRadius() {
        return radius;
    }
    /**
     * Sets a new double radius value.
     * @param radius
     *          New double value of radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * Returns the height value.
     * @return Current value of height.
     */
    public double getHeight() {
        return height;
    }
    /**
     * Sets a new double height value.
     * @param height
     *          New double value of height.
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Calculates and returns the surface area of the cylinder.
     * @return Double value of surface area of the cylinder.
     */
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    /**
     * Calculates and returns the volume of the cylinder.
     * @return Double value of volume of the cylinder.
     */
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
    
    /**
     * Prints out the radius and height of the cylinder.
     * @return Radius and height value of the cylinder as a string.
     */
    public String toString() {
        return "Cylinder [Radius : " + radius + " Height : " + height + "]";
    }
};
