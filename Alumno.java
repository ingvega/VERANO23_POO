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
public class Alumno extends Persona {
    private String noControl;
    private String apellidos;
    private LocalDate fechaIngreso;
    
    public Carrera carrera;

    public Alumno(String nombre, String correo, LocalDate fechaNac) {
        super(nombre, correo, fechaNac);
    }

    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "No Control: " + noControl + 
                "\nNombre: " + getNombre() + " " +apellidos + 
                "\nFecha Ingreso: " + fechaIngreso + 
                "\nCarrera:" + carrera.getNombre();
    }

    
}
