package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * <p>WordCounter represents a system that counts words in a file, assorts each
 * unique word into an ArrayList, and increments the word's frequency if it
 * appears more than once.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class WordCounter {
    
    /**ArrayList to contain the Words object for each word in the file.*/
    private ArrayList<Word> listOfWords;
    
    /**Word object.*/
    private Word word;
    
    /**
     * <p>Constructs a WordCounter object and instantiates an ArrayList for 
     * words.</p> 
     */
    public WordCounter() {
        listOfWords = new ArrayList<Word>();
    }
    
    /**
     * <p>Checks if the ArrayList contains the String passed in the parameter. 
     * If the ArrayList has the word, its frequency is increased. If not, the 
     * new Word object is added to the ArrayList.</p>
     * 
     * @param wordToCheck
     *          String for the word to check if it is in the ArrayList.
     */
    public void checkWord(String wordToCheck) {
        for (int i = 0; i < listOfWords.size(); i++) {
            word = listOfWords.get(i);
            if (word.getWord().equals(wordToCheck)) {
                word.incFrequency(); 
                return;
            }    
        }
        word = new Word(wordToCheck);
        listOfWords.add(word);
    }
    
    /**
     * <p>Scans each word of a file and runs each word through the checkWord
     * method.</p>
     * 
     * @param nameOfFile
     *          Directory of file as a string.
     * @return Integer value for the total number of words in the ArrayList.
     * @throws FileNotFoundException
     *          Throws an exception if the file does not exist.
     */
    public int parseBook(String nameOfFile) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(nameOfFile));
        while (scan.hasNext()) {
            String nextWord = scan.next();
            checkWord(nextWord);
        }
        scan.close();
        return listOfWords.size();
    }
    
    /**
     * Creates and returns a string of the most frequent words that appear
     * in the file.
     * 
     * @param topNum
     *          Integer value for the number of most frequent words to print.
     * @return String containing the Word objects for the frequent words.
     */
    public String printTopWords(int topNum) {
        if (topNum < 1) {
            throw new IllegalArgumentException("Please enter a positive "
                    + "integer.");
        }
        String topWords = "The top " + topNum + " frequent words are :";
        listOfWords.sort(null);
        Iterator<Word> wordIterator = listOfWords.iterator();
        for (int i = 0; i < topNum; i++) {
            Word freqWord = wordIterator.next();
            topWords += "\n" + freqWord.toString();
        }
        return topWords;
    }
    
    /**
     * <p>Drives the program.</p>
     *
     * @param args 
     *          Unused.
     * @throws FileNotFoundException
     *          Throws an exception if the file does not exist.
     */
    public static void main(String[] args) throws FileNotFoundException {
        final int topWords = 10;
        WordCounter wordCounter = new WordCounter();
        System.out.println("The number of words in the bible is " 
                    + wordCounter.parseBook("src/bible.txt"));
        System.out.println(wordCounter.printTopWords(topWords));
    }

};
