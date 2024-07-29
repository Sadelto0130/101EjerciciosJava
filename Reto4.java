/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos101;

/**
 *
 * @author Victor PC
 */
public class Reto4 {
    public static void main(String args[]) {
        
        for (int i = 2; i < 100; i++) {
            if(esPrimo(i)){
               System.out.print(i + " "); 
            }            
        }
    }
    
    public static boolean esPrimo(int numero) {
        boolean primo = true;
        int cantDivisores = 0;
        
        for(int i = 2; i < numero; i++){
            if(numero % i == 0) {
                cantDivisores++;
            }
        }
        
        if(cantDivisores > 0) {
            primo = false;
        } else {
            primo = true;
        }
        
        return primo;
    }
}
