/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad4;

import java.text.DecimalFormat;


/**
 *
 * @author paveg
 */
public class Circulo implements Figura {

    private double radio = 1;

    //Constructores
    public Circulo() {
    }

    public Circulo(double radio) {
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio >= 1 && radio <= 1000) {
            this.radio = radio;
        } else {
            System.err.println("Datos no validos ya que no cumplen con un valor de 1 y 1000");
        }
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*radio*2;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void redimensionar(double porcentaje) {
        if (porcentaje >= 0) {
            double nuevoRadio = radio * porcentaje / 100;
            if (nuevoRadio > 1000) {
                radio = 1000;
            } else if (nuevoRadio < 1) {
                radio = 1;
            } else {
                radio = nuevoRadio;
            }
        }else{
            System.out.println("Redimensión no válida");
        }
        
    }

    @Override
    public String toString() {
        DecimalFormat formateador=new DecimalFormat("0.00");
        return "Circulo(" + formateador.format(radio) + ")";
    }
    
    
    
}
