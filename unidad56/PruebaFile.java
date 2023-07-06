/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad56;

import java.io.File;

/**
 *
 * @author paveg
 */
public class PruebaFile {

    public static void main(String[] args) {
        // Crea un objeto file a partir de la ruta del archivo del cual queremos saber sus
// propiedades
        File file = new File("C:\\poo\\alumnos.txt");
// Permite saber si el archivo existe o no devolviendo un booleano
        System.out.println(file.exists());
// Permite saber si la ruta indicada es directorio devolviendo un booleano
        System.out.println(file.isDirectory());
// Permite conocer la fecha de modificación
        System.out.println(file.lastModified());
// Permite saber el nombre del archivo (no toda la ruta sino solo el nombre
// del archivo)
        System.out.println(file.getName());
// Permite conocer la ruta completa del archivo
        System.out.println(file.getPath());
// Permite conocer el tamaño en bytes que ocupa en disco
        System.out.println(file.length());
// Permite saber si el archivo está marcado como solo lectura, devolviendo un
// booleano
        System.out.println(file.canRead());
// Permite saber si el archivo permite escritura devolviendo un booleano
        System.out.println(file.canWrite());
// Crea un directorio en disco (la ruta indicada no deberá contener extensión), por
// ejemplo: crea el directorio llamado achivos, siempre y cuando el sistema
// operativo lo permita, por ello devuelve un booleano
        File carpeta = new File("C:\\poo\\archivos");
        System.out.println(carpeta.mkdir());
// Cuando es un directorio así nos permitiría saber que archivos y subcarpetas
// contiene
        for (String nombreArchivo : carpeta.list()) {
            System.out.println(nombreArchivo);
        }

// Permite eliminar el archivo o directorio (en el caso de este último debe estar
// vacío), devolviendo booleano
        //System.out.println(file.delete());
    }
}
