package ca.bcit.comp1510.lab10;

/**
 * Average calculates the average of the integers input into the console.
 *
 * @author John Ham
 * @version 2018
 */
public class Average {

    /**
     * Drives the program.
     * @param args
     *          Integer input to calculate average.
     */
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No Arguments!");
            return;
        } 
        
        double average = 0;
        int error = 0;
        
        for (int i = 0; i < args.length; i++) {
            try { 
                average += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println(args[i] + " is not a number.");
                error++;
            }
        }
        
        average /= args.length - error;
        
        System.out.println("The average is " + average);
    
    }

}
