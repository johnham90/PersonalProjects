package ca.bcit.comp1510.lab11;

/**
 * DogTest tests the Dog class.
 *
 * @author John Ham
 * @version 2018
 */
public class DogTest {

    /**
     * Drives the program.
     * 
     * @param args
     *          unused
     */
    public static void main(String[] args) {
//        Dog dog = new Dog("Lucy"); Dog is an abstract class so you can't 
//        instantiate it
        
        Labrador labrador = new Labrador("Hannah", "Golden");
        
        System.out.println(labrador.toString());
        System.out.println("Hannah says " + labrador.speak());
        System.out.println("The labrador's average weight is " 
                    + labrador.averageBreedWeightKG());
        
        Yorkshire yorkshire = new Yorkshire("Sebastion", true);
        
        System.out.println(yorkshire.toString());
        System.out.println("Sebastian says " + yorkshire.speak());
        System.out.println("The yorkshire's average weight is " 
                    + yorkshire.averageBreedWeightKG());
    }

}
