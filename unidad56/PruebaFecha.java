/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad56;

/**
 *
 * @author paveg
 */
public class PruebaFecha {
    public static void main(String[] args) {
        Fecha f=new Fecha();
        Fecha f4=new Fecha(0,0,1);
        try{
            Fecha f2=new Fecha(2000,1,1);
            
            Fecha f3=new Fecha(2000,0,1);
            
        }catch(IllegalArgumentException ex){
            
            System.out.println(ex.getMessage());
        }
        
    }
   
}
