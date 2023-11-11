package com.poo05.proyectoed;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void switchToAgregar() throws IOException{
        App.setRoot("elegircontacto");
    }
    
    @FXML
    private void SeccionGrupos(){
    
    }
}