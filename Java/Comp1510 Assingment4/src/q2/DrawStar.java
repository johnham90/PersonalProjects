package q2;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 * <p>DrawStar allows the user to draw several stars by clicking, dragging, and
 * releasing the mouse.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class DrawStar extends Application {
    
    /** Width of lines and center circle. */
    private static final int WIDTH = 3;
    
    /** The contents of the application scene. */
    private Group root;

    /** Center point. */
    private Point2D center;
    
    /** Point on scene. */
    private Point2D point;
    
    /** circle to move to first mouse click location. */
    private Circle atCenter = new Circle(0, 0, WIDTH);
        
    /** First line in star. */
    private Line line;
    
    /** Second line in star. */
    private Line line2;

    /** Third line in star. */
    private Line line3;
    
    /** Fourth line in star. */
    private Line line4;
    
    /** Fifth line in star. */
    private Line line5;
   
    /**
     * <p>Displays an initially empty scene, waiting for the user to draw lines
     * with the mouse.</p>
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        root = new Group(atCenter);
        atCenter.setFill(Color.CYAN);

        final int appWidth = 1000;
        final int appHeight = 800;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);

        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseDragged(this::processMouseDrag);
        
        primaryStage.setTitle("Star");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * <p>On mouse press, draws a circle at the mouse cursor and sets the five
     * lines of the stars and adds them to the root.</p>
     * 
     * @param event
     *            invoked this method
     */
    public void processMousePress(MouseEvent event) {
        center = new Point2D(event.getX(), event.getY());

        atCenter.setCenterX(event.getX());
        atCenter.setCenterY(event.getY());
        
        line = new Line(event.getX(), event.getY(), event.getX(), event.getY());
        line.setStroke(Color.CYAN);
        line.setStrokeWidth(WIDTH);
        
        line2 = new Line(event.getX(), event.getY(), 
                event.getX(), event.getY());
        line2.setStroke(Color.CYAN);
        line2.setStrokeWidth(WIDTH);
        
        line3 = new Line(event.getX(), event.getY(), 
                event.getX(), event.getY());
        line3.setStroke(Color.CYAN);
        line3.setStrokeWidth(WIDTH);
        
        line4 = new Line(event.getX(), event.getY(), 
                event.getX(), event.getY());
        line4.setStroke(Color.CYAN);
        line4.setStrokeWidth(WIDTH);
        
        line5 = new Line(event.getX(), event.getY(), 
                event.getX(), event.getY());
        line5.setStroke(Color.CYAN);
        line5.setStrokeWidth(WIDTH);
        
        root.getChildren().add(line);
        root.getChildren().add(line2);
        root.getChildren().add(line3);
        root.getChildren().add(line4);
        root.getChildren().add(line5);

    }

    /**
     * <p>When the mouse is dragged, draws a star based on where the cursor is 
     * when the mouse button is released.</p>
     * 
     * @param event
     *            invoked this method
     */
    public void processMouseDrag(MouseEvent event) {
        final int rotateAngle = 144;
        
        Rotate rotate;

        rotate = new Rotate(rotateAngle, center.getX(), center.getY());
        point = new Point2D(rotate.transform(event.getX(), 
                event.getY()).getX(), rotate.transform(event.getX(), 
                event.getY()).getY());
        
        line.setStartX(event.getX());
        line.setStartY(event.getY());
        line.setEndX(point.getX());
        line.setEndY(point.getY());
        
        line2.setStartX(point.getX());
        line2.setStartY(point.getY());
        point = new Point2D(rotate.transform(point).getX(), 
                rotate.transform(point).getY());
        line2.setEndX(point.getX());
        line2.setEndY(point.getY());
        
        line3.setStartX(point.getX());
        line3.setStartY(point.getY());
        point = new Point2D(rotate.transform(point).getX(), 
                rotate.transform(point).getY());
        line3.setEndX(point.getX());
        line3.setEndY(point.getY());
        
        line4.setStartX(point.getX());
        line4.setStartY(point.getY());
        point = new Point2D(rotate.transform(point).getX(), 
                rotate.transform(point).getY());
        line4.setEndX(point.getX());
        line4.setEndY(point.getY());
        
        line5.setStartX(point.getX());
        line5.setStartY(point.getY());
        point = new Point2D(rotate.transform(point).getX(), 
                rotate.transform(point).getY());
        line5.setEndX(point.getX());
        line5.setEndY(point.getY());
    }
    
    /**
     * <p>Launches the JavaFX application.</p>
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

