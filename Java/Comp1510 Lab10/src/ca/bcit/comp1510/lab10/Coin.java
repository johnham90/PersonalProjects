package ca.bcit.comp1510.lab10;

/**
 * Represents a two-sided coin that can be flipped and implements the Lockable
 * interface.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author John Ham
 * @version 1.0
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;
    
    /** Integer value to hold number representing a key for lock. */
    private int key;
    
    /** Boolean value to show if coin is locked or not. */
    private boolean isLocked;
    
    /** Coin's current face showing. */
    private int face;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        key = 0;
        isLocked = false;
        flip();
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    protected void flip() {
        if (!isLocked) {
            face = (int) (Math.random() * 2);
        } else {
            System.out.println("Coin is locked and will not be flipped.");
        }
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    protected boolean isHeads() {
        return (face == HEADS);
        
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        return faceName;
    }
    
    /**
     * Sets a new key.
     * @see ca.bcit.comp1510.lab10.Lockable#setKey(int)
     * @param newKey
     *          Integer value for new key.
     */
    @Override
    public void setKey(int newKey) {
        if (!isLocked) {
            key = newKey;
        }
    }

    /**
     * Locks the coin.
     * @see ca.bcit.comp1510.lab10.Lockable#lock(int)
     * @param newKey
     *          Integer value for key.
     * @return Boolean value for if coin is locked.
     */
    @Override
    public boolean lock(int newKey) {
//        if (isLocked) {
//            return isLocked;
//        } else {
//            if (newKey == key) {
//                isLocked = true;
//                System.out.println("Coin is locked.");
//                return isLocked;
//            } else {
//                System.out.println("Wrong key. Coin has not been locked.");
//                return isLocked;
//            }
//        }
        if (!isLocked && newKey == key) {
            isLocked = true;
            System.out.println("Coin is locked.");
            return isLocked;
        }
        return isLocked;
    }

    /**
     * Unlocks the coin.
     * @see ca.bcit.comp1510.lab10.Lockable#unlock(int)
     * @param newKey
     *          Integer value for key.
     * @return Boolean value for if coin is unlocked.
     */
    @Override
    public boolean unlock(int newKey) {
//        if (!isLocked) {
//            return !isLocked;
//        } else {
//            if (newKey == key) {
//                isLocked = false;
//                System.out.println("Coin is unlocked.");
//                return !isLocked;
//            } else {
//                System.out.println("Wrong key. Coin has not been unlocked");
//                return !isLocked;
//            }
//        }
        
        if (isLocked && newKey == key) {
            isLocked = false;
            System.out.println("Coin is unlocked.");
            return !isLocked;
        }
        return !isLocked;
    }

    /**
     * Checks whether coin is locked or not.
     * @see ca.bcit.comp1510.lab10.Lockable#locked()
     * @return Boolean value for if coin is locked.
     */
    @Override
    public boolean locked() {
        return isLocked;
    }
}

