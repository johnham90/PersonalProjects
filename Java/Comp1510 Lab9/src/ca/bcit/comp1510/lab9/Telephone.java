/**
 * 
 */
package ca.bcit.comp1510.lab9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Telephone displays a set of buttons simulating a telephone number pad. Each
 * button pressed prints out a the number at the top of the window.
 * 
 * @author John Ham
 * @version 2018.03.05
 */
public class Telephone extends Application {
    
    /** Label to contain the buttons pressed. */
    private Label phoneNumber = new Label();
    
    /** Button for each number. */
    private Button numPad;
    
    /** GridPane for buttons. */
    private GridPane grid = new GridPane();

    @Override
    public void start(Stage password) throws Exception {
        final int width = 200;
        final int height = 200;
        final int row = 4;
        final int column = 3;
        
        int k = 1;
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < column; j++) {
                String number = "" + k;
                numPad = new Button(number);
                numPad.setOnAction((event) -> {
                    phoneNumber.setText(phoneNumber.getText() + number);
                });
//                numPad.setOnAction(this::pressNum);
                grid.add(numPad, j, i);
                k++;
            }
        }
        
        numPad = new Button("*");
        grid.add(numPad, 0, row);
        numPad.setOnAction((event) -> {
            phoneNumber.setText(phoneNumber.getText() + "*");
        });
//        numPad.setOnAction(this::pressNum);
        numPad = new Button("0");
        grid.add(numPad, 1, row);
        numPad.setOnAction((event) -> {
            phoneNumber.setText(phoneNumber.getText() + "0");
        });
//        numPad.setOnAction(this::pressNum);
        numPad = new Button("#");
        grid.add(numPad, 2, row);
        numPad.setOnAction((event) -> {
            phoneNumber.setText(phoneNumber.getText() + "#");
        });
//        numPad.setOnAction(this::pressNum);
        grid.add(phoneNumber, 0, 0, column, 1);
        
        Scene scene = new Scene(grid, width, height);

        password.setTitle("Telephone");
        password.setScene(scene);
        password.show();
    }
    
//    /**
//     * When a button is pressed, concatenates the number on the button to the 
//     * phoneNumber label. 
//     * 
//     * @param event
//     *          Button press.
//     */
//    public void pressNum(ActionEvent event) {
//        Button a = (Button) event.getSource();
//        phoneNumber.setText(phoneNumber.getText() + a.getText());
//    }
    
    /**
     * Drives the program.
     * @param args
     *          Unused.
     */
    public static void main(String[] args) {
        launch(args);
    }

}
