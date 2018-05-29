package q5;

/**
 * <p>Pack takes 5 characters, considers the value as a number in base 56,
 * converts the value into base 10, then converts the number back
 * to base 56 as a series of characters.</p>
 * <p>Each character is cast into a integer value that starts with A = 1.
 * The resulting number is considered to be in base 56. The base 56 number
 * is then encoded by converting the number into base 10. The encoded number
 * is finally decoded by converting the base 10 number back into base 56,
 * then taking each digit and casting the digit back to characters. The
 * original set of characters, the encoded value, and the decoded values
 * are printed out at the end.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class Pack {
    /**
     * Number representing the base.
     */
    static final int BASE56 = 56;
    /**
     * <p>Drives the program.</p>
     *
     * @param args
     *          unused.
     */
    public static void main(String[] args) {
        // Variable to store first character.
        final char c1 = 'I';
        // Variable to store second character.
        final char c2 = 'F';
        // Variable to store third character.
        final char c3 = 'E';
        // Variable to store fourth character.
        final char c4 = 'B';
        // Variable to store fifth character.
        final char c5 = 'A';
        System.out.println("Original: " + c1 + c2 + c3 + c4 + c5);

        // Variable to store first character as an integer.
        int digit1 = c1 - 'A' + 1;
        // Variable to store second character as an integer.
        int digit2 = c2 - 'A' + 1;
        // Variable to store third character as an integer.
        int digit3 = c3 - 'A' + 1;
        // Variable to store fourth character as an integer.
        int digit4 = c4 - 'A' + 1;
        // Variable to store fifth character as an integer.
        int digit5 = c5 - 'A' + 1;
        // Variable to store characters as an encoded value in base 56.
        int base56 = digit1 * BASE56 * BASE56 * BASE56 * BASE56
                + digit2 * BASE56 * BASE56 * BASE56
                + digit3 * BASE56 * BASE56 + digit4 * BASE56 + digit5;
        System.out.println("Encoded: " + base56);

        // Variable to store first digit of the encoded number in base 56.
        int decodeDigit1 = base56 / (BASE56 * BASE56 * BASE56 * BASE56);
        // Variable to store remainder.
        int remainder = base56 % (BASE56 * BASE56 * BASE56 * BASE56);
        // Variable to store second digit of the encoded number in base 56.
        int decodeDigit2 = remainder / (BASE56 * BASE56 * BASE56);
        remainder = remainder % (BASE56 * BASE56 * BASE56);
        // Variable to store third digit of the encoded number in base 56.
        int decodeDigit3 = remainder / (BASE56 * BASE56);
        remainder = remainder % (BASE56 * BASE56);
        // Variable to store fourth digit of the encoded number in base 56.
        int decodeDigit4 = remainder / BASE56;
        remainder = remainder % BASE56;
        // Variable to store fifth digit of the encoded number in base 56.
        int decodeDigit5 = remainder;

        // Variable to store first character of decoded characters
        char decode1 = (char) (decodeDigit1 - 1 + 'A');
        // Variable to store second character of decoded characters
        char decode2 = (char) (decodeDigit2 - 1 + 'A');
        // Variable to store third character of decoded characters
        char decode3 = (char) (decodeDigit3 - 1 + 'A');
        // Variable to store fourth character of decoded characters
        char decode4 = (char) (decodeDigit4 - 1 + 'A');
        // Variable to store fifth character of decoded characters
        char decode5 = (char) (decodeDigit5 - 1 + 'A');
        System.out.println("Decoded: " + decode1 + decode2
                + decode3 + decode4 + decode5);
    }

};
