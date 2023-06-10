/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaautos;

/**
 *
 * @author paveg
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String anio;
    private String color;
    private float costoXDia;
    
    private Sucursal perteneceA;
    private DetalleRenta[] detallesRenta;
}
