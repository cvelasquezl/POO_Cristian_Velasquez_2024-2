/*Este es el Ejercicio N°17 del libro Lógica de Programación de Efraín Oviedo */

package com.mycompany.ejercicio5;
public class Ejercicio5 {
    public static void main(String[] args) {
        double radio, area, circ;
        radio=15;
        area = Math.pow(radio,2)*Math.PI;
        circ = 2*Math.PI*radio;
        
        System.out.println("El radio es: " + radio);
        System.out.println("El area de la circunferencia es: " + area);
        System.out.println("La longitud de la circunferencia es: " + circ);
        
    }
}
