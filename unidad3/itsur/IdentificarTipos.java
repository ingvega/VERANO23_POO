/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3.itsur;

/**
 *
 * @author paveg
 */
public class IdentificarTipos {

    public static void main(String[] args) {
        Object[] objetos = new Object[6];
        objetos[0] = "S";
        objetos[1] = 10;
        objetos[2] = 5.5;
        objetos[3] = false;
        objetos[4] = 'c';
        objetos[5] = "C";

        explorarTipos(objetos);
    }

    /**
     * Imprime la cantidad de Cadenas, Enteros, Decimales, Booleanos y
     * Caracteres que contiene el arreglo Ejemplo: Cadenas: 2 Enteros: 1
     * Decimales: 1 Booleanos: 1 Caracteres: 1
     *
     * @param arreglo
     */
    public static void explorarTipos(Object[] arreglo) {
        int cont = 0;
        int cadena = 0;
        int booleanos = 0;
        int caracteres = 0;
        int decimales = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].getClass() == Integer.class) {
                cont++;
            }
            if (arreglo[i].getClass() == Double.class) {
                decimales++;
            }
            if (arreglo[i].getClass() == Character.class) {
                caracteres++;
            }
            if (arreglo[i].getClass() == Boolean.class) {
                booleanos++;
            }
            if (arreglo[i] instanceof String) {
                cadena++;
            }

        }
        System.out.println("i= " + cont + "\n"
                + "b= " + booleanos + "char= " + caracteres
                + "Cadenas= " + cadena + "D= " + decimales);
    }

}
