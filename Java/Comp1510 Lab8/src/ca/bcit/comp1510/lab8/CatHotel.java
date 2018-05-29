/**
 * 
 */
package ca.bcit.comp1510.lab8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * CatHotel represents a cat hotel.
 * @author John Ham
 * @version 1.0
 */
public class CatHotel {
    /**
     * Arraylist object containing cat objects.
     */
    private ArrayList<Cat> catList;
    
    /**
     * String object.
     */
    private String hotelName;
    
    /**
     * Constructs a CatHotel object by defining the name of the hotel and
     * instantiates an arraylist for cats.
     * @param hotelName
     *          String for hotel name.
     */
    public CatHotel(String hotelName) {
        this.hotelName = hotelName;
        catList = new ArrayList<Cat>();
    }
    
    /**
     * Adds a cat object to the arraylist.
     * @param cat
     *      Cat object.
     */
    public void addCat(Cat cat) {
        catList.add(cat);
    }
    
    /**
     * Removes all the cats in the arraylist.
     */
    public void removeAllGuests() {
        catList.clear();
    }
    
    /**
     * Prints how many guests are in the hotel.
     * @return String containing name of hotel and number of guests.
     */
    public String guestCount() {
        return "The current numbers of guests in " + hotelName + " is " 
                    + catList.size();
    }
    
    /**
     * Checks the age of each cat object in the arraylist and removes the cat
     * object if the cat is too old. 
     * @param age
     *          Int value to check age.
     * @return Int value for the number of guests removed.
     */
    public int removeOldGuests(int age) {
        int numberRemoved = 0;
        Iterator<Cat> catIterator = catList.iterator();
        while (catIterator.hasNext()) {
            Cat cat = catIterator.next();
            if (cat.getAge() > age) {
                catIterator.remove();
                numberRemoved++;
            }
        }
        return numberRemoved;
    }
    
    /**
     * Prints the name of the hotel and information about each guest.
     * @return Name of the hotel and information of each guest as a string.
     */
    public String printGuestList() {
        String guestList = "";
        for (Cat cat : catList) {
            guestList += "\n" + cat.getName();
        }
        return "Cat Hotel Name : " + hotelName + guestList;
    }
}
