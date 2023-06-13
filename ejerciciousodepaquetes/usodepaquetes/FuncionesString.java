/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodepaquetes;

/**
 *
 * @author paveg
 */
public class FuncionesString {
    public static void main(String[] args) {
        //Convertir un entero o algun otro tipo de dato (primitivo)
        //a atring
        int x=4;
        String numero=String.valueOf(x);
        String numero2=x+"";
        //Convertir cadenas a algún tipo de dato específico
        String valor="2023";
        //Wrapper - Envoltorios
        int anio=Integer.parseInt(valor);
        float anioF=Float.parseFloat(valor);
        double anioD=Double.parseDouble(valor);
        //Convertir entero a flotante
        anio=(int)anioF;
        anioF=anio;
        //Convertir double a flotante
        anioF=(float)anioD;
        anioD=anioF;
        //Convertir char a int
        char c='a';
        anio=c;
        
        //Convertir int a char
        c=(char)anio; //2500000000
        
        //Información del arreglo (tipo, dimension)
        int arreglo[]=new int[5];
        double[] matriz[]=new double[5][1];
        String arregloString=arreglo+"";
        System.out.println(arregloString);
        System.out.println(matriz);
        
        String cadena="texto";
        //Acceder a los caracteres de un String de uno por uno
        //charAt(posicion)-> develve un char
        char c1=cadena.charAt(0);
        //Obtener todos los caracteres de un String
        char[] caracteres=cadena.toCharArray();
        //Partir una cadena a traves de un separador
        //split("Separador")-> un arreglo de string
        String[] partes=cadena.split("x");//->["te","to"]
        //quitar espacios a los extremos de una cadena
        String textoConEspacios="     este    es un ejemplo    ";
        String textoSinEspacios=textoConEspacios.trim();//-> "este    es un ejemplo"
        //Obtener una parte de otra cadena
        String seccion=textoConEspacios.substring(6);//->"este    es un ejemplo    ";
        seccion=textoConEspacios.substring(6,9);//->"est"
        //Convertir a mayuscula y minuscula
        seccion=seccion.toLowerCase();
        seccion=seccion.toUpperCase();
        
        
    }
}
