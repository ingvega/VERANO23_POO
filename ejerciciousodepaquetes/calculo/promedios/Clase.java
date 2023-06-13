/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo.promedios;

import usodepaquetes.*;
import calculo.promedios.Alumno;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author paveg
 */
public class Clase {

    public static void main(String[] args){
        //Date fechaActual=new Date();
        LocalDate fechaActual=LocalDate.now();
        System.out.println(fechaActual);
        System.out.println(fechaActual.getYear());
        /*System.out.println("Mensaje1");
        System.err.println("Mensaje2---------------------------------------------");
        System.out.println("Mensaje3");
        System.err.println("Mensaje4");
        System.out.println("Mensaje5--------------------------------------------");
        System.err.println("Mensaje6");
        */
        //System.out.println(nombre);
        Alumno pedro=new Alumno();
        pedro.imprimirDatos();
        pedro.nombre="Pedro Perez";
        pedro.noControl="S23120001";
        pedro.semestre=130;
        pedro.setEdad(180);
        pedro.setInscrito(true);
        pedro.setPromedio(-10);
        //Acceder a pedro también mediante la variable luis
        Alumno luis=pedro;
        
        System.out.println(pedro);
        System.out.println(luis);

        //Inaccesibles desde fuera de la clase Alumno
       //de la clase alumno
//        pedro.promedio=0;
//        pedro.fechaNacimiento=new Date(2005-1900,0,1);
        
       // pedro.imprimirDatos();
    }
    
}
