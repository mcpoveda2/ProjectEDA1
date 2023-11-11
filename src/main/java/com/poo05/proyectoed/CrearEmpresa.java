/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo05.proyectoed;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author USERº
 */
public class CrearEmpresa {
    
     
    @FXML
    public TextField txtempresa;
    @FXML
    public TextField txtnumeroLocal;
    @FXML
    public TextField txtpersona;
    @FXML
    public TextField txtnumeroP;
    @FXML
    public TextField txtdireccion;
    @FXML
    public TextField txtcorreo;
    
      @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void Agregar(){
    
    }
    
    
    
    
}
