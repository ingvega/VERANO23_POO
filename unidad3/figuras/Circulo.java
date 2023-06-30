/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3.figuras;

/**
 *
 * @author paveg
 */
public class Circulo extends Figura {

    private double radio;
    public Ubicacion centro=new Ubicacion();
//    centro.setX(0);
//    public int x=0;
//    public int y;
//    y=0;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*2*radio;
    }
    
}
