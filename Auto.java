
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Auto {
    private String numSerie=""; //exactamente 17 caracteres
    private String marca=""; //min 2 max 10
    private String modelo=""; //min 1 max 15
    private int anio=LocalDate.now().getYear(); //del 2000 en adelante hasta el actual +1
    private String color=""; //min 4 max 10
    private int cilindraje=4; //3,4,6,8,10,12,16
    private int tipoTransmision=1; //Automática=1  Manual=2
    
    public Auto(){
        System.out.println("Se está ejecutando el constructor");
    }
    
    public Auto(String marca, String modelo, String serie, String color){
        //this.marca=marca;
        setMarca(marca);
        //this.modelo=modelo;
        setModelo(modelo);
        //numSerie=serie;
        setNumSerie(serie);
        //this.numSerie=serie;
        //this.color=color;
        setColor(color);
    }
    
    public void setNumSerie(String numSerie){
        if(numSerie.trim().length()==17){
            this.numSerie=numSerie.trim();
        }else{
            System.out.println("Número de serie no valido (17 caracteres)");
        }
    }
    
    public void setMarca(String marca){
        marca=marca.trim();
        if(marca.length()>=2 && marca.length()<=10){
            this.marca=marca;
        }else{
            System.out.println("Marca incorrecta (entre 2 y 10 caracteres)");
        }
    }
    public void setModelo(String modelo){
        modelo=modelo.trim();
        if(modelo.length()>=1 && modelo.length()<=15){
            this.modelo=modelo;
        }else{
            System.out.println("Modelo incorrecto (entre 1 y 15 caracteres)");
        }
    }
    
    public void setAnio(int anio){
        LocalDate fechaActual=LocalDate.now();
        int anioLimite=fechaActual.getYear()+1;
        
        if(anio>=2000 && anio<=anioLimite){
            this.anio=anio;
        }else{
            System.out.println("Año incorrecto (entre 2000 y " +  anioLimite +")");
        }
    }
    public void setColor(String color){
        color=color.trim();
        if(color.length()>=4 && color.length()<=10){
            this.color=color;
        }else{
            System.out.println("Color incorrecto (entre 4 y 10 caracteres)");
        }
    }
    
    public void setCilindraje(int cilindraje){
        //if(cilindraje==3 || (cilindraje>=4 && cilindraje<=16 && cilindraje%2==0)){
        if(cilindraje==3 || cilindraje==4 || cilindraje==6 || cilindraje==8 || cilindraje==10
                || cilindraje==12 || cilindraje==14 || cilindraje==16){
            this.cilindraje=cilindraje;
        }else{
            System.out.println("Cilindraje incorrecto (3,4,6,8,10,12,16)");
        }
    }
    public void setTipoTransmision(int tipoTransmision){
        if(tipoTransmision==1 || tipoTransmision==2){
            this.tipoTransmision=tipoTransmision;
        }else{
            System.out.println("Tipo de transmisión incorrecta (1 para Automática y "
                    + "2 para Manual");
        }
    }
    
    
    public String getNumSerie(){
        return numSerie;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnio(){
        return anio;
    }
    public String getColor(){
        return color;
    }
    public int getCilindraje(){
        return cilindraje;
    }
    public int getTipoTransmision(){
        return tipoTransmision;
    }
    
}
