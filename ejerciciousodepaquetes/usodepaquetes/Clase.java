/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodepaquetes;

import calculo.promedios.Alumno;
import java.util.Date;

/**
 *
 * @author paveg
 */
public class Clase {

    public static void main(String[] args){
        //System.out.println(nombre);
        Alumno pedro=new Alumno();
        //Inaccesible desde otro paquete
        //pedro.nombre="Pedro Perez";
        pedro.noControl="S23120001";
        //Inaccesible desde otro paquete
//        pedro.semestre=1;
//        pedro.promedio=0;
//        pedro.fechaNacimiento=new Date(2005-1900,0,1);
        
        pedro.imprimirDatos();
    }
    
}
