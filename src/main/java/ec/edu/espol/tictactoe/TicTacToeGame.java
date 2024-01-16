/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tictactoe;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TicTacToeGame {
    Tablero tablero;
    DecisionTree<Celda> ia;
    
    public TicTacToeGame(){
        tablero = new Tablero();
        ia = new DecisionTree(-50);
    }
    
    public void updateTree(){
        for(Celda c1:tablero.celdas){
            if(c1.contenido==null){
                if(c1.fila==2&&c1.columna==2)
                    ia.children.add(new DecisionTree(c1,1+intPriorityWin(c1)+intPriorityLose(c1)));
                else if((c1.fila==1&&c1.columna==1)||(c1.fila==1&&c1.columna==3)||(c1.fila==3&&c1.columna==1)||(c1.fila==3&&c1.columna==3))
                    ia.children.add(new DecisionTree(c1,-1+intPriorityWin(c1)+intPriorityLose(c1)));
                else
                    ia.children.add(new DecisionTree(c1,-2+intPriorityWin(c1)+intPriorityLose(c1)));
            }
        }
    }
    public int intPriorityWin(Celda c3){
        Celda cverificar = new Celda(c3.fila,c3.columna,"X");
        for(Celda c1:tablero.celdas){
            for(Celda c2:tablero.celdas){
                if(c1!=c2){
                    if(Tablero.verificar3EnRaya(c1, c2, cverificar))
                        return 15;
                }
            }
        }
        return 0;
    }
    public int intPriorityLose(Celda c3){
        Celda cverificar = new Celda(c3.fila,c3.columna,"O");
        for(Celda c1:tablero.celdas){
            for(Celda c2:tablero.celdas){
                if(c1!=c2){
                    if(Tablero.verificar3EnRaya(c1, c2,cverificar))
                        return 10;
                }
            }
        }
        return 0;
    }
    public DecisionTree searchBestWay(){
        DecisionTree dreturn = new DecisionTree(-15);
        for(DecisionTree d1:ia.children){
            if(d1.root.valor>dreturn.root.valor)
                dreturn=d1;
        }
        return dreturn;
    }
    public void jugar(){
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(true){
            if(i%2==0){
                updateTree();
                ia=searchBestWay();
                Celda c1 = (Celda)ia.root.contenido;
                tablero.cambiarCelda(c1.fila, c1.columna, "X");
                System.out.println(tablero);
            }else{
                System.out.println(tablero);
                System.out.println("Ingrese una fila y columna (fila,columna): ");
                String seleccion = sc.nextLine();
                String[] tokens = seleccion.split(",");
                tablero.cambiarCelda(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), "O");
                System.out.println(tablero);
            }
            System.out.println("NEXT MOVE!!");
            i++;
        }
    }
}
