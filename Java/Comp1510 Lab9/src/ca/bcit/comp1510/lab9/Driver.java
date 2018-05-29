/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.ArrayList;

/**
 * Driver checks whether the Name class functions properly. 
 * 
 * @author John Ham
 * @version 1.0
 */
public class Driver {

    /**
     * Drives the program.
     * 
     * @param args
     *          Unused.
     */
    public static void main(String[] args) {
        Name name1 = new Name("John", "Young", "Ham");
        Name name2 = new Name("Jason", "Young", "Ham");
        Name name3 = new Name("Jason", "", "Kim");
        Name name4 = new Name("Jason", "", "An");
        Name name5 = new Name("Peter", "B", "Woo");
        
        ArrayList<Name> nameList = new ArrayList<Name>();
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);
        nameList.add(name5);
        
        nameList.sort(null);
        
        for (Name name : nameList) {
            System.out.println(name.toString());
        }
    }

}
