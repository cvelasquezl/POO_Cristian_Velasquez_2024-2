package parte1;
//Capitulo 4 ejercicio propuesto 22
class EmpleadoPropuesto {
    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoPropuesto(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioMensual() {
        return salarioPorHora * horasTrabajadas;
    }

    public void imprimirSalario() {
        double salarioMensual = calcularSalarioMensual();
        if (salarioMensual > 450000) {
            System.out.println("Nombre del empleado: " + nombre);
            System.out.println("Salario mensual del empleado: $" + salarioMensual);
        } 
        else {
            System.out.println("Nombre del empleado: " + nombre);
        }
    }
}