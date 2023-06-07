/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
//Programacion orientada a objetos
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String texto=lector.nextLine();
        String palabras[]=texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if(i%2==0)
                for (int j = palabras[i].length()-1; j >=0 ; j--) {
                    System.out.print(palabras[i].charAt(j));
                }
            else
                System.out.print(palabras[i]);
            System.out.print(" ");
        }
    }
}
