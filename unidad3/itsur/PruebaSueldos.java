/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3.itsur;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author paveg
 */
public class PruebaSueldos {
    public static void main(String[] args) {
        
        Docente d=new Docente("Alberto Medina","alberto@gmail.com",
        LocalDate.now(),"D1",40,10); //40*10*2+700=1500
        Docente d2=new Docente("Maria Hernandez","x@gmail.com",
        LocalDate.now(),"D2",40,400);//40*400*2+700=32700
        EmpleadoGeneral e1=new EmpleadoGeneral(
                "Martin Diaz","x@gmail.com",
        LocalDate.now(),"E1",10000);//10700
        EmpleadoGeneral e2=new EmpleadoGeneral(
                "Pedro Rodriguez","x@gmail.com",
        LocalDate.now(),"E2",5000);//5700
        
        ArrayList<Empleado> empleados=new ArrayList<>();
        empleados.add(d);
        empleados.add(d2);
        empleados.add(e1);
        empleados.add(e2);
        double sueldoAPagar=0;
        for (int i = 0; i < empleados.size(); i++) {
            sueldoAPagar+= empleados.get(i).calcularSueldo();
        }
        Empleado eABorrar=new Empleado("Martin Diaz","",null,"Eeeee");
        empleados.remove(eABorrar);
        
        System.out.println(sueldoAPagar);
        System.out.println(empleados.size());
    }
}
