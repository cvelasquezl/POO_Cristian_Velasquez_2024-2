package parte1;
//Capitulo 4 ejercicio resuelto N 12
public class Trabajador {
    private String nombres;
    private int horasTrabajadas;
    private double valorHoraNormal;

    public Trabajador(String nombres, int horasTrabajadas, double valorHoraNormal) {
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraNormal = valorHoraNormal;
    }

    public double calcularPagoSemanal() {
        double pagoTotal = 0;

        if (horasTrabajadas <= 40) {
            pagoTotal += horasTrabajadas * valorHoraNormal;
        } else {
            pagoTotal += 40 * valorHoraNormal; 
            int horasExtras = horasTrabajadas - 40;
            
            if (horasExtras <= 8) {
                pagoTotal += horasExtras * valorHoraNormal * 2; 
            } 
            else {
                pagoTotal += 8 * valorHoraNormal * 2; 
                pagoTotal += (horasExtras - 8) * valorHoraNormal * 3; 
            }
        }

        return pagoTotal;
    }
}