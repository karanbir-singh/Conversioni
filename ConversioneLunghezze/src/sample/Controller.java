package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Button btnConverti;
    public Label lblMiglia;
    public Label lblIarde;
    public Label lblPiedi;
    public Label lblPollici;
    public TextField txtValore;
    public ComboBox<String> cmbConversioni;
    public Label lblMetri;
    private Conversione conversione;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String s[]= {"Metri","Miglia","Pollici","Piedi","Iarde"};
        conversione = new Conversione();
        lblMetri.setText("0");
        lblIarde.setText("0");
        lblMiglia.setText("0");
        lblPiedi.setText("0");
        lblPollici.setText("0");
        cmbConversioni.getItems().addAll(s);
    }

    public void handleButtonAction(ActionEvent actionEvent) {
        conversione.setValore(Double.parseDouble(txtValore.getText()));

        String tipo = cmbConversioni.getValue();
        conversione.setTipo(tipo);

        lblMetri.setText(Double.toString(conversione.getMetri()));
        lblIarde.setText(Double.toString(conversione.getIarde()));
        lblMiglia.setText(Double.toString(conversione.getMiglia()));
        lblPiedi.setText(Double.toString(conversione.getPiedi()));
        lblPollici.setText(Double.toString(conversione.getPollici()));
    }
}
