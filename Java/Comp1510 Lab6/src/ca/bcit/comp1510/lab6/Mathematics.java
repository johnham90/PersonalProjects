/**
 * 
 */
package ca.bcit.comp1510.lab6;

import java.util.Random;

/**
 * Mathematics contains several methods that calculate various equations.
 * @author John Ham
 * @version 2018.02.26
 */
public class Mathematics {
    /** Constant for Pi. */
    public static final double PI = 3.14159;
    /** Constant for a foot to kilometer ratio. */
    public static final double ONE_FOOT_TO_KILOMETRE_RATIO = 0.0003048;
    
    /**
     * Returns the area of the circle with the specified radius.
     * @param radius
     *          of the circle
     * @return area as a double
     */
    public double getCircleArea(double radius) {
        return PI * radius * radius;
    }
    
    /**
     * Returns the area of the circle with the specified edge length.
     * @param edgeLength
     *              of the square
     * @return area as a double
     */
    public double getSquareArea(double edgeLength) {
        return edgeLength * edgeLength;
    }
    
    /**
     * Returns the sum of the specified values.
     * @param first
     *          operand
     * @param second
     *          operand
     * @return sum of the operands
     */
    public double add(double first, double second) {
        return first + second;
    }
    
    /**
     * Returns the product of the specified values.
     * @param first
     *          operand
     * @param second
     *          operand
     * @return product of the operands
     */
    public double multiply(double first, double second) {
        return first * second;
    }
    
    /**
     * Returns the difference of the specified values.
     * @param first
     *          operand
     * @param second
     *          operand
     * @return difference of the operands
     */
    public double subtract(double first, double second) {
        return first - second;
    }
    
    /**
     * Returns the quotient of the specified values. If the divisor is zero,
     * returns zero instead of NaN or infinity
     * @param first
     *          operand
     * @param second
     *          operand
     * @return quotient of the operands
     */
    public double divide(double first, double second) {
        if (second == 0) {
            return 0;
        } else {
            return first / second;
        }
    }
    
    /**
     * Returns the absolute value of the specified integer.
     * @param number
     *          to test
     * @return absolute value of number
     */
    public int absoluteValue(int number) {
        if (number > 0) {
            return number;
        } else {
            return -number;
        }
    }
    
    /**
     * Returns a random number between 10 and 20 inclusive, but NOT 15.
     * @return random number in range [10, 20] excluding 15
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        // Constant to generate a number larger than 9.
        final int max = 10;
        // Constant to hold the exception, 15.
        final int exception = 15;
        Random rng = new Random();
        int number;
        do {
            number = rng.nextInt(max + 1) + max;
        } while (number == exception);
        return number;
    }
    
    /**
     * Converts the specified number of feet to kilometers.
     * @param feet
     *          to convert
     * @return kilometers in the specified number of feet
     */
    public double convertFeetToKilometres(double feet) {
        return feet * ONE_FOOT_TO_KILOMETRE_RATIO;
    }
    
    /**
     * Returns the sum of the positive integers between 0 and the specified 
     * number inclusive. If the specified number is negative, returns 0.
     * @param number
     *          upper bound
     * @return sum as an integer
     */
    public int sumOfInts(int number) {
        // Variable to hold sum of integers.
        int sum = 0;
        if (number < 0) {
            return sum;
        } else {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
         return sum;   
        }
    }
    
    /**
     * Returns true if the specified value is positive, else false.
     * @param number
     *          to test
     * @return true if number is positive, else false
     */
    public boolean isPositive(int number) {
        return number > 0;
    }
    
    /**
     * Returns true if the specified value is even, else false.
     * @param number
     *          to test
     * @return true if the number is even, else false
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns sum of the even numbers between 0 and the specified value,
     * inclusive.
     * @param number
     *          upper bound
     * @return sum of the even numbers between 0 and number
     */
    public int sumOfEvens(int number) {
        // Variable to hold sum of even numbers smaller than parameter.
        int sum = 0;
        if (number >= 0) {
            for (int i = 1; i * 2 <= number; i++) {
                sum += i * 2;
            }
            return sum;
        } else {
            for (int i = -1; i * 2 >= number; i--) {
                sum += i * 2;
            }
            return sum; 
        }
    }
    
    /**
     * Returns the sum of the numbers between zero and the first parameter that
     * are divisible by the second number. For example, sumOfProducts(10, 3) 
     * will return 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return 
     * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducs(-10, 2) will return
     * -2 + -4 + - 6 + -8 + -10 = -30.
     * @param bound
     *          the upper bound
     * @param divisor
     *          the divisor
     * @return sum
     */
    public int sumOfProducts(int bound, int divisor) {
        // Variable to hold sum of products.
        int sum = 0;
        if (bound >= 0) {
            for (int i = 1; i * divisor <= bound; i++) {
                sum += i * divisor;
            }
            return sum;
        } else {
            for (int i = -1; i * divisor >= bound; i--) {
                sum += i * divisor;
            }
            return sum;
        }
    }

}
