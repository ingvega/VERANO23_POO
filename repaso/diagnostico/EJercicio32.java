/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class EJercicio32 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in); 
        int n=lector.nextInt(),m=lector.nextInt();
        int[] coleccionA=new int[n];
        int[] coleccionB=new int[m];
        for (int i = 0; i < n; i++) {
            coleccionA[i]=lector.nextInt();
        }
        for (int i = 0; i < m; i++) {
            coleccionB[i]=lector.nextInt();
        }
        int cont=0;
        for (int i = 0; i < m; i++) {
            //Tomar cada elemento de la coleccionB
            int numeroEnB=coleccionB[i];
            for (int j = 0; j < n; j++) {
                if(numeroEnB==coleccionA[j]){
                    cont++;
                    //Ya encontré otro
                    //Preguntar si llevo encontrados el mismo número
                    //que los buscados
                    if(i+1!=cont){
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        if(m==cont){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
        
    }
}
