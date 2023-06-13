/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo.promedios;

import java.util.Date;

/**
 *
 * @author paveg
 */
public class Alumno {

    public String noControl;
    String nombre;
    protected int semestre;
    private float promedio;
    private Date fechaNacimiento;
    private boolean inscrito;
    
    private int edad;
    
    //Firma del get
    //public tipoAtributo getAtributo()
    
    public float getPromedio(){
        return promedio;
    } 
    
    //Firma del set
    //public void setAtributo(tipoAtributo nombreAtributo)
    public void setPromedio(float promedio){
        if(promedio>=0 && promedio<=100){
            this.promedio=promedio;
        }else{
            System.err.println("Promedio no válido (0-100)");
        }
    }
    
    //Firma para un atributo boolean
    //public boolean isAtributo()
    public boolean isInscrito(){
        return inscrito;
    }
    
    public void setInscrito(boolean value){
        inscrito=value;
        this.inscrito=value;
    }
            
    public void setEdad(int edad){
        if(edad>=0 && edad<=120){
            this.edad=edad;
        }else{
            System.err.println("Edad fuera de rango (0-120)");
        }
    }

    public void imprimirDatos() {
//        String estaInscrito="";
//        //Código equivalente usando operador ternario
//        if(inscrito==true)
//            estaInscrito="SI";
//        else
//            estaInscrito="NO";
//        estaInscrito=inscrito?"SI":"NO";
            
        String mensaje = "Nombre: " + nombre + "\n"
                + "No Control: " + noControl + "\n"
                + "Semestre: " + semestre + "\n"
                + "Promedio: " + promedio + "\n"
                + "Edad: " + edad + "\n"
                + "Inscrito: " + (inscrito?"SI":"NO") + "\n"
                + "Fecha de nacimiento: " + fechaNacimiento;

        //Nombre cualificado de la clase (completo)
        javax.swing.JOptionPane.showMessageDialog(null, mensaje);

        //java.util.Scanner lector=new java.util.Scanner(System.in);
    }

//    public static void main(String[] args){
//        //System.out.println(nombre);
//        Alumno pedro=new Alumno();
    /*A pesar de ser privados, son accesibles desde 
    cualquier método de la clase alumno*/
//        pedro.nombre="Pedro Perez";
//        pedro.noControl="S23120001";
//        pedro.semestre=1;
//        pedro.promedio=0;
//        pedro.fechaNacimiento=new Date(2005-1900,0,1);
//        
//        pedro.imprimirDatos();
//    }
}
