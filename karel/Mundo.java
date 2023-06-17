/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.karel;

/**
 *
 * @author paveg
 */
public class Mundo {
    private int longitudX=1;
    private int longitudY=1;
    
    public Mundo(int longitudX,int longitudY){
        setLongitudX(longitudX);
        setLongitudY(longitudY);        
    }
    
    public int getLongitudX(){
        return longitudX;
    }
    
    public void setLongitudX(int longitudX){
        if(longitudX>0 &&longitudX<=100){
            this.longitudX=longitudX;
        }else{
            System.out.println("Longitud en X no válida, se aceptan valores"
                    + " entre 1 y 100");
        }
    }
    
    public int getLongitudY(){
        return longitudY;
    }
    
    public void setLongitudY(int longitudY){
        if(longitudY>0 &&longitudY<=100){
            this.longitudY=longitudY;
        }else{
            System.out.println("Longitud en Y no válida, se aceptan valores"
                    + " entre 1 y 100");
        }
    }
    
    
}
