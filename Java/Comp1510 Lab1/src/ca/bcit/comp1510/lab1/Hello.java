/**
 * 
 */
package ca.bcit.comp1510.lab1;

/**
 * Prints a Hello World message.
 * 
 * @author John Ham
 * @version 01.17.18
 */
public class Hello {

    /**
     * Prints the greeting.
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        //a. Hello.java:12: error: class Helo is public, 
        //   should be declared in a file named Helo.java
        //b. There is no error message because there are no compile-time
        //errors or run-time errors that have been made. However, when running 
        //the program, "Helo World" is printed.
        //c. Hello.java:21: error: unclosed string literal
        //d. 3 errors occur. 
        //  Hello.java:21: error: ')' expected
        //  Hello.java:21: error: unclosed string literal
        //  Hello.java:21: error: not a statement
        //e. Hello.java:21: error: ';' expected
    }

}
