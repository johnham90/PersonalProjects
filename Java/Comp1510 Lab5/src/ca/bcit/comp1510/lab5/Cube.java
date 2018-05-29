/**
 * 
 */
package ca.bcit.comp1510.lab5;

/**
 * Cube takes in double values for x, y, z coordinates and length of the edge
 * of a cube and calculates and prints out the volume, surface area, face
 * diagonal, and space diagonal of the cube.
 * @author John Ham
 * @version 1.0
 */
public class Cube {
    /** x coordinate. */
    private double xCoor;
    /** y coordinate. */
    private double yCoor;
    /** z coordinate. */
    private double zCoor;
    /** Length of edge. */
    private double edge;
    
    /**
     * Constructs a cube object by defining the x, y, z coordinates and 
     * length of an edge.
     * @param xCoor
     *          x coordinate.
     * @param yCoor
     *          y coordinate.
     * @param zCoor
     *          z coordinate.
     * @param edge
     *          Length of edge.
     */
    public Cube(double xCoor, double yCoor, double zCoor, double edge) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        this.zCoor = zCoor;
        this.edge = edge;
    }
    
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
     * Sets a new edge.
     * @param edge
     *          New edge.
     */
    public void setEdge(double edge) {
        this.edge = edge;
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
     * Returns the edge.
     * @return edge
     */
    public double getEdge() {
        return edge;
    }
    
    /**
     * Calculates and returns the surface area of the cube.
     * @return surfaceArea
     */
    public double surfaceArea() {
        // 6?
        final double sides = 6.0;
        return sides * edge * edge;
    }
    /**
     * Calculates and returns the volume of the cube.
     * @return volume
     */
    public double volume() {
        return edge * edge * edge;
    }
    /**
     * Calculates and returns the face diagonal of the cube.
     * @return faceDiagonal
     */
    public double faceDiagonal() {
        final double root2 = Math.sqrt(2);
        return root2 * edge;
    }
    /**
     * Calculates and returns the space diagonal of the cube.
     * @return spaceDiagonal
     */
    public double spaceDiagonal() {
        final double root3 = Math.sqrt(3);
        return root3 * edge;
    }
    
    /**
     * Returns information on user input.
     * @return String detailing the x, y, z coordinates and edge
     */
    public String toString() {
        return ("Cube [X Coordinate : " + xCoor + "\nY Coordinate : " + yCoor
                + "\nZ Coordinate : " + zCoor + "\nEdge : " + edge + "]");
    }
}
