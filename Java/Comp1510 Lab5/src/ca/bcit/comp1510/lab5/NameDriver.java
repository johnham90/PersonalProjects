/**
 * 
 */
package ca.bcit.comp1510.lab5;

import java.util.Scanner;

/**
 * NameDriver tests each method in the Name class.
 * @author John Ham
 * @version 1.0
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Name name = new Name("John", "Young", "Ham");

        System.out.println(name.getFirstName());
        System.out.println(name.getMiddleName());
        System.out.println(name.getLastName());
        System.out.println(name.getLength());
        System.out.println(name.getInitials());
        System.out.println("Enter the index of the name to check : ");
        int index = scan.nextInt();
        System.out.println(name.getNthChar(index));
        System.out.println(name.lastFirstMiddle());
        System.out.println(name.isFirst("H"));
        
        Name newName = new Name("John", "Young", "Ham");
        System.out.println(name.equals(newName));
        
        scan.close();
    }

}
