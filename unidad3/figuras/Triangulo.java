/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3.figuras;

import java.util.ArrayList;

/**
 *
 * @author paveg
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;
    public ArrayList<Ubicacion> vertices=new ArrayList<>();

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        double c=Math.sqrt(Math.pow(altura,2)+Math.pow(base/2, 2));
        return c*2+base;
    }
    
    
    
}
