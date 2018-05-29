/**
 * 
 */
package ca.bcit.comp1510.lab8;

/**
 * CoinRunner flips a coin 100 times and prints the result for each flip, then
 * prints out the length of the longest run of heads.
 * @author John Ham
 * @version 1.0
 */
public class CoinRunner {

    /**
     * Drives the program.
     * @param args
     *          Unused.
     */
    public static void main(String[] args) {
        final int flipNumber = 100;
        Coin coin = new Coin();
        int consecutiveHeads = 0;
        int longestHeads = 0;
        for (int i = 0; i < flipNumber; i++) {
            coin.flip();
            System.out.println(coin.toString());
            if (coin.isHeads()) {
                consecutiveHeads++;
            } else {
                consecutiveHeads = 0;
            }
            if (consecutiveHeads > longestHeads) {
                longestHeads = consecutiveHeads;
            }
        }
        System.out.println("The longest run of heads is " + longestHeads);
    }

}
