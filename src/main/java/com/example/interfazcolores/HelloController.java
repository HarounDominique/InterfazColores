package com.example.interfazcolores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

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

    @FXML
    private Pane PanelCentral;



    //METODOS

    //TODO: sólo están correctos los códigos para el cambio de color a negro y a rojo, el resto está por codificar


    @FXML
    private void cambiarColorPorBotonNegro (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color:  #000000;");
    }
    @FXML
    private void cambiarColorPorBotonGrisOscuro (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }
    @FXML
    private void cambiarColorPorBotonGris (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }
    @FXML
    private void cambiarColorPorBotonGrisClaro (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }
    @FXML
    private void cambiarColorPorBotonBlanco (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }
    @FXML
    private void cambiarColorPorBotonMagenta (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }
    @FXML
    private void cambiarColorPorBotonAzul (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }
    @FXML
    private void cambiarColorPorBotonCian (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }
    @FXML
    private void cambiarColorPorBotonVerde (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }
    @FXML
    private void cambiarColorPorBotonAmarillo (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }
    @FXML
    private void cambiarColorPorBotonNaranja (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }
    @FXML
    private void cambiarColorPorBotonRojo (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }
    @FXML
    private void cambiarColorPorBotonRosa (ActionEvent event){

        PanelCentral.setStyle("-fx-background-color: #ff0000;");
    }

/*
    @FXML
    private void cambiarValorScrollBarRojo(ActionEvent event) {
        double valorScrollBarRojo = ScrollBarRojo.getValue();
        valorRojo.setText(String.valueOf(valorScrollBarRojo));

    }

 */

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