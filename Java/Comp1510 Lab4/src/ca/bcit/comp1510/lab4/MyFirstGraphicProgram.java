/**
 * 
 */
package ca.bcit.comp1510.lab4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Uses JavaFX to draw a circle with my name inside.
 * @author hamj1
 * @version 2018.02.05
 */
public class MyFirstGraphicProgram extends Application {
    
    /**
     * Constant for center of circle.
     */
    static final int CENTERCIRCLE = 250;
    /**
     * Constant for x position of text.
     */
    static final int XTEXT = 225;
    /**
     * Constant for y position of text.
     */
    static final int YTEXT = 255;
    /**
     * Constant for radius of circle.
     */
    static final int RADIUS = 100;
    /**
     * Constant for size of scene.
     */
    static final int SCENE = 500;
    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage arg0) throws Exception {
        Circle circle = new Circle(CENTERCIRCLE, CENTERCIRCLE, RADIUS);
        circle.setFill(Color.GREEN);
        
        Text name = new Text(XTEXT, YTEXT, "John Ham");
        name.setFill(Color.WHITE);
        
        Group group = new Group(circle, name);
        Scene scene = new Scene(group, SCENE, SCENE);
        arg0.setTitle("My first JavaFX program.");
        arg0.setScene(scene);
        arg0.show();
        
        // I could only see 1/4 of the circle on the top left corner.
        // The color of the circle was black.
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }

}
