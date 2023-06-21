/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.karel;

/**
 *
 * @author paveg
 */
public class Prueba {

    public static void main(String[] args) {
        //No puedo preguntar (llamar un método o atributo de algo null, esdecir,
        //que aún no es un objeto vivo en memoria)
//        Mundo m2=null;
//        System.out.println(m2.getLongitudX());

        Mundo m = new Mundo(5, 5);
        Robot karel = new Robot("Karel");
        karel.mundo = m;
//        System.out.println(karel);
//        System.out.println(karel.toString());
//        System.out.println("------------------------------------");
//        String infoKarel="KAREL " + karel;
//        String infoMundo="MUNDO " + m;
//        System.out.println(infoKarel);
//        System.out.println(infoMundo);
        //karel.camina();
//        for(int i=1;i<m.getLongitudY();i++){
//            karel.camina();
//            System.out.println(karel);
//        }
        int contador = 0;
        while (karel.camina()) {
            contador++;
        }
        System.out.println(contador);
    }
}
