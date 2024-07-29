/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos101;

/**
 *
 * @author Victor PC
 */
public class Reto3 {
    public static void main(String args[]){
        int f1 = 0;
        int f2 = 1;
        int aux = 0;
        
        System.out.print("0 1");  
        for (int i = 0; i < 50; i++) {
            aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print(" " + f2);
        }
    }
}
