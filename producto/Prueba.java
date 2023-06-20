/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.producto;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Producto p=new Producto("Agua",20);
        p.margenGanancia=5;
        Producto p2=new Producto("Galletas",10);
        p2.margenGanancia=50;
//        p.ajustarPrecio(-20);
//        p.comprar(10,(float)9.5);
//        System.out.println(p.vender(5));
        System.out.println(p.getNombre() + "\n Precio: " +
                p.getPrecio() +"\n Costo: "+
                p.getCosto() +"\n Existencia: "+
                p.getExistencia()+"\n MargenGanancia: "+
                p.margenGanancia);
        
        System.out.println(p2.getNombre() + "\n Precio: " +
                p2.getPrecio() +"\n Costo: "+
                p2.getCosto() +"\n Existencia: "+
                p2.getExistencia()+"\n MargenGanancia: "+
                p2.margenGanancia);
    }
}
