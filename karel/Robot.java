/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.karel;

/**
 *
 * @author paveg
 */
public class Robot {
    private String nombre="Anonimo";
    private char direccion='N';
    
    public Ubicacion posicionActual;
    public Mundo mundo;
    
    public Robot(){
        posicionActual=new Ubicacion();
    }
    
    public Robot(String nombre){
        //invocando el contructor predeterminado
        this();
        setNombre(nombre);
        //No se puede invocar directamente el constructor
        //Robot();
        
        //posicionActual=new Ubicacion();
    }
    
    
    private String getNombre(){
        return nombre;
    }
    
    private void setNombre(String nombre){
        nombre=nombre.trim();
        if(nombre.length()>=2 && nombre.length()<=20){
            this.nombre=nombre;
        }else{
            System.out.println("Nombre no válido");
        }
    }
    
    public char getDireccion(){
        return direccion;
    }
    
    public void setDireccion(char direccion){
        String strDireccion=direccion+"";
        //String strDireccion=String.valueOf(direccion);
        strDireccion=strDireccion.toUpperCase();
        if(strDireccion.equals("N") || strDireccion.equals("S") ||
                strDireccion.equals("O") || strDireccion.equals("E")){
            direccion= strDireccion.charAt(0);
        }else{
            System.out.println("Direccion no válida");
        }
        
    }
}
