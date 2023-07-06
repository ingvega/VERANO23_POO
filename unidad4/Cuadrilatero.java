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
public class Cuadrilatero implements Figura{
    private double lado1=1;
    private double lado2=1;

    public Cuadrilatero() {
    }
    
    public Cuadrilatero(double lado1,double lado2) {
        setLado1(lado1);
        setLado2(lado2);
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if (lado1 >= 1 && lado1<= 1000) {
            this.lado1 = lado1;
        } else {
            System.err.println("Datos no validos ya que no cumplen con un valor de 1 y 1000");
        }
        
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if (lado2 >= 1 && lado2<= 1000) {
            this.lado2 = lado2;
        } else {
            System.err.println("Datos no validos ya que no cumplen con un valor de 1 y 1000");
        }
    }

    @Override
    public double calcularPerimetro() {
        return 2*lado1+2*lado2;
    }

    @Override
    public double calcularArea() {
        return lado1*lado2;
    }
            
    @Override
    public void redimensionar(double porcentaje) {
        if (porcentaje >= 0) {
            double nuevoL1 = lado1 * porcentaje / 100;
            double nuevoL2 = lado2 * porcentaje / 100;
            if (nuevoL1 > 1000 || nuevoL1 < 1) {
                if(nuevoL1 < 1){
                    lado1=1;
                }else{
                    lado1 = 1000;
                }
            } else {
                lado1 = nuevoL1;
            }
            
            if (nuevoL1 > 1000) {
                lado1 = 1000;
            } else if (nuevoL1 < 1) {
                lado1 = 1;
            } else {
                lado1 = nuevoL1;
            }
            
            if (nuevoL2 > 1000) {
                lado2 = 1000;
            } else if (nuevoL2 < 1) {
                lado2 = 1;
            } else {
                lado2 = nuevoL2;
            }
        }else{
            System.out.println("Redimensión no válida");
        }
    }
    
    @Override
    public String toString() {
        DecimalFormat formateador=new DecimalFormat("0.00");
        if(lado1==lado2){
            return "Cuadrado(" + formateador.format(lado1) + ")";
        }else{
            return "Rectangulo(" + formateador.format(lado1) + "," 
                + formateador.format(lado2) + ")";
        }
    }
}
