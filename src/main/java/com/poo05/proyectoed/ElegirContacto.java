/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo05.proyectoed;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author USERº
 */
public class ElegirContacto {
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
     
    @FXML
    private void switchToPersona() throws IOException {
        App.setRoot("crear");
    }
    
     @FXML
    private void switchToEmpresa() throws IOException {
        App.setRoot("crear");
    }
    
}
