/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos101;

/**
 *
 * @author Victor PC
 */
public class Reto1 {
    public static void main(String args[]) {
        for(int i = 1; i < 101; i++){
            if(i % 2 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");                
            }
            else if(i % 2 == 0) {
                System.out.println("fizz");                
            }
            else if(i % 5 == 0) {
                System.out.println("buzz");                
            } else {
                System.out.println(i);
            }             
        }
    }
}
