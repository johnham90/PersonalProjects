package ca.bcit.comp1510.lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ForbiddenWords represents a list of words that can't be used in a password.
 * @author John Ham
 * @version 1.0
 */
public class ForbiddenWords {
    /**
     * ArrayList object containing strings.
     */
    private ArrayList<String> forbidden;
    
    /**
     * Scanner object.
     */
    private Scanner scan;
    
    /**
     * Constructs a ForbiddenWords object which scans a file and adds each line 
     * in that file to an arraylist.
     * @param wordlist
     *              String containing file location.
     * @throws FileNotFoundException
     *              ????
     */
    public ForbiddenWords(String wordlist) throws FileNotFoundException {
        forbidden = new ArrayList<String>();
        scan = new Scanner(new File(wordlist));
        
        while (scan.hasNext()) {
            forbidden.add(scan.next());
        }
    }
    
    /**
     * Checks whether the parameter is a part of the forbidden arraylist.
     * @param forbiddenWord
     *              String to check if it is a part of the arraylist.
     * @return Boolean value that depends on whether the string is part of the 
     *          arraylist.
     */
    public boolean containsWord(String forbiddenWord) {
        return forbidden.contains(forbiddenWord);
    }
}
