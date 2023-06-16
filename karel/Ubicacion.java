/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.karel;

/**
 *
 * @author paveg
 */
public class Ubicacion {
    private int x;
    private int y;
    
    public Ubicacion(){
        x=1;
        y=1;
    }
    
    public Ubicacion(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int x){
        if(x>=1){
            this.x=x;
        }else{
            System.out.println("La posición en X debe ser de 1 en adelante");
        }
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        if(y>=1){
            this.y=y;
        }else{
            System.out.println("La posición en Y debe ser de 1 en adelante");
        }
    }
    
}
