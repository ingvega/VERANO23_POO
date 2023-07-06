/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad56;

/**
 *
 * @author paveg
 */
public class Fecha {
    private int anio=2023;
    private int mes=7;
    private int dia=5;
    
    public Fecha(){}
    public Fecha(int anio, int mes, int dia){
        setAnio(anio);
        setMes(mes);
        setDia(dia);
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(anio>=1900 && anio<=2023+100){
            this.anio = anio;
        }else{
            throw new IllegalArgumentException(
            "El año indicado no es válido:" + anio);
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes>=1 && mes<=12){
            this.mes = mes;
        }else{
            throw new IllegalArgumentException(
                    "El mes indicado no es valido:" + mes);
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia>=1 && dia<=31){
            this.dia = dia;
        }else{
            throw new IllegalArgumentException(
                    "El día indicado no es valido:" + dia);
        }
    }
    
    
}
