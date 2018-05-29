/**
 * 
 */
package ca.bcit.comp1510.lab7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * PasswordValidator asks for a password and confirms if both inputs of the
 * password are the same when pressing the submit button.
 * @author John Ham
 * @version 2018.03.05
 */
public class PasswordValidator extends Application {

    @Override
    public void start(Stage password) throws Exception {
        final int width = 300;
        final int height = 100;
        final GridPane grid = new GridPane();
        final Label enter = new Label("Enter password : ");
        final Label confirm = new Label("Confirm password : ");
        final Label ifValid = new Label();
        final TextField enterPassword = new TextField();
        final TextField confirmPassword = new TextField();
        final Button submit = new Button("Submit");
        
        submit.setOnAction((event) -> {
            if (enterPassword.getText().equals(confirmPassword.getText())) {
                ifValid.setText("VALID");
            } else {
                ifValid.setText("INVALID");
            }
        });
        
        grid.add(enter, 0, 0);
        grid.add(confirm, 0, 1);        
        grid.add(enterPassword, 1, 0);
        grid.add(confirmPassword, 1, 1);
        grid.add(submit, 0, 2);
        grid.add(ifValid, 1, 2);
        grid.setVgap(2);
        grid.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(grid, width, height);

        password.setTitle("Password Validator");
        password.setScene(scene);
        password.show();
    }

    /**
     * Drives the program.
     * @param args
     *          Unused.
     */
    public static void main(String[] args) {
        launch(args);
    }

}
