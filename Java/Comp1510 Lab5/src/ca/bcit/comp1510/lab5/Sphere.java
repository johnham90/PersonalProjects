/**
 * 
 */
package ca.bcit.comp1510.lab5;

/**
 * Sphere takes in double values for x, y, z coordinates and radius and
 * calculates and prints the volume and surface area.
 * @author John Ham
 * @version 1.0
 */
public class Sphere {
    /** x coordinate. */
    private double xCoor;
    /** y coordinate. */
    private double yCoor;
    /** z coordinate. */
    private double zCoor;
    /** Length of radius. */
    private double radius;
    
    /**
     * Constructs a sphere object by defining the x, y, z coordinates and
     * radius.
     * @param xCoor
     *          x coordinate.
     * @param yCoor
     *          y coordinate.
     * @param zCoor
     *          z coordinate.
     * @param radius
     *          radius.
     */
    public Sphere(double xCoor, double yCoor, double zCoor, double radius) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        this.zCoor = zCoor;
        this.radius = radius;
    }
    // hides a field?
    /**
     * Sets a new x coordinate.
     * @param newXCoor
     *          New x coordinate.
     */
    public void setXCoor(double newXCoor) {
        this.xCoor = newXCoor;
    }
    /**
     * Sets a new y coordinate.
     * @param newYCoor
     *          New y coordinate.
     */
    public void setYCoor(double newYCoor) {
        this.yCoor = newYCoor;
    }
    /**
     * Sets a new z coordinate.
     * @param newZCoor
     *          New z coordinate.
     */
    public void setZCoor(double newZCoor) {
        this.zCoor = newZCoor;
    }
    /**
     * Sets a new radius.
     * @param radius
     *          New radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Returns the x coordinate.
     * @return xCoor
     */
    public double getXCoor() {
        return xCoor;
    }
    /**
     * Returns the y coordinate.
     * @return yCoor
     */
    public double getYCoor() {
        return yCoor;
    }
    /**
     * Returns the z coordinate.
     * @return zCoor
     */
    public double getZCoor() {
        return zCoor;
    }
    /**
     * Returns the radius.
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculates and returns the surface area.
     * @return surfaceArea as a double
     */
    public double surfaceArea() {
        final double four = 4.0;
        // must be in method?
        return four * Math.PI * radius * radius;
    }
    /**
     * Calculates and returns the volume.
     * @return volume
     */
    public double volume() {
        final double fourThird = 4.0 / 3;
        return fourThird * Math.PI * radius * radius * radius;
    }
    
    /**
     * Returns information on user input.
     * @return String detailing the x, y, z coordinates and radius
     */
    public String toString() {
        return "Sphere [X Coordinate : " + xCoor + "\nY Coordinate : " + yCoor
                + "\nZ Coordinate : " + zCoor + "\nRadius : " + radius + "]";
    }
}
