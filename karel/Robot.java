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

    private String nombre = "Anonimo";
    private char direccion = 'N';

    public Ubicacion posicionActual;
    public Mundo mundo;

    public Robot() {
        posicionActual = new Ubicacion();
    }

    public Robot(String nombre) {
        //invocando el contructor predeterminado
        this();
        setNombre(nombre);
        //No se puede invocar directamente el constructor
        //Robot();

        //posicionActual=new Ubicacion();
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        nombre = nombre.trim();
        if (nombre.length() >= 2 && nombre.length() <= 20) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no válido");
        }
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        String strDireccion = direccion + "";
        //String strDireccion=String.valueOf(direccion);
        strDireccion = strDireccion.toUpperCase();
        if (strDireccion.equals("N") || strDireccion.equals("S")
                || strDireccion.equals("O") || strDireccion.equals("E")) {
            direccion = strDireccion.charAt(0);
        } else {
            System.out.println("Direccion no válida");
        }

    }

    @Override
    public String toString() {
        return "Robot: " + nombre
                + "\nUbicacion: (" + posicionActual.getX() + ", "
                + posicionActual.getY() + ")\nDireccion: "
                + direccion + "\n Mundo: largo " + mundo.getLongitudX()
                + "    alto " + mundo.getLongitudY();
    }

    private boolean frenteDespejado() {
        if (getDireccion() == 'N') {
            if (posicionActual.getY() < mundo.getLongitudY()) {
                return true;
            }
        } else if (direccion == 'E') {
            if (posicionActual.getX() < mundo.getLongitudX()) {
                return true;
            }
        } else if (direccion == 'O') {
            if (posicionActual.getX() > 1) {
                return true;
            }
        } else {
            if (posicionActual.getY() > 1) {
                return true;
            }
        }
        return false;
    }
//    private boolean frenteDespejado() {
//        switch(direccion){
//            case 'N':
//                return posicionActual.getY() < mundo.getLongitudY();
//            case 'E':
//                return posicionActual.getX() < mundo.getLongitudX();
//            case 'O':
//                return posicionActual.getX() > 1;
//            default:
//                return posicionActual.getY() > 1;
//        }
//    }
//    private boolean frenteDespejado() {
//        if (getDireccion() == 'N') {
//            if (posicionActual.getY() < mundo.getLongitudY()) {
//                return true;
//            } else {
//                return false;
//            }
//        } else if (direccion == 'E') {
//            if (posicionActual.getX() < mundo.getLongitudX()) {
//                return true;
//            } else {
//                return false;
//            }
//        } else if (direccion == 'O') {
//            if (posicionActual.getX() > 1) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            if (posicionActual.getY() > 1) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }

    public void girarDerecha() {
        if (getDireccion() == 'N') {
            this.direccion = 'E';
        } else if (getDireccion() == 'E') {
            this.direccion = 'S';
        } else if (getDireccion() == 'S') {
            this.direccion = 'O';
        } else if (getDireccion() == 'O') {
            this.direccion = 'N';
        }
    }

    public void girarIzquierda() {
        if (getDireccion() == 'N') {
            this.direccion = 'O';
        } else if (getDireccion() == 'O') {
            this.direccion = 'S';
        } else if (getDireccion() == 'S') {
            this.direccion = 'E';
        } else if (getDireccion() == 'E') {
            this.direccion = 'N';
        }
    }
    
    public boolean camina(){
        if(frenteDespejado()){
            if(direccion == 'N'){
                int NuevaPosicionY;
                NuevaPosicionY = posicionActual.getY() + 1;
                posicionActual.setY(NuevaPosicionY);
                
            }else if(direccion == 'S'){
                posicionActual.setY(posicionActual.getY() - 1);
                
            }else if(direccion == 'E'){
                posicionActual.setX(posicionActual.getX() + 1);
                
            }else if(direccion == 'O'){
                 posicionActual.setX(posicionActual.getX() - 1);
            }
            
            return true;
            
        }else{
            return false;
        }
    }
}
