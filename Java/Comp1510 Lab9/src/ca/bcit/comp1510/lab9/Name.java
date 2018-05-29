/**
 * 
 */
package ca.bcit.comp1510.lab9;

/**
 * Name represents a name with a first, middle, and last name.
 * 
 * @author John Ham
 * @version 1.0
 */
public class Name implements Comparable<Name> {
    
    /** String containing first name.*/
    private final String first;
    
    /** String containing middle name.*/
    private final String middle;
    
    /** String containing last name.*/
    private final String last;
    
    /**
     * Constructs a Name object by defining first, middle, and last name. If 
     * nothing or white space is entered for the first and last name, an error
     * will occur.
     * 
     * @param firstName
     *          String for first name.
     * @param middleName
     *          String for middle name.
     * @param lastName
     *          String for last name.
     */
    public Name(String firstName, String middleName, String lastName) {
        if (firstName == null || lastName == null || firstName.trim().isEmpty() 
                || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a first and "
                    + "last name.");
        }
        
        first = firstName.trim();
        middle = middleName.trim();
        last = lastName.trim();
    }
    
    /**
     * Returns the first name.
     * 
     * @return String containing first name.
     */
    public String getFirst() {
        return first;
    }

    /**
     * Returns the middle name.
     * 
     * @return String containing middle name.
     */
    public String getMiddle() {
        return middle;
    }
    
    /**
     * Returns the last name.
     * 
     * @return String containing last name.
     */
    public String getLast() {
        return last;
    }
    
    /**
     * Compares a Name object with the current Name object. The last name is
     * compared first using the compareTo method in the String class, then 
     * the middle name, then the last name.
     * 
     * @param compare
     *          Name object to compare.
     */
    @Override
    public int compareTo(Name compare) {
        if (last.compareTo(compare.getLast()) != 0) {
            return last.compareTo(compare.getLast());
        } else if (middle.compareTo(compare.getMiddle()) != 0) {
            return middle.compareTo(compare.getMiddle());
        } else {
            return first.compareTo(compare.getFirst());
        }
    }

    /**
     * Returns the first, middle and last name.
     * 
     * @return First, middle, and last name as a string.
     */
    public String toString() {
        return "Student [" + first + " " + middle + " " + last + "]";
    }
}
