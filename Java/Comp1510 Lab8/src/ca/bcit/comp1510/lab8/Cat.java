/**
 * 
 */
package ca.bcit.comp1510.lab8;

/**
 * Cat represents a cat.
 * @author John Ham
 * @version 1.0
 */
public class Cat {
    /**
     * Default name for cat if empty name is entered.
     */
    private static final String DEFAULT = "Cleo";
    
    /**
     * Name of the cat. 
     */
    private final String name;
    
    /**
     * Age of the cat as an integer.
     */
    private int age;
    
    /**
     * Constructs a cat object by defining its name and age.
     * @param name
     *          String for name.
     * @param age
     *          Int value for age.
     */
    public Cat(String name, int age) {
        name = name.trim();
        if (name.isEmpty()) {
            this.name = DEFAULT;
        } else {
            this.name = name;
        }
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    
    /**
     * Returns the name of the cat.
     * @return name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the age of the cat.
     * @return age.
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Sets a new age for the cat.
     * @param newAge
     *          New int value for age.
     */
    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }
    
    /**
     * Prints the name and age of the cat.
     * @return Name and age of the cat as a string.
     */
    public String toString() {
        return "Cat [Name : " + name + " Age : " + age + "]";
    }
}
