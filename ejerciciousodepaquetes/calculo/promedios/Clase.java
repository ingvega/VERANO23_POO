/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo.promedios;

import usodepaquetes.*;
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
        pedro.nombre="Pedro Perez";
        pedro.noControl="S23120001";
        pedro.semestre=130;
        //Inaccesibles desde fuera de la clase Alumno
       //de la clase alumno
//        pedro.promedio=0;
//        pedro.fechaNacimiento=new Date(2005-1900,0,1);
        
        pedro.imprimirDatos();
    }
    
}
