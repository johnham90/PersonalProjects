package q3;

/**
 * <p>Represents a BCIT student.</p>
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author John Ham
 * @version 1.0
 */
public class Student {
    
    /** Constant for first test. */
    private static final int TEST1 = 1;
    
    /** Constant for second test. */
    private static final int TEST2 = 2;
    
    /** Constant for third test. */
    private static final int TEST3 = 3;
    
    /** Constant for full marks. */
    private static final int FULLSCORE = 100;
    
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student. */
    private Address schoolAddress;
    
    /** First test score of this student. */
    private int testScore1;

    /** Second test score of this student. */
    private int testScore2;
    
    /** Third test score of this student. */
    private int testScore3;

    /**
     * <p>Constructs a Student object that contains the specified values.</p>
     * 
     * @param first 
     *      a String representing the first name
     * @param last 
     *      a String representing the last name
     * @param home 
     *      an Address object containing the home address
     * @param school 
     *      an Address object containing the school address
     * @param test1
     *      an integer containing the first test score
     * @param test2
     *      an integer containing the second test score
     * @param test3
     *      an integer containing the third test score
     */
    public Student(String first, String last, Address home, Address school,
            int test1, int test2, int test3) {
        if (test1 < 0 || test2 < 0 || test3 < 0 
            || test1 > FULLSCORE || test2 > FULLSCORE || test3 > FULLSCORE) {
            throw new IllegalArgumentException("The test scores need to be a"
                    + " score between 0 and 100.");
        }
            
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = test1;
        testScore2 = test2;
        testScore3 = test3;
    }
    
    /**
     * Constructs a Student object that sets each test score as 0.
     */
    public Student() {
        setTestScore(TEST1, 0);
        setTestScore(TEST2, 0);
        setTestScore(TEST3, 0);
    }
    
    /**
     * <p>Sets a test score depending on the parameter. An error message is
     * given if a wrong test number is entered.</p>
     * 
     * @param testNum
     *          Integer value for the number of test.
     * @param score
     *          Integer value for the score.
     */
    public void setTestScore(int testNum, int score) {
        if (testNum < TEST1 || testNum > TEST3) {
            throw new IllegalArgumentException("The test number needs to be a "
                    + "number between 1 and 3.");
        }
        if (score < 0 || score > FULLSCORE) {
            throw new IllegalArgumentException("The test score needs to be a"
                    + " score between 0 and 100.");
        }
        switch (testNum) {
        case TEST1 :
            testScore1 = score;
            break;
        case TEST2 :
            testScore2 = score;
            break;
        case TEST3 :
            testScore3 = score;
            break;
        default:
        }
    }
    
    /**
     * <p>Returns the test score for a test. An error message is given if a
     * wrong test score is entered.</p> 
     * 
     * @param testNum
     *          Integer for the number of test.
     * @return Integer value for score of test.
     */
    public int getTestScore(int testNum) {
        if (testNum < TEST1 || testNum > TEST3) {
            throw new IllegalArgumentException("The test number needs to be a "
                    + "number between 1 and 3.");
        }
        switch (testNum) {
        case TEST1 :
            return testScore1;
        case TEST2 :
            return testScore2;
        case TEST3 :
            return testScore3;
        default :
            return 0;
        }
    }
    
    /**
     * <p>Returns the average for the three test scores.</p>
     * 
     * @return Integer value for the average of test scores.
     */
    public double average() {
        final double three = 3;
        return (testScore1 + testScore2 + testScore3) / three;
    }

    /**
     * <p>Returns a String description of this Student object.</p>
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Score for first test : " + testScore1 + "\n";
        result += "Score for second test : " + testScore2 + "\n";
        result += "Score for third test : " + testScore3 + "\n";
        result += "Average : " + average();

        return result;
    }
}

