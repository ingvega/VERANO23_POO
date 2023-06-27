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
public class Persona {
    private String nombre;
    private String correo;
    private LocalDate fechaNacimiento;//=LocalDate.now();

    //public Persona(){}
//    public Persona(String nombre){
//        setNombre(nombre);
//        System.out.println("Construyendo una persona");
//    }
    public Persona(String nombre, String correo, LocalDate fechaNac){
        setNombre(nombre);
        setCorreo(correo);
        setFechaNacimiento(fechaNac);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int calcularEdad(){
        LocalDate fechaActual=LocalDate.now();
        int edad=fechaActual.getYear()-fechaNacimiento.getYear();
        /*23 - 06 -2023 ACT
        01 - 07 - 2000 NAC*/
        //Identificar si el mes de nacimiento no ha pasado
        if(fechaNacimiento.getMonthValue()>fechaActual.getMonthValue()){
            edad--;
        //Estamos en el mes del cumpleaños
        }else if(fechaNacimiento.getMonthValue()==fechaActual.getMonthValue()){
            //Identificar si el dia de nacimiento no ha pasado
            if(fechaNacimiento.getDayOfMonth()>fechaActual.getDayOfMonth()){
                edad--;
            }
        }
        
        return edad; 
    }
    
    @Override
    public boolean equals(Object obj){
        Persona otraPersona=(Persona) obj;
        if(this.getNombre().equalsIgnoreCase(otraPersona.getNombre())){
            return true;
        }else{
            return false;
        }
    }
}
