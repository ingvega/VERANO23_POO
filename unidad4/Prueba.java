/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad4;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
//        DecimalFormat formateador=new DecimalFormat("###,###.##");
//        DecimalFormat formateador2=new DecimalFormat("###,###.00");
//        DecimalFormat formateador3=new DecimalFormat("#.00");
//        double numero=123456;
//        System.out.println(formateador.format(numero));
//        System.out.println(formateador2.format(numero));
//        System.out.println(formateador3.format(numero));

        Circulo c=new Circulo(70);
        Cuadrilatero cuad1=new Cuadrilatero(.5,3); //1x3
        Cuadrilatero cuad2=new Cuadrilatero(3,3);
        //Cuadrilatero cuad3=new Cuadrado(3);
        Cuadrado cuadrado=new Cuadrado(5);
        TrianguloRectangulo t=new TrianguloRectangulo(7,3);
        TrianguloRectangulo t2=new TrianguloRectangulo();
        ArrayList<Figura> figuras=new ArrayList<>();
        figuras.add(c);
        figuras.add(cuad1);
        figuras.add(cuad2);
        figuras.add(cuadrado);
        figuras.add(t);
        figuras.add(t2);

//10->15        
//        for (int i = 0; i < figuras.size(); i++) {
////            Figura f=figuras.get(i);
////            f.redimensionar(150);
//            figuras.get(i).redimensionar(150);
//            figuras.get(i).redimensionar(30);
//        }
        int circulos=0;
        int cuadrados=0;
        int cuadrilateros=0;
        int triangulos=0;
        
        for(Figura f:figuras){
            f.redimensionar(150);
            f.redimensionar(30);
            if(f.getClass()==Cuadrilatero.class){
            //if(f instanceof Cuadrilatero){
                cuadrilateros++;
            } else if(f.getClass()==Cuadrado.class){
                cuadrados++;
            }else if(f.getClass()==Circulo.class){
                circulos++;
            }else {
                triangulos++;
            }
        }
        
    }
}
