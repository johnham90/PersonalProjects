package ca.bcit.comp1510.lab11;

/**
 * Ostrich represents an ostrich.
 *
 * @author John Ham
 * @version 2018
 */
public class Ostrich extends Bird implements Terrestrial {
    
    /**
     * Constructs an object of type Ostrich.
     *
     * @param age
     *          integer for age
     * @param featherColor
     *          string for feather color
     */
    public Ostrich(int age, String featherColor) {
        super(featherColor);
        this.age = age;
    }
    
    @Override
    public void run() {
        System.out.println("Look at how fast I lope across the savannah");
    }

    @Override
    void eat() {
        System.out.println("Watch me gobble up these lizards yum yum!");
    }

    @Override
    void move() {
        run();
    }
}
