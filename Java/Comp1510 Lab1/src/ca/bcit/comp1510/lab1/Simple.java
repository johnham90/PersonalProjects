/**
 * 
 */
package ca.bcit.comp1510.lab1;

/**
 * Details on attempting various class names.
 * 
 * @author John Ham
 * @version 01.17.18
 */
public class Simple {

    /**
     * Comments mentioning attempts to create class names.
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        System.out.println("I love Java");
        //1. When trying to create a class named "simple", I can't make one 
        //because the class "simple" already exists, just with an upper case s.
        //2. There are no problems when creating "SimpleClass"
        //3. Class "1Simple" cannot be made 
        //because an identifier can't start with numbers
        //4. There are no problems when creating "_Simple_"
        //5. Class "*Simple*" cannot be made because an identifier can't 
        //contain the * symbol
        //6. Class "$123_45" can be made but is discouraged as by 
        //convention Java type names do not contain the $ symbol
        //7. Class "!Simple" cannot be made because an identifier can't
        //contain the ! symbol.
    }

}
