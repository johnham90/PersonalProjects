/**
 * 
 */
package ca.bcit.comp1510.lab6;

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
        System.out.println(name.toString());
        name.setFirstName("     ");
        System.out.println("The first name is " + name.getFirstName());
        System.out.println("The middle name is " + name.getMiddleName());
        System.out.println("The last name is " + name.getLastName());
        System.out.println("Enter the index of the name to check : ");
        int index = scan.nextInt();
        System.out.println("The letter at index : " + index + " is " 
                + name.getNthChar(index));
        System.out.println(name.toString());
        
        Name name2 = new Name("", "    YouNg", "HAM    ");
        System.out.println(name2.toString());
        name.setFirstName("   John  ");
        System.out.println("The first name is " + name.getFirstName());
        System.out.println("The middle name is " + name.getMiddleName());
        System.out.println("The last name is " + name.getLastName());
        System.out.println("Enter the index of the name to check : ");
        int index2 = scan.nextInt();
        System.out.println("The letter at index : " + index2 + " is " 
                + name.getNthChar(index2));
        System.out.println(name.toString());
        scan.close();
    }

}
