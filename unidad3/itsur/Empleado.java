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
public class Empleado extends Persona {
    private String clave;

    public Empleado(String nombre, String correo, LocalDate fechaNac,
            String clave){
        super(nombre,correo,fechaNac);
        setClave(clave);
        
    
    }
    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    float calcularSueldo(){
        return 700;
    }
    
}
