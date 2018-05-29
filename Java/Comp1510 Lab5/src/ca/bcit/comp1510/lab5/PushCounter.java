package ca.bcit.comp1510.lab5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * PushCounter counts the number of times two buttons are pressed and provides
 * a text field to set the number of times the buttons are pressed to a new
 * value.
 * 
 * @author John Ham
 * @version 1.0
 */
public class PushCounter extends Application {
    /** Holds the number of time the YES button is pressed. */
    private int countYes;
    /** Displays the number of times the YES button is pressed. */
    private Text countTextYes;
    /** Holds the number of time the NO button is pressed. */
    private int countNo;
    /** Displays the number of times the NO button is pressed. */
    private Text countTextNo;

    /**
     * Presents a GUI containing two button and text that displays how many
     * times the button is pushed. There is also a text box which sets the 
     * number of times each button was pushed.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        TextField setCounter = new TextField();
        setCounter.setPromptText("Set Counter To");
        setCounter.setOnAction((event) -> {
            countTextYes.setText("Pushes: " + setCounter.getCharacters());
            countYes = Integer.parseInt(setCounter.getText());
            countTextNo.setText("Pushes: " + setCounter.getCharacters());
            countNo = Integer.parseInt(setCounter.getText());
            setCounter.setText(null);
        });

        countYes = 0;
        countTextYes = new Text("YES: 0");
        
        Button pushYesUp = new Button("YES MORE!");
        pushYesUp.setOnAction((event) -> {
            countYes++;
            countTextYes.setText("Pushes: " + countYes);
        });
        
        Button pushYesDown = new Button("YES LESS!");
        pushYesDown.setOnAction((event) -> {
            countYes--;
            countTextYes.setText("Pushes: " + countYes);
        });
        
        countNo = 0;
        countTextNo = new Text("NO: 0");
        
        Button pushNoUp = new Button("NO MORE!");
        pushNoUp.setOnAction((event) -> {
            countNo++;
            countTextNo.setText("Pushes: " + countNo);
        });
        
        Button pushNoDown = new Button("NO LESS!");
        pushNoDown.setOnAction((event) -> {
            countNo--;
            countTextNo.setText("Pushes: " + countNo);
        });

        FlowPane pane = new FlowPane(setCounter, pushYesUp, countTextYes,
                pushYesDown, pushNoUp, countTextNo, pushNoDown);
        pane.setAlignment(Pos.CENTER);
        
        final int horizontalGap = 20;
        pane.setHgap(horizontalGap);
        pane.setStyle("-fx-background-color: orange");
        
        final int appWidth = 500;
        final int appHeight = 100;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * Launches the JavaFX application.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

