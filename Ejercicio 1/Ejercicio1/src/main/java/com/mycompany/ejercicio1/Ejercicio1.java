/*Este es el Ejercicio N°4 del libro Lógica de Programación de Efraín Oviedo */

package com.mycompany.ejercicio1;
public class Ejercicio1 {
    public static void main(String[] args) {
        int edjuan = 9;
        int edana, edalber, edmama;
        edalber=2*(edjuan/3);
        edana=4*(edjuan/3);
        edmama=edjuan+edalber+edana;
        
        System.out.println("Las edades son:");
        System.out.println("Alberto: "+ edalber);
        System.out.println("Juan: "+ edjuan);
        System.out.println("Ana: "+ edana);
        System.out.println("Mama: "+ edmama); 
    }
}
