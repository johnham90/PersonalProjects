package ca.bcit.comp1510.lab11;

/**
 * BirdFarm represents a farm with multiple birds.
 *
 * @author John Ham
 * @version 2018
 */
public class BirdFarm {

    /**
     * Drives the program.
     * 
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich(2, "black");
        Penguin penguin = new Penguin(1, "black");
        Cormorant cormorant = new Cormorant(1, "white");
        
        ostrich.move();
        penguin.move();
        cormorant.move();
    }

}
