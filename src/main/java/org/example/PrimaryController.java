package org.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

	@FXML
	private TextField nameTextField;
	
	@FXML
	private TextField signTextField;
	
    @FXML
    private void displayFortune() throws IOException {
    	StaticData.latestName = nameTextField.getText();
    	StaticData.latestSign = signTextField.getText();
        App.setRoot("secondary");
    }

    //La interfaz Initializable de javafx permite declarar un método para que se ejecute
    //cada vez que se cambie a la escena de este controlador sin tener que modificar App.java.
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameTextField.setText(StaticData.latestName);
		signTextField.setText(StaticData.latestSign);
	}
}
