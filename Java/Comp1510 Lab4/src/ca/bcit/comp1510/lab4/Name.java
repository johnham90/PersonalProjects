/**
 * 
 */
package ca.bcit.comp1510.lab4;

/**
 * Represents a name with first, middle, and last name.
 * 
 * @author hamj1
 * @version 2018.02.06
 */
public class Name {
    /** First name. */
    private String firstName;
    /** Middle name. */
    private String middleName;
    /** Last name. */
    private String lastName;

    /**
     * Constructs a name object by defining first, middle, and last name.
     * 
     * @param firstName 
     *            First name.
     * @param middleName
     *            Middle name.
     * @param lastName
     *            Last name.
     */
    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * Sets a first name.
     * 
     * @param firstName
     *            New first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets a middle name.
     * 
     * @param middleName
     *            New middle name
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Sets a last name.
     * 
     * @param lastName
     *            New last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the first name.
     * 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the middle name.
     * 
     * @return middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Returns the last name.
     * 
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the first, middle, and last name concatenated.
     * 
     * @return First, middle, and last name as a string
     */
    public String toString() {
        return (firstName + middleName + lastName);
    }
}
