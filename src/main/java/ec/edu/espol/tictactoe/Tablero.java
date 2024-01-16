/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tictactoe;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Tablero {
    ArrayList<Celda> celdas;
    
    public Tablero(){
        ArrayList<Celda> a1 = new ArrayList<>();
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                Celda c1 = new Celda(i,j);
                a1.add(c1);
            }
        }
        celdas=a1;
    }
    
    public void cambiarCelda(int fila, int columna,String contenido){
        searchByCoord(fila,columna).contenido=contenido;
    }
    public static boolean verificar3EnRaya(Celda c1, Celda c2, Celda c3){
        if(c1.contenido!=null && c2.contenido!=null && c3.contenido!=null){
            if(((c1.fila==c2.fila&&c2.fila==c3.fila)&&(c3.columna==c2.columna+1&&c2.columna==c1.columna+1||
                    c1.columna==c2.columna+1&&c2.columna==c3.columna+1
                    ||c2.columna==c3.columna+1&&c3.columna==c1.columna+1))||
                    ((c1.columna==c2.columna&&c2.columna==c3.columna)&&(c3.fila==c2.fila+1&&c2.fila==c1.fila+1||
                    c1.fila==c2.fila+1&&c2.fila==c3.fila+1||
                    c2.fila==c3.fila+1&&c3.fila==c1.fila+1))
                    ||((c1.columna==1&&c2.columna==2&&c3.columna==3)&&(c1.fila==3&&c2.fila==2&&c3.fila==1))){
                return c1.contenido.equals(c2.contenido)&&c2.contenido.equals(c3.contenido);
            }
        }
        return false;
    }
    
    public Celda searchByCoord(int fila, int columna){
        for(Celda c1:celdas){
            if(c1.fila==fila&&c1.columna==columna)
                return c1;
        }
        return null;
    }
    @Override
    public String toString(){
        return this.celdas.get(0)+" "+this.celdas.get(1)+" "+this.celdas.get(2)+"\n"+
               this.celdas.get(3)+" "+this.celdas.get(4)+" "+this.celdas.get(5)+"\n"+
               this.celdas.get(6)+" "+this.celdas.get(7)+" "+this.celdas.get(8);
    }
    
    
}
