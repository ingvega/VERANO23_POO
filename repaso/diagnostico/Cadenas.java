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
public class Cadenas {
    public static void main(String[] args) {
         Scanner l=new Scanner(System.in);
        String texto=l.nextLine();
        String palabra="";
        //Programacion orientada a objetos
        //Programacion orientada a objetos 
        //Programacion
        boolean mayuscula=true;
        for (int i = 0; i < texto.length(); i++) {
            
            char caracter=texto.charAt(i);
            if(caracter==' '){
                //Ya terminé de acumular una palabra
                //if(mayuscula)
                /*true==true=>true
                false==true=>false
                true=>true
                false=>false*/
                if(mayuscula==true){
                    //String es inmutable
//                    palabra=palabra.toUpperCase();
//                    palabra.toUpperCase();
                    System.out.print(palabra.toUpperCase());
                    mayuscula=false;
                }else{
                    System.out.print(palabra.toLowerCase());
                    mayuscula=true;
                }
                System.out.print(" ");
//                !true=>false
//                !false=>true
//                mayuscula=!mayuscula;
                palabra="";
            }else{
                //Seguir acumulando caracteres en la palabra
                palabra+=caracter;
            }
        }
        //Verificar si quedó una palabra sin imprimir
        if(palabra!=""){
            if(mayuscula==true){
                    System.out.print(palabra.toUpperCase());
                }else{
                    System.out.print(palabra.toLowerCase());
                }
        }
    }
//    public static void main(String[] args) {
//        Scanner l=new Scanner(System.in);
//       // String texto=l.nextLine();
//        //char caracter=l.next();
//        String x="a/n";
//        System.out.println(x);
//        System.out.println(x.length());
//        x="Ejemplo con el uso de \"\" az";
//        System.out.println(x.charAt(22));
////        System.out.println("");
////        System.out.print(x);
////        System.out.println(x.length());
//    }
}
