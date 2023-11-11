/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo05.proyectoed;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author micha
 */
public class Contacto {
    
    private String nombre;
    private ArrayList<String> numeros = new ArrayList<>();
    private String Correo;
    private String PriLetra;
    private String Direccion;

    private LinkedList<Contacto> contactos = new LinkedList<>();
    
    public Contacto(String nombre, ArrayList numeros, String Correo, String PriLetra,String Direccion) {
        this.nombre = nombre;
        this.numeros = numeros;
        this.Correo = Correo;
        this.PriLetra = PriLetra;
        this.Direccion = Direccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeros() {
        String finalNumeros = "";
        for (String numero:numeros){
            finalNumeros+=numero;
            finalNumeros+="-";
        }
        return finalNumeros;
        
    }

    public String getCorreo() {
        return Correo;
    }

    public String getPriLetra() {
        return PriLetra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeros(ArrayList numeros) {
        this.numeros = numeros;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setPriLetra(String PriLetra) {
        this.PriLetra = PriLetra;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    public void add(Contacto contacto){
        contactos.add(contacto);
        imprimir();
        writeFile(contacto);
    }
    
    public void imprimir(){
        
        for(Contacto contacto:contactos){
            System.out.println(contacto.nombre);
        
        }
    }
    
    public void writeFile(Contacto contacto){
        
        String archivo = "src/main/java/com/poo05/proyectoed/datos.txt";
        
        String contactoEstructurado = estructurarFile(contacto);
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivo,true))){
    
            bw.write(contactoEstructurado);
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public String estructurarFile(Contacto contacto){
        String estructurado = contacto.getNombre()+"/"+contacto.getNumeros()+"/"+contacto.getCorreo()+"/"+contacto.getPriLetra()+"/"+contacto.getDireccion();

        return estructurado;
    }
    
    
    
    
    
    
    
}
