package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

import java.util.Random;

public class Controller {

    @FXML
    private TextField LengthField;

    @FXML
    private Label Pass1;

    @FXML
    private Label Pass2;

    @FXML
    private Label Pass3;

    @FXML
    public void handleAction() {

        //input length
        Integer l = Integer.valueOf(LengthField.getText());

       // if((LengthField.getText())==""){l =8;}  //default length = 8

        Pass1.setText(String.valueOf(generator(l)));
        Pass2.setText(String.valueOf(generator(l)));
        Pass3.setText(String.valueOf(generator(l)));
    }

    public StringBuilder generator(int l){
        String arr = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz"; // basic array without zero (0) and letter l (l)
        StringBuilder pass = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < l; i++) {
            int randomInt = random.nextInt(arr.length());
            pass.append(arr.charAt(randomInt));
        }
        return pass;
    }

    @FXML
    public void handleCancel() {
        Pass1.setText("");
        Pass2.setText("");
        Pass3.setText("");
        LengthField.setText("");
    }
    @FXML
    public void handleActionCopy1() {
        //create clipboard content
        final ClipboardContent clipboardContent = new ClipboardContent();
        clipboardContent.putString(this.Pass1.getText());

        //set clipboard content
        Clipboard.getSystemClipboard().setContent(clipboardContent);

    }
    @FXML
    public void handleActionCopy2() {
        //create clipboard content
        final ClipboardContent clipboardContent = new ClipboardContent();
        clipboardContent.putString(this.Pass2.getText());

        //set clipboard content
        Clipboard.getSystemClipboard().setContent(clipboardContent);

    }
    @FXML
    public void handleActionCopy3() {
        //create clipboard content
        final ClipboardContent clipboardContent = new ClipboardContent();
        clipboardContent.putString(this.Pass3.getText());

        //set clipboard content
        Clipboard.getSystemClipboard().setContent(clipboardContent);

    }
}
