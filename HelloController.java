package com.example.parc1progra2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class HelloController implements Initializable {

    @FXML
    private TextField tfNombres;
    @FXML
    private TextField tfApellidos;
    @FXML
    private TextField tfDatos;

    @FXML
    private ChoiceBox<String> chAnio;

    @FXML
    private void accionMostrar(ActionEvent evento) {
        String nombre = tfNombres.getText();
        String apellido = tfApellidos.getText();
        String anio = chAnio.getValue();
        tfDatos.setText("Nombres: " + nombre + " Apellidos: " + apellido + " Año de nacimiento: " + anio);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfNombres.setText("-----");
        chAnio.getItems().addAll("2000", "2014", "1989", "2001", "1995");
    }
}