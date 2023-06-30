/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3.figuras;

/**
 *
 * @author paveg
 */
public class Rectangulo extends Cuadrilatero{
    
    @Override
    public double calcularArea() {
        return getLadoA()*getLadoB();
    }
}
