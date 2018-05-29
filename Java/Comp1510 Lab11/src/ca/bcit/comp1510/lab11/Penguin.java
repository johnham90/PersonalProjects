package ca.bcit.comp1510.lab11;

/**
 * Penguin represents a penguin.
 *
 * @author John Ham
 * @version 2018
 */
public class Penguin extends Bird implements Aquatic, Terrestrial {
    
    /**
     * Constructs an object of type Penguin.
     *
     * @param age
     *          integer for age
     * @param featherColor
     *          string for feather color
     */
    public Penguin(int age, String featherColor) {
        super(featherColor);
        super.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Splash!");
    }

    @Override
    void eat() {
        System.out.println("I love oily nutritious fish!");
    }

    @Override
    void move() {
        run();
        swim();
    }

    @Override
    public void run() {
        System.out.println("Waddle, waddle, waddle!");
    }
    
}
