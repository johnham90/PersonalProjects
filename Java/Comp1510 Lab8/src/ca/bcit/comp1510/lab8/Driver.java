/**
 * 
 */
package ca.bcit.comp1510.lab8;

import java.util.Random;

/**
 * Driver runs each method in the Cat and CatHotel class to check whether they
 * work.
 * @author John Ham
 * @version 1.0
 */
public class Driver {

    /**
     * Drives the program.
     * @param args
     *          Unused.
     */
    public static void main(String[] args) {
        final int normalAge = 15;
        final int tooOld = 30;
        Random randomAge = new Random();
        CatHotel bcit = new CatHotel("BCIT");
        Cat red = new Cat("red", randomAge.nextInt(normalAge));
        Cat blue = new Cat("blue", randomAge.nextInt(normalAge));
        Cat white = new Cat("white", randomAge.nextInt(normalAge));
        Cat black = new Cat("black", randomAge.nextInt(normalAge));
        
        red.setAge(tooOld);
        System.out.println(red.toString());
        
        bcit.addCat(red);
        bcit.addCat(blue);
        bcit.addCat(white);
        bcit.addCat(black);
        System.out.println(bcit.guestCount());
        System.out.println(bcit.printGuestList());

        bcit.removeAllGuests();
        
        bcit.addCat(red);
        bcit.addCat(blue);
        bcit.addCat(white);
        bcit.addCat(black);
        System.out.println("The number of guests removed is " 
                        + bcit.removeOldGuests(normalAge));
        System.out.println(bcit.guestCount());
        System.out.println(bcit.printGuestList());

    }

}
