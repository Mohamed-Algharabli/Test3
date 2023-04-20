package View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SystemPage extends Stage {

    private Label labelparent, labelUSD, labelNIS, labelTO;
    private Button buttonLogOut, buttonConvert;
    private TextField textField1, textField2;

    public SystemPage() {

        labelparent = new Label("Currency Conversion System");
        labelUSD = new Label("USD");
        labelNIS = new Label("NIS");
        labelTO = new Label("TO");

        buttonLogOut = new Button("Log out");
        buttonLogOut.setId("Log-out");
        buttonConvert = new Button("Convert");

        buttonConvert.setOnAction(e -> {
            Double usd = Double.parseDouble(textField1.getText());
            Double nis = usd * 3.60;
            textField2.setText(String.format("%,.1f nis", nis));
        });
        buttonLogOut.setOnAction(e -> {
            this.close();
        });

        textField1 = new TextField();
        textField2 = new TextField();

        HBox hBox1 = new HBox(230, labelparent, buttonLogOut);
        hBox1.setAlignment(Pos.TOP_CENTER);

        HBox hBox2 = new HBox(170, labelUSD, labelNIS);
        hBox2.setAlignment(Pos.CENTER);

        HBox hBox3 = new HBox(10, textField1, labelTO, textField2);
        hBox3.setAlignment(Pos.CENTER);

        VBox vBox1 = new VBox(15, hBox2, hBox3);
        vBox1.setAlignment(Pos.CENTER);

        HBox hBox4 = new HBox(buttonConvert);
        hBox4.setAlignment(Pos.BOTTOM_CENTER);

        VBox vBox = new VBox(65, hBox1, vBox1, hBox4);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox, 565, 300);
        scene.getStylesheets().add("css/SystemPage.css");
        this.setScene(scene);
        this.setTitle("Currency Conversion System");
        this.show();
    }

}
