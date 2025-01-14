package parte1;
//Capítulo 3, ejercicio propuesto 18
public class Empleado {
    private int codigoEmpleado;
    private String nombres;
    private double horasTrabajadas;
    private double valorHora;
    private double porcentajeRetencion;

    public Empleado(int codigoEmpleado, String nombres, double horasTrabajadas, double valorHora, double porcentajeRetencion) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getPorcentajeRetencion() {
        return porcentajeRetencion;
    }

    public void setPorcentajeRetencion(double porcentajeRetencion) {
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public double calcularSalarioNeto() {
        double salarioBruto = horasTrabajadas * valorHora;
        double retencion = salarioBruto * (porcentajeRetencion / 100);
        return salarioBruto - retencion;
    }

    public void imprimirInformacion() {
        System.out.println("Código Empleado: " + codigoEmpleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto:" + horasTrabajadas * valorHora);
        System.out.println("Salario Neto: " + calcularSalarioNeto());
    }
}