package com.example.interfazcolores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    //ID's

    @FXML
    private Label valorRojo;
    @FXML
    private Label valorVerde;
    @FXML
    private Label valorAzul;

    @FXML
    private Label botonNegro;
    @FXML
    private Label botonGrisOscuro;
    @FXML
    private Label botonGris;
    @FXML
    private Label botonGrisClaro;
    @FXML
    private Label botonBlanco;
    @FXML
    private Label botonMagenta;
    @FXML
    private Label botonAzul;
    @FXML
    private Label botonCian;
    @FXML
    private Label botonVerde;
    @FXML
    private Label botonAmarillo;
    @FXML
    private Label botonNaranja;
    @FXML
    private Label botonRojo;
    @FXML
    private Label botonRosa;

    @FXML
    private ScrollBar ScrollBarRojo;
    @FXML
    private ScrollBar ScrollBarVerde;
    @FXML
    private ScrollBar ScrollBarAzul;



    //METODOS

    @FXML
    private void cambiarColorBoton (ActionEvent event){

    }

    @FXML
    private void cambiarValorScrollBarRojo(ActionEvent event) {
        double valorScrollBarRojo = ScrollBarRojo.getValue();
        valorRojo.setText(String.valueOf(valorScrollBarRojo));

    }

/*
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

 */

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}