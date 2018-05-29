package q4;

import java.util.Random;

import q3.Address;
import q3.Student;

/**
 * <p>TestCourse tests if the Course class works properly by testing each
 * method in the Course class.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class TestCourse {
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args 
     *          Unused.
     */
    public static void main(String[] args) {
        final int fail = 50;
        final int max = 50;
        Random rng = new Random();
        
        Course comp1510  = new Course("Programming Methods");
        Address home = 
                new Address("21 Jump Street", "Langley", "BC", "V3A 6K6");
        Address school =
                new Address("3700 Willingdon Ave.", "Burnaby", "BC", "V5G 3H2");
        Student john = new Student("John", "Ham", home, school, 
                    rng.nextInt(max) + fail, rng.nextInt(max) + fail, 
                    rng.nextInt(max) + fail);
        Student erik = new Student("Erik", "Ho", home, school, 
                    rng.nextInt(max) + fail, rng.nextInt(max) + fail, 
                    rng.nextInt(max) + fail);
        Student oscar = new Student("Oscar", "Au", home, school, 
                    rng.nextInt(max) + fail, rng.nextInt(max) + fail, 
                    rng.nextInt(max) + fail);
        Student lena = new Student("Lena", "Kwan", home, school, 
                    rng.nextInt(max) + fail, rng.nextInt(max) + fail, 
                    rng.nextInt(max) + fail);
        Student justin = new Student("Justin", "Cervantes", home, school, 
                    rng.nextInt(max) + fail, rng.nextInt(max) + fail, 
                    rng.nextInt(max) + fail);
        
        comp1510.addStudent(john);
        comp1510.addStudent(erik);
        comp1510.addStudent(oscar);
        comp1510.addStudent(lena);
        comp1510.addStudent(justin);
        
        System.out.println(comp1510.roll());
        
        System.out.println();
        
        System.out.println("The average of the students' averages for " 
                    + comp1510.getCourse() + " is " + comp1510.average());
    }

};
