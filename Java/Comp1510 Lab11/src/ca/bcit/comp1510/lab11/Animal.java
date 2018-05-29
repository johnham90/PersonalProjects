package ca.bcit.comp1510.lab11;

/**
 * Animal represents an animal.
 *
 * @author John Ham
 * @version 2018
 */
public abstract class Animal {
    
    /**
     * Age.
     */
    protected int age;
    
    /**
     * Eating.
     */
    abstract void eat();

    /**
     * Moving.
     */
    abstract void move();
}
