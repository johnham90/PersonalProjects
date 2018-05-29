package q3;

/**
 * <p>MIXChar represents a MIX character.</p>
 *
 * @author John Ham
 * @version 2018
 */
public class MIXChar {
    
    /** Largest ordinal value. */
    private static final int MAX_ORDINAL = 56;
    
    /** Unicode for character delta. */
    private static final char DELTA = '\u0394';
    
    /** Unicode for character sigma. */
    private static final char SIGMA = '\u03A3';
    
    /** Unicode for character pi. */
    private static final char PI = '\u03A0';
    
    /** Array of characters holding MIX characters. */
    private static char[] mixChar = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 
            'H', 'I', DELTA, 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            SIGMA, PI, 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0',
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', ',', '(', ')',
            '+', '-', '*', '/', '=', '$', '<', '>', '@', ';', ':', '\''};

    /** Character holding MIX character. */
    private char mixCharacter;

    /**
     * <p>Constructs an object of type MIXChar.</p>
     *
     * @param c
     *     character to input as a MIXChar
     */
    public MIXChar(char c) {
        if (!isMIXChar(c)) {
            throw new IllegalArgumentException("Conversion is not possible.");
        }
        mixCharacter = c;
    }
    
    /**
     * <p>Checks if a character is a MIX character.</p>
     * 
     * @param c
     *      character to check for MIX character.
     * @return boolean value whether character is a MIX character.
     */
    public static boolean isMIXChar(char c) {
        for (int i = 0; i < MAX_ORDINAL; i++) {
            if (c == mixChar[i]) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * <p>Converts MIX character to a Java character.</p>
     * 
     * @return Java character
     */
    public char toChar() {
        return mixCharacter;
    }
    
    /**
     * <p>Returns the MIX character at an ordinal value.</p>
     * 
     * @param ordinal
     *          Ordinal value
     * @return character at ordinal value
     */
    public static char atOrdinal(int ordinal) {
        return mixChar[ordinal];
    }
    
    /**
     * <p>Returns a String with characters corresponding to input array.</p>
     * 
     * @param mixArray
     *          array of MIX characters
     * @return String containing MIX characters
     */
    public static String toString(MIXChar[] mixArray) {
        String mixCharString = "";
        for (int i = 0; i < mixArray.length; i++) {
            mixCharString += mixArray[i].toChar();
        }
        return mixCharString;
    }
    
    /**
     * <p>Returns an array of MIX characters corresponding to the characters in
     * a String.</p>
     * 
     * @param string
     *      String input
     * @return array of MIX characters
     */
    public static MIXChar[] toMIXChar(String string) {
        MIXChar[] mixArray = new MIXChar[string.length()];
        for (int i = 0; i < string.length(); i++) {
            MIXChar newMIXChar = new MIXChar(string.charAt(i));
            mixArray[i] = newMIXChar;
        }
        return mixArray;
    }
    
    /**
     * <p>Returns numerical value of MIX character.</p>
     * 
     * @return ordinal value of MIX character
     */
    public int ordinal() {
        for (int i = 0; i < MAX_ORDINAL; i++) {
            if (mixCharacter == mixChar[i]) {
                return i;
            }
        }
        return mixCharacter;
    }
    
    /**
     * <p>Returns string containing MIX character.</p>
     * 
     * @return string
     */
    public String toString() {
        return "" + mixCharacter;
    }
}
