/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3.itsur;

import java.time.LocalDate;

/**
 *
 * @author paveg
 */
public class Castings {
    public static void main(String[] args) {
        
        
        int x=5,y=5;
        System.out.println(x==y);
        String a="Hola";
        String b="Hola";
        String c="H"+"ola";
        System.out.println(a==b);
        System.out.println(a==c);
        Persona d=new Docente("","",LocalDate.now(),"D1",1,1);
        //Alumno a1=(Alumno) d;
        
        Empleado e3=(Docente)d;
        e3=(Empleado)d;
        //Acceder al tipo de dato original del objeto almacenado
        System.out.println(e3.getClass().getName());
        
        System.out.println(e3 instanceof Persona);
        
        
        Persona p=new Empleado("","",LocalDate.now(),"D1");
        //if(p.getClass().getName().equals("unidad3.itsur.Empleado")){
        if(p.getClass()==Empleado.class){
            System.out.println("Es un empleado");
        }
        
        
        
        System.out.println(p instanceof Docente);
        
//        Persona p1=new Docente("","",LocalDate.now(),"D1",1,1);
//        Empleado e=new EmpleadoGeneral("","",LocalDate.now(),"D1");
//        Empleado e1=e;
//        Empleado e2=(Empleado)(Docente)e;
//        e2=(Empleado)p;
        
//        System.out.println(p1==d);
//        System.out.println(d1==d);
    }
}
