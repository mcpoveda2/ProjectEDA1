/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo05.proyectoed;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author USERº
 */
public class CrearContacto {
    
    @FXML
    public TextField txtnombre;
    @FXML
    public TextField txtapellido;
    @FXML
    public TextField txtnumero;
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
        
        String nombre = txtnombre.getText();
        String apellido = txtapellido.getText();
        
        String nombreTotal = nombre + " " + apellido; 
        
        String numero = txtnumero.getText();
        String direccion = txtdireccion.getText();
        String correo = txtcorreo.getText();
        String letra = nombre.substring(0,1);
        ArrayList numeros = new ArrayList();
        
        numeros.add(numero);
        
        
        Contacto contacto = new Contacto(nombreTotal,numeros,correo,letra,direccion);
        
        contacto.add(contacto);
        
        
        
    
    }
    
}

 
