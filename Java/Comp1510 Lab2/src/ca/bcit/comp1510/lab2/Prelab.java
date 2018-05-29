/**
 */
package ca.bcit.comp1510.lab2;

/**
 * @author John Ham
 * @version 01.22.2018
 */
public class Prelab {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1. a. int x; means to create a variable x which can contain integer 
         * values but not designate a value yet. b. int x = 3; means to set 
         * a variable x which has a value of 3. c. x = 3; causes an error, 
         * as the variable type of x is not defined.
         * 
         * 2. a. a + b * c = 66 b. a - b - c = -13 c. a / b = 0 if set as 
         * double, first divide as int then change to double? d. b / a = 3 
         * e. a - b / c = 2 f. w / y =  4.03125 g. y / w = 0.24806201550387597 
         * h. a + w / b = 4.433333333333334 i. a % b / y = 0.9375 j. b % a = 0 
         * k. w % y = 0.09999999999999964
         */ 
         int a = 3; 
         int b = 9; 
         int c = 7; 
         double w = 12.9; 
         double y = 3.2; 
         double d = w % y;
         System.out.println(d);
    }

}
