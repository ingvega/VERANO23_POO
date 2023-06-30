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
public abstract class Cuadrilatero extends Figura{
    private  double ladoA;
    private  double ladoB;
    public ArrayList<Ubicacion> vertices=new ArrayList<>();
    
    public Cuadrilatero(){}
    
    public Cuadrilatero(int a,int b){
        setLadoA(a);
        setLadoB(b);
    }
    
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

//
//    @Override
//    public abstract double calcularArea();
    
    @Override
    public double calcularPerimetro() {
        return 2*ladoA+2*ladoB;
    }
}
