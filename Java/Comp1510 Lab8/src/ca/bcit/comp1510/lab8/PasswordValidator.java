/**
 * 
 */
package ca.bcit.comp1510.lab8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * PasswordValidator asks for a password and confirms if both inputs of the
 * password are the same, if the password contains at least one capital letter,
 * one lower case letter, one number, one special character, and if the password
 * is between 8 and 10 characters long inclusive when pressing the submit 
 * button.
 * @author John Ham
 * @version 2018.03.05
 */
public class PasswordValidator extends Application {
    
    @Override
    public void start(Stage password) throws Exception {
        final TextField enterPassword = new TextField();
        final TextField confirmPassword = new TextField();
        final int width = 400;
        final int height = 100;
        final GridPane grid = new GridPane();
        final Label enter = new Label("Enter password : ");
        final Label confirm = new Label("Confirm password : ");
        final Button submit = new Button("Submit");
        final Label ifValid = new Label();    

        ForbiddenWords wordlist = 
                new ForbiddenWords("src/ca/bcit/comp1510/lab8/wordlist.txt");

        submit.setOnAction((event) -> {
            if (!enterPassword.getText().equals(confirmPassword.getText())) {
                ifValid.setText("Passwords do not match!");
            } else if (wordlist.containsWord(enterPassword.getText())) {
                ifValid.setText("Password is a forbidden word!");
            } else if (!isLength(enterPassword.getText())) {
                ifValid.setText("Password is not between 8 and 10 letters!");
            } else if (!hasLower(enterPassword.getText())) {
                ifValid.setText("Password needs lower case letters!");
            } else if (!hasSpecialChar(enterPassword.getText())) {
                ifValid.setText("Password needs special characters!");
            } else if (!hasCapital(enterPassword.getText())) {
                ifValid.setText("Password needs capital letters!");
            } else if (!hasNumber(enterPassword.getText())) {
                ifValid.setText("Password needs numbers!");
            } else {
                ifValid.setText("Valid");
            }
        });
        
        grid.add(enter, 0, 0);
        grid.add(confirm, 0, 1);        
        grid.add(enterPassword, 1, 0);
        grid.add(confirmPassword, 1, 1);
        grid.add(submit, 0, 2);
        grid.add(ifValid, 1, 2);
        
        Scene scene = new Scene(grid, width, height);

        password.setTitle("Password Validator");
        password.setScene(scene);
        password.show();
    }
    
    /**
     * Checks whether the password has capital letters.
     * @param password
     *          String for password.
     * @return Boolean value that depends on existence of a capital letter.
     */
    private boolean hasCapital(String password) {
        return password != password.toLowerCase();
    }
    
    /**
     * Checks whether the password has lower case letters.
     * @param password
     *          String for password
     * @return Boolean value that depends on existence of a lower case letter.
     */
    private boolean hasLower(String password) {
        return password != password.toUpperCase();
    }
    
    /**
     * Checks whether the password has a number.
     * @param password
     *          String for password
     * @return Boolean value that depends on existence of a number.
     */
    private boolean hasNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks whether the password has a special character, which is
     * one of the following : !, ", #, $, %, &, ', (, ), *.
     * @param password
     *          String for password
     * @return Boolean value that depends on existence of a special character.
     */
    private boolean hasSpecialChar(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == '!' || password.charAt(i) == '\"' 
                    || password.charAt(i) == '#' || password.charAt(i) == '$' 
                    || password.charAt(i) == '%' || password.charAt(i) == '&' 
                    || password.charAt(i) == '\'' || password.charAt(i) == '(' 
                    || password.charAt(i) == ')' || password.charAt(i) == '*') {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks whether the password is between 8 and 10 letters inclusive.
     * @param password
     *          String for password.
     * @return Boolean value that depends on the length of the password.
     */
    private boolean isLength(String password) {
        final int length8 = 8;
        final int length10 = 10;
        return password.length() >= length8 && password.length() <= length10;
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
