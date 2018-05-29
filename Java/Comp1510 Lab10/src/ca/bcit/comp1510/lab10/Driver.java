package ca.bcit.comp1510.lab10;

/**
 * Tests the Lockable interface by running the Coin class.
 *
 * @author John Ham
 * @version 2018
 */
public class Driver {

    /**
     * Drives the program.
     * @param args
     *          Unused.
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.flip();
        
        System.out.println("The face of the coin is " + coin.toString());
        
        coin.setKey(1);
        coin.lock(2);
        coin.lock(1);
        
        coin.flip();
        
        System.out.println("The face of the coin is " + coin.toString());
        
        coin.unlock(2);
        coin.unlock(1);
        
        coin.flip();
        
        System.out.println("The face of the coin is " + coin.toString());
    }

}
