package q3;

import java.util.Random;

/**
 * <p>TestStudent tests if the Student class works properly.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class TestStudent {
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int test1 = 1;
        final int test2 = 2;
        final int test3 = 3;
        final int fail = 50;
        final int max = 50;
        
        Random rng = new Random();
        
        Address home = 
                new Address("21 Jump Street", "Langley", "BC", "V3A 6K6");
        Address school =
                new Address("3700 Willingdon Ave.", "Burnaby", "BC", "V5G 3H2");
        Student student1 = new Student("Jon", "Ham", home, school, 
                rng.nextInt(max) + fail, rng.nextInt(max) + fail, 
                rng.nextInt(max) + fail);
        
        System.out.println(student1.toString());
        
        System.out.println();
        
        student1.setTestScore(test1, rng.nextInt(max) + fail);
        student1.setTestScore(test2, rng.nextInt(max) + fail);
        student1.setTestScore(test3, rng.nextInt(max) + fail);
        System.out.println(student1.toString());
        
        System.out.println();
        
        Student student2 = new Student();
        
        System.out.println(student2.toString());
        
        student2.setTestScore(test1, rng.nextInt(max) + fail);
        student2.setTestScore(test2, rng.nextInt(max) + fail);
        student2.setTestScore(test3, rng.nextInt(max) + fail);
        
        System.out.println("The first test score is " 
                    + student2.getTestScore(test1));
        System.out.println("The second test score is " 
                    + student2.getTestScore(test2));
        System.out.println("The third test score is " 
                    + student2.getTestScore(test3));
        System.out.println("The average for the three tests is " 
                + student2.average());
    }

};
