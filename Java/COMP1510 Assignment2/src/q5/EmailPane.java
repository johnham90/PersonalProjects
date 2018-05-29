package q5;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * <p>EmailPane represents an email with text fields for receiver, cc, bcc,
 * subject, and content of the email. There is also a button to print out its
 * contents.</p>
 *
 * @author John Ham
 * @version 1.0
 */
public class EmailPane extends GridPane {
    /**
     * Constructs an EmailPane object.
     */
    public EmailPane() {
        final Label to = new Label("To : ");
        final Label bcc = new Label("Bcc : ");
        final Label cc = new Label("CC : ");
        final Label subject = new Label("Subject : ");
        final Label message = new Label("Message : ");
        final TextArea messageBody = new TextArea();
        final TextField enterTo = new TextField();
        final TextField enterCC = new TextField();
        final TextField enterBCC = new TextField();
        final TextField enterSubject = new TextField();
        final Button send = new Button("Send");
        final int row = 4;
        
        add(to, 0, 0);
        add(enterTo, 1, 0);
        add(cc, 0, 1);
        add(enterCC, 1, 1);
        add(bcc, 0, 2);
        add(enterBCC, 1, 2);
        add(subject, 0, row - 1);
        add(enterSubject, 1, row - 1);
        add(message, 0, row);
        add(messageBody, 1, row);
        add(send, 1, row + 1);
        
        send.setOnAction((event) -> {
            System.out.println(to.getText() + enterTo.getText() + "\n" 
                    + cc.getText() + enterCC.getText() + "\n" + bcc.getText() 
                    + enterBCC.getText() + "\n" + subject.getText()
                    + enterSubject.getText() + "\n" + message.getText()
                    + messageBody.getText());
        });
    }
}
