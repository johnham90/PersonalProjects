/**
 * 
 */
package q4;

import java.util.ArrayList;

import q3.Student;

/**
 * <p>Course represents a course with a name and list of students.</p>
 * 
 * @author John Ham
 * @version 1.0
 */
public class Course {
    
    /** Constant for maximum number of students. */
    private static final int MAXSTUDENT = 5;
    
    /** Name of the course. */
    private final String courseName;
    
    /** ArrayList for students. */
    private ArrayList<Student> studentList;
    
    /** Integer value to hold number of students. */
    private int studentCount;
    
    /**
     * <p>Constructs a Course object by defining the name of the course.</p>
     * 
     * @param courseName
     *          String for course name.
     */
    public Course(String courseName) {
        studentList = new ArrayList<Student>(MAXSTUDENT);
        this.courseName = courseName;
        studentCount = 0;
    }
    
    /**
     * <p>Returns the name of the course.</p>
     * 
     * @return String for name of course.
     */
    public String getCourse() {
        return courseName;
    }
    
    /**
     * <p>Adds a new student to the list of students. If the maximum number of
     * students is already reached, an error message is given.</p>
     * 
     * @param newStudent
     *          Student object to add the the list.
     */
    public void addStudent(Student newStudent) {
        if (studentCount >= MAXSTUDENT) {
            throw new IllegalArgumentException("There are too many students in "
                    + "the course!");
        } else {
        studentList.add(newStudent);
        studentCount++;
        }
    }

    /**
     * <p>Calculates the average test score for the students in the course.</p>
     * 
     * @return Integer value for average.
     */
    public double average() {
        double average = 0;
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            average += student.average();
        }
        average /= studentList.size();
        return average;
    }
    
    /**
     * <p>Prints the students' information.</p>
     * 
     * @return String containing each Student object.
     */
    public String roll() {
        String roll = courseName;
        for (Student student : studentList) {
            roll += "\n\n" + student.toString();
        }
        return roll;
    }
}
