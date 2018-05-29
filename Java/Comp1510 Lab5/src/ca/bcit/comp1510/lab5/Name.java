/**
 * 
 */
package ca.bcit.comp1510.lab5;

/**
 * Represents a name with first, middle, and last name.
 * 
 * @author John Ham
 * @version 1.0
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
     * Returns the length of the full name without spaces.
     * @return Length of each parameter as a concatenated string
     */
    public int getLength() {
        return (firstName.length() + middleName.length() + lastName.length());
    }
    /**
     * Returns the first letter of the first, middle, and last name.
     * @return First letter of each parameter as upper case.
     */
    public String getInitials() {
        return ("" + firstName.toUpperCase().charAt(0) 
                + middleName.toUpperCase().charAt(0) 
                + lastName.toUpperCase().charAt(0));
    }
    /**
     * Returns a character in the name.
     * @param index
     *      Integer value for the index
     * @return Character for index value n
     */
    public char getNthChar(int index) {
        String fullName = firstName + middleName + lastName;
        return (fullName.charAt(index));
    }
    /**
     * Returns the full name as last name, first name middle name.
     * @return Full name with last name coming first
     */
    public String lastFirstMiddle() {
        return (lastName + ", " + firstName + " " + middleName);
    }
    /**
     * Returns true or false whether a string matches the first name.
     * @param checkFirst
     *          String for a first name
     * @return  Boolean value checking if names match
     */
    public boolean isFirst(String checkFirst) {
        return firstName.equals(checkFirst);
    }
    /**
     * Returns true or false whether a Name object is the same as another.
     * @param newName
     *          Name object
     * @return  Boolean value checking if Name objects match
     */
    public boolean equalsFullName(Name newName) {
        String thisName = this.firstName + this.middleName + this.lastName;
        String objectName = newName.getFirstName() 
                + newName.getMiddleName() + newName.getLastName();
        return thisName.equals(objectName);
    }
    /**
     * Returns true or false whether a Name object is the same as another.
     * @param name
     *          Name object
     * @return  Boolean value checking if Name objects match
     */
    public boolean equals(Name name) {
        return firstName.equals(name.getFirstName())
                && middleName.equals(name.getMiddleName())
                && lastName.equals(name.getLastName());
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
