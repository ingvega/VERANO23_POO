/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int x=l.nextInt();
        impares(x);
    }
    
    public static void impares(int n){
        if(n%2==0) 
            n--;
        for (int i = n; i >0; i-=2) 
            System.out.println(i);
    }
}
