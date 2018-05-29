package q4;

import java.util.Scanner;

/**
 * <p>BoxTest checks if the Box class is working properly by instantiating two
 * Box classes and using the methods inside the Box class.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class BoxTest {
    /**
     * <p>Drives the program.</p>
     *
     * @param args 
     *          Unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the double values for the height, "
                + "width, and depth of the first box separated by spaces : ");
        Box box1 = new Box(scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble());
        System.out.println("Please enter the double values for the height, "
                + "width, and depth of the second box separated by spaces : ");
        Box box2 = new Box(scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble());
        System.out.println("First " + box1.toString() + "\nSecond "
                + box2.toString());
        
        System.out.println();

        System.out.println("Please enter a new value for the height, width, "
                + "and depth of the first box separated by spaces : ");
        box1.setHeight(scan.nextDouble());
        box1.setWidth(scan.nextDouble());
        box1.setDepth(scan.nextDouble());
        box1.setFull(true);
        System.out.println("The new height of the first box is : "
                + box1.getHeight() + "\nThe new width of the first box is : "
                + box1.getWidth() + "\nThe new depth of the first box is : "
                + box1.getDepth() + "\nThe new full value of the first box "
                + "is : " + box1.getFull());
        
        System.out.println();

        System.out.println("Please enter a new value for the height, width, "
                + "and depth of the second box separated by spaces : ");
        box2.setHeight(scan.nextDouble());
        box2.setWidth(scan.nextDouble());
        box2.setDepth(scan.nextDouble());
        box2.setFull(true);
        System.out.println("The new height of the second box is : "
                + box2.getHeight() + "\nThe new width of the second box is : "
                + box2.getWidth() + "\nThe new depth of the second box is : "
                + box2.getDepth() + "\nThe new full value of the second box "
                + "is : " + box2.getFull());

        System.out.println();

        System.out.println("Final : " + "\nFirst " + box1.toString()
                + "\nSecond " + box2.toString());
        
        scan.close();
    }

};
