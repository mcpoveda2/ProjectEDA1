/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tictactoe;

/**
 *
 * @author USER
 */
public class Celda{
        String contenido;
        int fila;
        int columna;
        
        public Celda(int fila,int columna){
            this.fila=fila;
            this.columna=columna;
        }
        public Celda(int fila,int columna,String s1){
            this.fila=fila;
            this.columna=columna;
            this.contenido=s1;
        }
        @Override
        public String toString(){
            if(contenido!=null)
                return this.contenido;
            return "❏";
        }
        public static String coordenadas(Object o1){
            Celda c1=(Celda)o1;
            return c1.fila+","+c1.columna;
        }
    }
