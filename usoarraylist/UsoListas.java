/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.usoarraylist;

import java.util.ArrayList;
import java.util.Scanner;
import unidad2.producto.Producto;

/**
 *
 * @author paveg
 */
public class UsoListas {
    public static void main(String[] args) {
        String[] cadenas=new String[5];
        cadenas[0]="uno";
        cadenas[1]="dos";
        cadenas[2]="tres";
        cadenas[3]="cuatro";
        cadenas[4]="cinco";
        
        cadenas[2]="treinta";
        
        ArrayList<String> listaCadenas=new ArrayList<String>();
        listaCadenas.add("uno");
        listaCadenas.add("dos");
        listaCadenas.add("tres");
        listaCadenas.add("cuatro");
        listaCadenas.add("cinco");
        
        listaCadenas.remove(3);
        listaCadenas.remove("tres");
        //Generar valores entre 1-100
        int[] numeros=new int[20];
        ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            //int num=(int)(Math.random()*100+1);
            listaNumeros.add(i);
            numeros[i]=i;
        }
        System.out.println("ARREGLO");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("--------------------------------------");
        System.out.println("LISTA");
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }
        
        //Modificar los ultimos 5 elementos (6,7,8,9,10)
        numeros[5]+=10;
        numeros[6]+=10;
        numeros[7]+=10;
        numeros[8]+=10;
        numeros[9]+=10;
        
        
        listaNumeros.set(5, listaNumeros.get(5)+10);
        listaNumeros.set(6, listaNumeros.get(6)+10);
        listaNumeros.set(7, listaNumeros.get(7)+10);
        listaNumeros.set(8, listaNumeros.get(8)+10);
        listaNumeros.set(9, listaNumeros.get(9)+10);
        
        System.out.println("ARREGLO");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        //listaNumeros.remove(15);
        
        System.out.println("--------------------------------------");
        System.out.println("LISTA");
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }
        
        Producto[] productos=new Producto[5];
        ArrayList<Producto> listaProductos=new ArrayList<Producto>();
        Producto p=new Producto("Producto",1);
        for (int i = 0; i < 10; i++) {
            p=new Producto("Producto " + (i + 1),i+1);
            listaProductos.add(p);
            //listaProductos.add(new Producto("Producto" + i,1));
        }
        System.out.println("PRODUCTOS");
        for (int i = 0; i < listaProductos.size(); i++) {
            //Imprime nombre cualificado de la clase+número único del producto
            //System.out.println(listaProductos.get(i));
            //Opción uno con variable que toma cada elemento de la lista
            Producto prod=listaProductos.get(i);
            System.out.println("Nombre: " + prod.getNombre() +
                    " Precio: " + prod.getPrecio() + 
                    " Costo: " + prod.getCosto() + 
                    " Existencia: " + prod.getExistencia() );
            //Opción 2 toma el elemento de la ista cada vez que saca un dato
//            System.out.println("Nombre: " + listaProductos.get(i).getNombre() +
//                    " Precio: " + listaProductos.get(i).getPrecio() + 
//                    " Costo: " + listaProductos.get(i).getCosto() + 
//                    " Existencia: " + listaProductos.get(i).getExistencia() );
        }
//        //Ejemplo de instancia con nombre para scanner
//        Scanner lector=new Scanner(System.in);
//        int x=lector.nextInt();
//        //Ejemplo de instancias anónimas con Scanner
//        int y=new Scanner(System.in).nextInt();
//        int z=new Scanner(System.in).nextInt();
       
    }
}
