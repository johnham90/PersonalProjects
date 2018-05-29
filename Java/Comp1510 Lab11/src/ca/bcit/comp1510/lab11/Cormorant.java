package ca.bcit.comp1510.lab11;

/**
 * Cormorant represents a cormorant.
 *
 * @author John Ham
 * @version 2018
 */
public class Cormorant extends Bird implements Aerial, Aquatic, Terrestrial {
    
    /**
     * Constructs an object of type Cormorant.
     *
     * @param age
     *          integer for age
     * @param featherColor
     *          string for feather color
     */
    public Cormorant(int age, String featherColor) {
        super(featherColor);
        super.age = age;
    }

    @Override
    public void run() {
        System.out.println("Watch me run with my wings wide open for balance!");
    }

    @Override
    public void swim() {
        System.out.println("I am a great diver, watch out fish!");
    }

    @Override
    public void fly() {
        System.out.println("I must fly fast and low to avoid eagles!");
    }

    @Override
    void eat() {
        System.out.println("Eat quickly, yum yum!");
    }

    @Override
    void move() {
        run();
        swim();
        fly();
    }
    
    
}
