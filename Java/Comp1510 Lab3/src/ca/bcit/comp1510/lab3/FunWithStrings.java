/**
 * 
 */
package ca.bcit.comp1510.lab3;
import java.util.Scanner;

/**
 * FunWithStrings 
 * Stuff done with strings.
 * @author hamj1
 * @version 2018.01.29
 */
public class FunWithStrings {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        String favBook = "";
        
        // String favBook;?
        
        System.out.println("Please enter the title of your favorite book : ");
        favBook += myScanner.nextLine();
        
        System.out.println("Your favorite book is " + favBook);
        
        // .nextLine() takes in the entire line until the line 
        //separator(enter?) is found
        // can input without line separator?
        
        String favBook2 = "";
        
        System.out.println("Please enter the title of another book : ");
        favBook2 += myScanner.next();
        System.out.println("The book title is " + favBook2);
        
        myScanner.close();
        
        // .next() takes in only the next token if matching 
        //the specified pattern in this case it is the next word entered.
        // what is the pattern?
        
        System.out.println("It is " + favBook.startsWith("The")
            + " that the book starts with \"The\".");
        
        favBook.toUpperCase();
        System.out.println(favBook);
        // .toUpperCase does not change the original string
        
        String upperCaseBook = favBook.toUpperCase();
        System.out.println(upperCaseBook);
        // everything is in upper cases
        
        // Strings have states that do not change. 
        // If they are given a new value, the original value is replaced. 
        
        System.out.println(favBook.toUpperCase());
        System.out.println(favBook.toLowerCase());
        
        String trimmedUserInput = favBook.trim();
        System.out.println(trimmedUserInput);
        // tabs : nothing is printed out
        // spaces : nothing is printed out
        // spaces are trimmed out
        // only the spaces at the beginning and end are trimmed out
        
        String finalString;
        finalString = trimmedUserInput.toLowerCase();
        String firstLetter = finalString.substring(0, 1);
        String lastLetter = finalString.substring(finalString.length() - 1,
                finalString.length());
        finalString = firstLetter.toUpperCase() 
                + finalString.substring(1, finalString.length() - 1) 
                + lastLetter.toUpperCase();
        System.out.println(finalString);
        // not possible to concatenate char and string?
    }

}
