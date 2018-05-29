package ca.bcit.comp1510.lab11;

/**
 * Labrador represents a labrador.
 *
 * @author John Ham
 * @version 2018
 */
public class Labrador extends Dog {

    /** Integer holding average weight of labradors. */
    private static final int LABRADOR_WEIGHT = 35;
    
    /** String for color. */
    private String color;
    
    /**
     * Constructs an object of type Labrador.
     *
     * @param name
     *          string for name
     * @param color
     *          string for color
     */
    public Labrador(String name, String color) {
        super(name);
        if (color.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a color.");
        }
        this.color = color;
    }
    
    /**
     * Returns the color of the labrador.
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Returns what the labrador says.
     * 
     * @see ca.bcit.comp1510.lab11.Dog#speak()
     * @return string
     */
    public String speak() {
        return "BOW WOW!";
    }
    
    /**
     * Returns the average weight of labradors.
     * 
     * @see ca.bcit.comp1510.lab11.Dog#averageBreedWeightKG()
     * @return integer
     */
    public double averageBreedWeightKG() {
        return LABRADOR_WEIGHT;
    }
    
    /**
     * Checks if an object is the same Labrador.
     * 
     * @param other
     *          Object
     * @return boolean
     */
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!this.getClass().equals(other.getClass())) {
            return false;
        }
        Labrador otherLab = (Labrador) other;
        return name.equals(otherLab.getName());
    }
    
    /**
     * Returns string containing the name and color of the labrador.
     * 
     * @see ca.bcit.comp1510.lab11.Dog#toString()
     * @return string
     */
    public String toString() {
        return "Labrador [Name : " + super.name + " Color : " + color + "]";
    }
}
