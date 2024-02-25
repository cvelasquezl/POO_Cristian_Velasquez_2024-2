/*Este es el Ejercicio N°5 del libro Lógica de Programación de Efraín Oviedo */

package com.mycompany.ejercicio2;
public class Ejercicio2 {
    public static void main(String[] args) {
        double suma, x, y; 
        suma = 0;
        x = 20;
        suma = suma + x;
        y = 40;
        x = x + Math.pow(y,2);
        suma = suma + (x/y);
        
        System.out.println("El valor de la suma es: " + suma);
        
    }
}
