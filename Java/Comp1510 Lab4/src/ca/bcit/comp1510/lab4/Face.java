/**
 * 
 */
package ca.bcit.comp1510.lab4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Draws a rough picture of my face using JavaFX.
 * @author hamj1
 * @version 2018.02.05
 */
public class Face extends Application {

    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage arg0) throws Exception {
        Ellipse base = new Ellipse(300, 200, 100, 110);
        base.setFill(Color.rgb(239,199,124));
        Ellipse leftEar = new Ellipse(200, 205, 8, 12);
        leftEar.setFill(Color.rgb(239,199,124));
        Ellipse rightEar = new Ellipse(400, 205, 8, 12);
        rightEar.setFill(Color.rgb(239,199,124));
        Ellipse hair1 = new Ellipse(340, 145, 40, 80);
        hair1.setRotate(-50);
        Ellipse hair2 = new Ellipse(240, 150, 70, 30);
        hair2.setRotate(125);
        Rectangle glassesLeft = new Rectangle (240, 190, 45, 25);
        glassesLeft.setFill(Color.TRANSPARENT);
        glassesLeft.setStroke(Color.BLACK);
        Rectangle glassesRight = new Rectangle (320, 190, 45, 25);
        glassesRight.setFill(Color.TRANSPARENT);
        glassesRight.setStroke(Color.BLACK);
        Line glassesBridge = new Line(285, 195, 320, 195);
        Circle leftEye = new Circle(260, 200, 10);
        Circle rightEye = new Circle(340, 200, 10);
        Line nose = new Line(300, 185, 305, 235);
        Line nose2 = new Line(305, 235, 290, 235);
        Arc mouth = new Arc(300, 230, 60, 50, 210, 100);
        mouth.setType(ArcType.OPEN);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(null);
        Rectangle neck = new Rectangle(270, 300, 50, 50);
        neck.setFill(Color.rgb(239,199,124));
        Rectangle torso = new Rectangle(180, 350, 240, 500);
        torso.setFill(Color.rgb(0, 0, 40));
        torso.setArcHeight(100);
        torso.setArcWidth(100);
        
        Group me = new Group(torso, rightEar, leftEar, base, leftEye, rightEye, 
                hair1, hair2, mouth, neck, glassesLeft, glassesRight, 
                glassesBridge, nose, nose2);
        Scene scene = new Scene(me, 600, 600);
        arg0.setTitle("My Self-Portrait");
        arg0.setScene(scene);
        arg0.show();
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }

}
