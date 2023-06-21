/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.karel;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Mundo m=new Mundo(100,100);
        Robot karel=new Robot("Karel");
        karel.mundo=m;
        //karel.camina();
    }
}
