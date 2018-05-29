/**
 * 
 */
package ca.bcit.comp1510.lab5;

/**
 * Cone takes in double values for the radius and height of a cone and
 * calculates and prints the volume, slant height, and surface area of the cone.
 * @author John Ham
 * @version 1.0
 */
public class Cone {
    /** Radius. */
    private double radius;
    /** Height. */
    private double height;
    
    /**
     * Constructs a cone object by defining the radius and height.
     * @param radius
     *          Radius
     * @param height
     *          Height
     */
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    /**
     * Sets a new radius.
     * @param radius
     *          Radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * Sets a new height.
     * @param height
     *          Height
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Returns the radius.
     * @return radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * Returns the height.
     * @return height
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Calculates and returns the volume of the cone.
     * @return volume
     */
    public double volume() {
        final double oneThird = 1.0 / 3;
        return oneThird * Math.PI * radius * radius * height;
    }
    /**
     * Calculates and returns the slant height of the cone.
     * @return slantHeight
     */
    public double slantHeight() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return slantHeight;
    }
    /**
     * Calculates and returns the surface area of the cone.
     * @return surfaceArea
     */
    public double surfaceArea() {
        double surfaceArea = Math.PI * radius * radius + Math.PI * radius 
                * (radius * radius + height * height);
        return surfaceArea;
    }
    
    /**
     * Returns information on user input.
     * @return String detailing the radius and height
     */
    public String toString() {
        return ("Cone [Radius : " + radius + "\nHeight : " + height + "]");
    }
}
