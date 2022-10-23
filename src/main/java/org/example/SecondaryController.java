package org.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class SecondaryController implements Initializable{

	@FXML
	private Label fortuneDisplayLabel;
	
    @FXML
    private void goBack() throws IOException {
        App.setRoot("primary");
    }

    //La interfaz Initializable de javafx permite declarar un método para que se ejecute
    //cada vez que se cambie a la escena de este controlador sin tener que modificar App.java.
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		String fortune = StaticData.getRandomFortune();
		String luckyNumbers = drawLuckyNumbers();
		String fullFortune = StaticData.latestSign + ", " + fortune + "\nLos números de la suerte para " + StaticData.latestName + " son:\n" + luckyNumbers;
		fortuneDisplayLabel.setText(fullFortune);
	}

	private String drawLuckyNumbers() {
		String luckyNumbers = "";
		
		for (int i = 0; i<7; i++) {
			luckyNumbers += (int)Math.floor(Math.random() * 100) + " ";
		}
		return luckyNumbers;
	}
}