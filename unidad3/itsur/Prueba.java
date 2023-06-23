/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3.itsur;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        //Persona p=new Persona();
        Persona p=new Persona("Juan Perez","juan@gmail.com",
                LocalDate.of(2000, 1, 1));
//        p.setNombre("Juan Perez");
//        p.setCorreo("juan@gmail.com");
//        p.setFechaNacimiento(LocalDate.of(2000, Month.JULY, 1));
       // p.setFechaNacimiento(LocalDate.of(2000, 7, 1));
        System.out.println(p.calcularEdad()); 
       
       
        Empleado e=new Empleado("Juan Perez","juan@gmail.com",
                LocalDate.of(2000, 1, 1),"E1");
//        e.setNombre("Juan Perez");
//        e.setCorreo("juan@gmail.com");
//        e.setFechaNacimiento(LocalDate.of(2000, 1, 1));
//        e.setClave("E1");
        System.out.println(e.calcularEdad());
        System.out.println(e.calcularSueldo());
        
        //Docente d2=new Docente(null,null,null);
//        d.setNombre("Juan Perez");
//        d.setCorreo("juan@gmail.com");
        //d.setFechaNacimiento(LocalDate.of(2000, 1, 1));
        Docente d=new Docente("Juan Perez","juan@gmail.com",
                LocalDate.of(2000, 1, 1),"D2",20,20);
        
        d.setClave("D2");
        d.setHrsXSemana(20);
        d.setSueldoXHora(10);
        
        //System.out.println(d.calcularSueldo());
        d.imprimirDatos();
        System.out.println(d.calcularEdad());
        
        ArrayList<Persona> personas=new ArrayList<Persona>();
        personas.add(new Docente("Juan Perez","juan@gmail.com",
                LocalDate.now(),"D1",40,10));
        
        personas.add(d);
        
        personas.add(new EmpleadoGeneral("Alberto Medina",
        "alberto@gmail.com", LocalDate.of(2003,1,1),"G1"));
    }
}
