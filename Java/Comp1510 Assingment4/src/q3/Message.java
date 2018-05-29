package q3;

/**
 * <p>Message represents a packed string of MIX characters.</p>
 *
 * @author John Ham
 * @version 2018
 */
public class Message {
    
    /** Largest ordinal value. */
    private static final int MAX_ORDINAL = 56;
    
    /** Number of MIX characters that can be in a long. */
    private static final int MAX_MIX_CHAR = 11;
    
    /** Array holding long values for 11 MIX characters. */
    private long[] longArray;
    
    /** Integer value of how many characters are in the message object. */
    private int count;
    
    /**
     * <p>Constructs an object of type Message using an array of MIX 
     * characters.</p>
     *
     * @param message
     *      array of MIX characters
     */
    public Message(MIXChar[] message) {
        count = message.length;
        makeLong(message);
    }
    
    /**
     * <p>Constructs an object of type Message using a string.</p>
     *
     * @param message
     *      string
     */
    public Message(String message) {
        count = message.length();
        MIXChar[] mixArray = MIXChar.toMIXChar(message);
        makeLong(mixArray);
    }
    
    /**
     * <p>Inserts values into the longArray by packing 11 MIX characters from 
     * the input MIX character array per long.</p>
     * 
     * @param mixArray
     *      MIX character array
     * @return array containing long values
     */
    public long[] makeLong(MIXChar[] mixArray) {
        int size = (int) Math.ceil(mixArray.length / (double) MAX_MIX_CHAR);
        longArray = new long[size];
        
        for (int i = 0; i < size; i++) {
            long packedMIX = 0;
            
            for (int j = 0; j < MAX_MIX_CHAR; j++) {
                if (j + MAX_MIX_CHAR * i == count) {
                    longArray[i] = packedMIX;
                    return longArray;
                }
                
                packedMIX += 
                        mixArray[(int) (j + MAX_MIX_CHAR * i)].ordinal() 
                        * (long) Math.pow(MAX_ORDINAL, MAX_MIX_CHAR - j - 1);
            }
            longArray[i] = packedMIX;
        }
        
        return longArray;
    }
    
    /**
     * <p>Returns a string corresponding to the characters in the message.</p>
     * 
     * @return string
     */
    public String toString() {
        String message = "";
        
        for (int i = 0; i < longArray.length; i++) {
            long elevenMIXChar = longArray[i];

            for (int j = 0; j < MAX_MIX_CHAR; j++) {
                if (j + i * MAX_MIX_CHAR == count) {
                    return message;
                }
                
                int ordinal = (int) Long.divideUnsigned(elevenMIXChar, 
                        (long) Math.pow(MAX_ORDINAL, MAX_MIX_CHAR - j - 1));
                elevenMIXChar = Long.remainderUnsigned(elevenMIXChar,
                        (long) Math.pow(MAX_ORDINAL, MAX_MIX_CHAR - j - 1));
                char mixChar = MIXChar.atOrdinal(ordinal);
                message += mixChar;
            }
        }
        
        return message;
    }
    
    /**
     * <p>Returns a string which is the longArray formatted as unsigned 
     * integers and separated by spaces.</p>
     * 
     * @return string
     */
    public String toLong() {
        String message = "";
        
        for (int i = 0; i < longArray.length; i++) {
            message += Long.toUnsignedString(longArray[i]) + " ";
        }
        
        return message;
    }
}
