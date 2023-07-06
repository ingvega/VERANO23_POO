/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad4;

/**
 *
 * @author paveg
 */
public class Cuadrado extends Cuadrilatero {
    public Cuadrado(){}
    
    public Cuadrado(int lado){
        setLado1(lado);

    }
    
    @Override
    public void setLado1(double lado1) {
        super.setLado1(lado1);
        super.setLado2(lado1);
    }

    @Override
    public void setLado2(double lado2) {
        super.setLado1(lado2);
        super.setLado2(lado2);
    } 
    
}
