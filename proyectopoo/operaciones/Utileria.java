/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.operaciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author paveg
 */
public class Utileria {
    public static ArrayList<String> leerArchivo(String archivo) 
            throws Exception{
        ArrayList<String> lineasArchivo=new ArrayList<>();
        BufferedReader lector=null;
        try{
            lector=new BufferedReader(new FileReader(archivo));
            String linea=lector.readLine();
            while(linea!=null){
                lineasArchivo.add(linea);
                linea=lector.readLine();
            } 
            return lineasArchivo;
        }catch(IOException ex){
                throw new Exception("Datos no encontrados");
        }finally{
            //Intentar cerrar y liberar el archivo (confirmar el guardado)
            try{
                lector.close();
            }catch(Exception ex){
            }
        }
    }

    public static boolean agregarLinea(String linea,String archivo){
        BufferedWriter escritor=null;
        try{
            escritor=new BufferedWriter(
                    new FileWriter(archivo,true)
            );
            escritor.write(linea);
            return true;
        }catch(IOException ex){
            return false;
        }finally{
            //Intentar cerrar y liberar el archivo (confirmar el guardado)
            try{
                escritor.close();
            }catch(Exception ex){
            }
        }
    }
    
    public static boolean reescribirArchivo(ArrayList objetos,
            String archivo){
        BufferedWriter escritor=null;
        try{
            escritor=new BufferedWriter(
                    new FileWriter(archivo));
            for(Object objeto:objetos){
                escritor.write(objeto.toString());
            }
            return true;
        }catch(IOException ex){
            return false;
        }finally{
            //Intentar cerrar y liberar el archivo (confirmar el guardado)
            try{
                escritor.close();
            }catch(Exception ex){
            }
        }
    }
}
