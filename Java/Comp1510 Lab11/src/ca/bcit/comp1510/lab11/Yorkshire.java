package ca.bcit.comp1510.lab11;

/**
 * Yorkshire represents a yorkshire.
 *
 * @author John Ham
 * @version 2018
 */
public class Yorkshire extends Dog {
    
    /** Integer for average weight of yorkshire. */
    private static final int YORKSHIRE_WEIGHT = 4;
    
    /** Boolean value for whether yorkshire is a ratter. */
    private boolean ratter;
    
    /**
     * Constructs an object of type Yorkshire.
     *
     * @param name
     *          string containing name
     * @param ratter
     *          boolean for whether yorkshire is a ratter
     */
    public Yorkshire(String name, boolean ratter) {
        super(name);
        this.ratter = ratter;
    }
    
    /**
     * Return whether yorkshire is a ratter.
     * 
     * @return boolean value
     */
    public boolean getRatter() {
        return ratter;
    }
    
    /**
     * Returns what the yorkshire says.
     * 
     * @see ca.bcit.comp1510.lab11.Dog#speak()
     * @return string
     */
    public String speak() {
        return "YAPYAPYAP!";
    }
    
    /**
     * Returns the average weight of yorkshires.
     * 
     * @see ca.bcit.comp1510.lab11.Dog#averageBreedWeightKG()
     * @return integer
     */
    public double averageBreedWeightKG() {
        return YORKSHIRE_WEIGHT;
    }
    
    /**
     * Checks whether the object and the yorkshire is the same.
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
        Yorkshire otherYork = (Yorkshire) other;
        return name.equals(otherYork.getName());
    }
    
    /**
     * Returns a string containing the name of the dog and whether it is a 
     * ratter.
     * 
     * @see ca.bcit.comp1510.lab11.Dog#toString()
     * @return string
     */
    public String toString() {
        return "Yorkshire [Name : " + super.name + " Ratter : " + ratter + "]";
    }
}
