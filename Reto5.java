/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos101;
import java.util.Scanner;
/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class Reto5 {
    public static void main(String aargs[]) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("Quiere calcular el area de:");
        System.out.println("1- Cuadrado");
        System.out.println("2- Triángulo");
        System.out.println("3- Rectángulo");
        System.out.print("Seleccione una opcion: ");
        int opcion = t.nextInt();
        System.out.printf("El area es: %.2f", poligono(opcion));
        
        t.close();
    }
    
    /**
     *
     * @param opcion
     * @return
     */
    public static float poligono(int opcion) {
        Scanner t = new Scanner(System.in);
        float area = 0;
        float base, altura;
        
         switch(opcion) {
            case 1:
                System.out.println("Ingrese el valor del lado para calcular el área del cuadrado");
                System.out.print("Lado: ");
                base = t.nextFloat();
                area = base * base;
                break;
                
            case 2:
                System.out.println("Ingrese base y altura para calcular el área del triángulo");
                System.out.print("Base: ");
                base = t.nextFloat();
                System.out.print("Altura: ");
                altura = t.nextFloat();
                area = (base * altura) / 2;
                break;
                
            case 3:
                System.out.println("Ingrese base y altura para calcular el área del rectángulo");
                System.out.print("Base: ");
                base = t.nextFloat();
                System.out.print("Altura: ");
                altura = t.nextFloat();
                area = base * altura;
                break;
                
            default:
                area = -1;  // Indica una opción no válida
                break;
        }
        
        t.close();
        return area;
    }
}
