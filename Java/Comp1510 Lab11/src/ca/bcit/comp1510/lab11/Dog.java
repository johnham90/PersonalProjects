package ca.bcit.comp1510.lab11;

/**
 * Dog represents a dog.
 *
 * @author John Ham
 * @version 2018
 */
public abstract class Dog {
    /** Name of dog. */
    protected final String name;
    
    /**
     * Constructs an object of type Dog.
     *
     * @param name
     *          string containing name
     */
    public Dog(String name) {
        if (name.trim().isEmpty()) {
            throw new NullPointerException();
        }
        this.name = name;
    }
    
    /**
     * Returns the name.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns what the dog says.
     * 
     * @return
     *      string
     */
    public String speak() {
        return "WOOF!";
    }
    
    /**
     * The average weight of the breed.
     * 
     * @return integer for weight
     */
    public abstract double averageBreedWeightKG();
    
    /**
     * Compares an object to see if it is equals to the dog.
     * 
     * @see java.lang.Object#equals(java.lang.Object)
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
        Dog otherDog = (Dog) other;
        return name.equals(otherDog.getName());
    }
    
    /**
     * Returns string containing name of the dog. 
     * 
     * @see java.lang.Object#toString()
     * @return name
     */
    public String toString() {
        return "Dog [Name : " + name + "]";
    }
}
