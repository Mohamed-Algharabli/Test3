package View;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginPage extends Stage {

    private Image image;
    private ImageView imageView;
    private Label labelUserName, labelPassword, labelError;
    private TextField textFieldLoginName;
    private PasswordField passwordField;
    private Button buttonSubmit;

    public LoginPage() {

        image = new Image("file:src\\Image/firstImage.png");
        imageView = new ImageView(image);
        imageView.setFitHeight(120);
        imageView.setFitWidth(120);
        labelUserName = new Label("User Name");
        textFieldLoginName = new TextField();
        labelPassword = new Label("Password");
        passwordField = new PasswordField();
        buttonSubmit = new Button("Login");
        labelError = new Label("");
        buttonSubmit.setOnAction(e -> {
            if (textFieldLoginName.getText().equals("Mohamed") && passwordField.getText().equals("123456")) {
                labelError.setText("Valid User");
                new SystemPage().show();
            } else {
                labelError.setText("InValid User");
            }
        });
        VBox vBox = new VBox(imageView, labelUserName, textFieldLoginName, labelPassword, passwordField, labelError, buttonSubmit);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(40));
        vBox.setSpacing(15);
        Scene scene = new Scene(vBox, 345, 600);
        scene.getStylesheets().add("/css/LoginPage.css");
        this.setScene(scene);
        this.setTitle("Login");
        this.show();
    }
}
