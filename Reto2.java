/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos101;

import java.util.Scanner;

public class Reto2 {
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        
        System.out.println("Ingrese 2 palabras para saber si son anagramas");
        
        System.out.print("Palabra 1: ");
        String palabra1 = t.next();
        
        System.out.print("Palabra 2: ");
        String palabra2 = t.next();
        
        int anagrama=0;
        for(int i=1; i<palabra1.length();i++){
            char letra = palabra1.charAt(i);
            for (int j = 1; j < palabra2.length(); j++) {
                if(letra == palabra2.charAt(j)){
                    System.out.println(anagrama++);
                }
            }
        }
        
        if(anagrama == palabra1.length() && anagrama == palabra2.length()) {
            System.out.println(true);;
        } else {
            System.out.println(false);
        }
    }
}
