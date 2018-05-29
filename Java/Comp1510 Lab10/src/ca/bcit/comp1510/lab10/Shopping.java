package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Shopping tests the Transaction class.
 *
 * @author John Ham
 * @version 2018
 */
public class Shopping {

    /**
     * Drives the program.
     * @param args
     *          Unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter an integer for the number of items "
                + "to buy : ");
        
        Transaction transaction = new Transaction(scan.nextInt());
        
        do {
            System.out.println("Please enter the name for an item to buy, it's "
                    + "price, and quantity to buy separated by spaces : ");
            Item item = new Item(scan.next(), scan.nextDouble(), 
                    scan.nextInt());
            transaction.addToCart(item);            
            
            System.out.println("Please enter the name for an item to buy, it's "
                    + "price, and quantity to buy separated by spaces : ");
            transaction.addToCart(scan.next(), scan.nextDouble(), 
                    scan.nextInt());
            
            System.out.println("Continue shopping? Enter \"yes\" to continue.");
        } while (scan.next().equals("yes"));
        
        System.out.println(transaction.toString());
        
        scan.close();
    }

}
