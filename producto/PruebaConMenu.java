/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.producto;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class PruebaConMenu {
    public static void main(String[] args) {
        int respuesta;
        Scanner lector=new Scanner(System.in);
        do{
            System.out.println("Ingrese la operación:\n"
                    + "1 Alta producto parcial\n"
                    + "2 Alta producto completa\n"
                    + "3 Comprar\n"
                    + "4 Vender\n"
                    + "5 Ajustar precio\n"
                    + "6 Mostrar todos los productos\n"
                    + "7 Salir");
            respuesta=Integer.parseInt(lector.nextLine());
            switch (respuesta) {
                case 1:
                    System.out.println("Ingresa el nombre");
                    String nombre=lector.nextLine();
                    System.out.println("Ingresa el precio");
                    float precio=Float.parseFloat(lector.nextLine());
                    Producto p=new Producto(nombre,precio);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Operación no válida");
            }
        
        }while(respuesta!=7);
        
    }
}
