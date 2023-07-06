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
public class TrianguloRectangulo implements Figura {

    private double base = 1;
    private double altura = 1;

    public TrianguloRectangulo() {
    }

    public TrianguloRectangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base >= 1 && base <= 1000) {
            this.base = base;
        } else {
            System.err.println("Datos no validos ya que no cumplen con un valor de 1 y 1000");
        }

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura >= 1 && altura <= 1000) {
            this.altura = altura;
        } else {
            System.err.println("Datos no validos ya que no cumplen con un valor de 1 y 1000");
        }
    }

    @Override
    public double calcularPerimetro() {
        return base + altura + Math.sqrt(base * base + altura * altura);
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public void redimensionar(double porcentaje) {
        if (porcentaje >= 0) {
            double nuevoL1 = base * porcentaje / 100;
            double nuevoL2 = altura * porcentaje / 100;
            if (nuevoL1 > 1000) {
                base = 1000;
            } else if (nuevoL1 < 1) {
                base = 1;
            } else {
                base = nuevoL1;
            }
            if (nuevoL2 > 1000) {
                altura = 1000;
            } else if (nuevoL2 < 1) {
                altura = 1;
            } else {
                altura = nuevoL2;
            }
        } else {
            System.out.println("Redimensión no válida");
        }
    }
    
    @Override
    public String toString() {
        DecimalFormat formateador=new DecimalFormat("0.00");
        return "TrianguloRectangulo(" + formateador.format(base) + "," 
                + formateador.format(altura) + ")";
    }
}
