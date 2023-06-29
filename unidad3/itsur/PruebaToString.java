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
public class PruebaToString {
    public static void main(String[] args) {
        Persona p=new Persona("Juan Perez","juan@gmail.com",
                LocalDate.of(2000,1,1));
        Persona d=new Docente("Alberto Medina","alberto@gmail.com",
        LocalDate.now(),"D1",40,10);
        System.out.println(p);
        System.out.println(d);
    }
}
