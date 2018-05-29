package ca.bcit.comp1510.lab10;

/**
 * Lockable is an object that can be locked.
 *
 * @author John Ham
 * @version 2018
 */
public interface Lockable {
    
    /**
     * Sets a key.
     * @param key
     *      Integer value for key.
     */
    void setKey(int key);
    
    /**
     * Locks the object using specified key.
     * @param key
     *      Integer value for key
     * @return boolean value for if program has locked
     */
    boolean lock(int key);
    
    /**
     * Unlocks the object using specified key.
     * @param key
     *      Integer value for key
     * @return boolean value for if program has unlocked
     */
    boolean unlock(int key);
    
    /**
     * Returns whether program is locked.
     * @return boolean value for if program is locked
     */
    boolean locked();
}
