/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaautos;

import java.util.Date;

/**
 *
 * @author paveg
 */
public class Renta {
    private Date fecha;
    private float costoTotal;
    
    private Sucursal sucursal;
    private DetalleRenta[] detallesRenta;
    private Agente agente;
    private Cliente cliente;
}
