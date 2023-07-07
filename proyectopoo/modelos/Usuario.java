/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.modelos;

import java.util.Objects;

/**
 *
 * @author paveg
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String tipo;
    private String usuario;
    private String contrasenia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.usuario, other.usuario);
    }

    @Override
    public String toString() {
        return nombre + "-,-" + apellidos + "-,-" + 
                tipo + "-,-" + usuario + "-,-" + contrasenia + '\n';
    }
    
    public Object[] toArray(){
        Object[] arreglo=new Object[4];
        arreglo[0]=nombre;
        arreglo[1]=apellidos;
        arreglo[2]=tipo;
        arreglo[3]=usuario;
        return arreglo;        
        //return new Object[]{nombre,apellidos,tipo,usuario};
    }
}
