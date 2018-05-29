/**
 * 
 */
package ca.bcit.comp1510.lab4;

/**
 * Represents a student with basic information about the student.
 * 
 * @author hamj1
 * @version 2018.02.06
 */
public class Student {
    /** First name. */
    private String firstName;
    /** Last name. */
    private String lastName;
    /** Year of birth. */
    private int yearOfBirth;
    /** Student number. */
    private String studentNumber;
    /** GPA. */
    private double gradePointAverage;

    /**
     * Constructs a student object by defining first and last name, 
     * year of birth, student number, and gpa.
     * 
     * @param first
     *            First name
     * @param last
     *            Last name
     * @param year
     *            Year of birth
     * @param stuNumber
     *            Student number
     * @param gpa
     *            Double representing GPA
     */
    public Student(String first, 
                   String last, 
                   int year, 
                   String stuNumber, 
                   double gpa) {
        firstName = first;
        lastName = last;
        yearOfBirth = year;
        studentNumber = stuNumber;
        gradePointAverage = gpa;
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
     * Returns the last name.
     * 
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the year of birth.
     * 
     * @return yearOfBirth
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Returns the student number.
     * 
     * @return studentNumber
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * Returns the GPA.
     * 
     * @return gradePointAverage
     */
    public double getGPA() {
        return gradePointAverage;
    }

    /**
     * Sets a first name.
     * 
     * @param newFirst
     *            New first name
     */
    public void setFirstName(String newFirst) {
        this.firstName = newFirst;
    }

    /**
     * Sets a new last name.
     * 
     * @param newLast
     *            New last name
     */
    public void setLastName(String newLast) {
        this.lastName = newLast;
    }

    /**
     * Sets a new year of birth.
     * 
     * @param newYear
     *            New year of birth
     */
    public void setYearOfBirth(int newYear) {
        this.yearOfBirth = newYear;
    }

    /**
     * Sets a new student number.
     * 
     * @param newStuNumber
     *            New student number
     */
    public void setStudentNumber(String newStuNumber) {
        this.studentNumber = newStuNumber;
    }

    /**
     * Sets a new GPA.
     * 
     * @param newGPA
     *            new GPA
     */
    public void setGPA(double newGPA) {
        this.gradePointAverage = newGPA;
    }

    /**
     * Returns a string of the information entered in a format easy to read.
     * 
     * @return Concatenated form of the parameters with appropriate annotations
     */
    public String toString() {
        return ("Student Information : \nFirst Name : " + firstName 
                + "\nLast Name : " + lastName + "\nYear Of Birth : " 
                + yearOfBirth +  "\nStudent Number : " + studentNumber 
                + "\nGPA : " + gradePointAverage);
    }
}
