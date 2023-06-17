
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Auto auto=new Auto();
        auto.setMarca("Honda");
        auto.setModelo("Civic");
        auto.setNumSerie("12345678901234567");
        auto.setColor("Blanco");
        
        Auto auto2=new Auto("Honda","Civic","123456789012345  ","B");
//        Auto auto2=new Auto();
//        auto2.setMarca("Honda");
//        auto2.setModelo("Civic");
//        auto2.setNumSerie("123456789012345   ");
//        auto2.setColor("B");
        System.out.println(auto2.getMarca());
        System.out.println(auto2.getModelo());
        System.out.println(auto2.getNumSerie());
        System.out.println(auto2.getColor());
    }
}
