package assignment1;

import View.LoginPage;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        LoginPage loginPage = new LoginPage();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
