package q2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>Primes represents a system that has an ArrayList containing boolean values
 * that show whether a number is a prime or not until a certain number.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class Primes {
    
    /**ArrayList that contains booleans for whether a number is prime or not.*/
    private ArrayList<Boolean> primes;
    
    /**
     * <p>Constructs a primes object by defining a number. An ArrayList is
     * instantiated with false values for the first and second index, and true
     * values for indexes until the number defined. The method calculatesPrimes
     * is called upon to check which numbers are not prime, changing its index 
     * to false. If the input is less than two, an error message will be 
     * displayed.</p>
     * 
     * @param number
     *          Integer value to check for primes.
     */
    public Primes(int number) {
        if (number < 2) {
            throw new IllegalArgumentException("Please enter a number larger "
                    + "than two.");
        }
        primes = new ArrayList<Boolean>();
        primes.add(0, false);
        primes.add(1, false);
        for (int i = 2; i <= number; i++) {
            primes.add(i, true);
        }
        calculatePrimes(number);
    }
    
    /**
     * <p>Calculates whether each number before is the parameter is a prime or
     * not and sets the index of that number to false if it is not.</p>
     * 
     * @param number
     *          Integer value to check for primes.
     */
    private void calculatePrimes(int number) {
        for (int num = 2; num < Math.sqrt(number); num++) {
            for (int mult = 1; num * (mult + 1) <= number; mult++) {
                primes.set(num * (mult + 1), false);
            }
        }
    }
    
    /**
     * <p>Prints out a list of the prime numbers. If there are no prime numbers,
     * prints out an error message.</p>
     * 
     * @return String containing prime numbers.
     */
    private String printPrimes() {
        String listOfPrimes = "The prime numbers between 0 and " 
                + (primes.size() - 1) + " are :\n";
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                listOfPrimes += i + " ";
            }
        }
        return listOfPrimes;
    }
    
    /**
     * Returns the total number of primes before the integer to check.
     * 
     * @return Integer value for the number of primes.
     */
    private int countPrimes() {
        int numberOfPrimes = 0;
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                numberOfPrimes++;
            }
        }
        return numberOfPrimes;
    }
    
    /**
     * Returns whether the number input is a prime number or not. If the number
     * input is larger than the integer to check or smaller than zero, gives an
     * error.
     * 
     * @param numToCheck
     *          Integer value to check if it is a prime.
     * @return Boolean value for if number is a prime.
     */
    private boolean isPrime(int numToCheck) {
        if (numToCheck < 0 || numToCheck > primes.size()) {
            throw new IllegalArgumentException("The value you have entered is "
                    + "not valid. Please enter a number between 0 and " 
                    + primes.size());
        }
        return primes.get(numToCheck);
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args 
     *          command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program uses the sieve of Erotosthenes to "
                + "determine which numbers are prime.\nEnter an upper bound:");
        int userInput = scan.nextInt();
        Primes primes = new Primes(userInput);
        primes.isPrime(2);
        
        System.out.println("There are " + primes.countPrimes() + " primes.");
        System.out.println(primes.printPrimes());
        scan.close();
    }

};
