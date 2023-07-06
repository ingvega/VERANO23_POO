/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad56;

import javax.swing.JOptionPane;

/**
 *
 * @author paveg
 */
public class Excepciones {

    public static void main(String[] args) {
        //Atrapar excepciones
        //Leer un número y verificar que sea número
        String numero = JOptionPane.showInputDialog("Ingresa un número");
//        for (int i = 0; i < numero.length(); i++) {
//            if(!Character.isDigit(numero.charAt(i))){
//                System.out.println("Valor no numérico");
//                return;
//            }
//        }
        try {
            numero=null;
            System.out.println(numero.length());
            int valor = Integer.parseInt(numero);
            System.out.println(valor * 10);
            
        } 
        catch (NumberFormatException ex) {
            System.out.println("Valor no numerico");
        } catch (NullPointerException ex) {
            System.out.println("Valor nulo");
        }catch (Exception ex) {
            System.out.println("Valor no ingresado");
        }
        
        //Identificar diferentes tipos de excepciones

        //Lanzar una excepción
    }
}
