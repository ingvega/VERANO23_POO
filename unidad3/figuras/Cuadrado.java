/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3.figuras;

/**
 *
 * @author paveg
 */
public class Cuadrado extends Cuadrilatero {

    public Cuadrado(int a){
        //super(a,a);
    }
    
    @Override
    public void setLadoB(double ladoB) {
        super.setLadoB(ladoB);
        setLadoA(ladoB);
    }

    @Override
    public void setLadoA(double ladoA) {
        super.setLadoA(ladoA); 
        setLadoB(ladoA); 
    } 
    
    @Override
    public double calcularArea() {
        return getLadoA()*getLadoA();
    }
}
