package q3;

import java.util.Scanner;

/**
 * <p>TestMIXChar tests the Message and MIXChar class by inputing a string and 
 * printing out the string as an encoded long and the decoded long as a 
 * string.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class TestMIXChar {
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a message using MIX characters.");
        
        String messageString = scan.nextLine();
        
        Message message = new Message(messageString);
        
        System.out.println("The encoded message is : ");
        System.out.println(message.toLong());
        
        System.out.println("The decoded message is : ");
        System.out.println(message.toString());
        
        scan.close();
    }
}
