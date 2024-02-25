/*Este es el Ejercicio N°12 del libro Lógica de Programación de Efraín Oviedo */

package com.mycompany.ejercicio3;
public class Ejercicio3 {
    public static void main(String[] args) {
        double hrstrab, valhora, reten, porcenreten, salbruto, salneto; 
        valhora = 5000;
        hrstrab = 48;
        salbruto = valhora*hrstrab;
        porcenreten = (12.5/100);
        reten = salbruto* porcenreten;
        salneto = salbruto - reten;
        
        System.out.println("Horas Trabajadas: " + hrstrab);
        System.out.println("Valor de la Hora: " + valhora);
        System.out.println("Salario Bruto: " + salbruto);
        System.out.println("Porcentaje de retencion en la fuente: " + porcenreten*100 + "%");
        System.out.println("Valor de Retencion en la fuente: " + reten);
        System.out.println("Salario Neto: " + salneto);
        
        
    }
}