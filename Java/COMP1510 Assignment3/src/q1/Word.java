/**
 * 
 */
package q1;

/**
 * <p>Word represents a word with the word itself and the frequency of which it
 * appears.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class Word implements Comparable<Word> {
    
    /**String containing the word.*/
    private final String word;
    
    /**Integer value containing how frequent the word appears.*/
    private int frequency;
    
    /**
     * <p>Constructs the Word object by defining the word. The frequency is 
     * set to zero.</p>
     * 
     * @param word
     *          String for the word.
     */
    public Word(String word) {
        frequency = 1;
        this.word = word;
    }
    
    /**
     * <p>Returns the word.</p>
     * 
     * @return String for word.
     */
    public String getWord() {
        return word;
    }
    
    /**
     * <p>Returns the frequency of the word.</p>
     * 
     * @return Integer value for the frequency.
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * <p>Increases the frequency of the word by one.</p>
     */
    public void incFrequency() {
        frequency += 1;
    }
    
    /**
     * <p>Returns a positive number if the word being compared to has a higher
     * frequency, a negative number if lower, and zero if the frequencies are
     * the same.</p>
     * 
     * @param compareWord
     *          Word object to compare frequencies.
     * @return Integer value for the difference of frequencies.
     */
    public int compareTo(Word compareWord) {
            return compareWord.getFrequency() - frequency;
    }
    
    /**
     * <p>Returns the contents of the Word object.</p>
     * 
     * @return String containing the actual word and its frequency.
     */
    public String toString() {
        return "Word [Word : " + word + "Frequency : " + frequency + "]";
    }
}
