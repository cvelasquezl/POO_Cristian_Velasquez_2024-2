package parte1;
//Capitulo 4 ejercicio resuelto 14
class Departamento {
    private double ventas;
    private double salarioVendedor;

    public Departamento(double ventas, double salarioVendedor) {
        this.ventas = ventas;
        this.salarioVendedor = salarioVendedor;
    }

    public double calcularSalarioFinal(double ventasTotales) {
        double porcentajeVentas = ventas / ventasTotales;
        double salarioAdicional = 0;

        
        if (porcentajeVentas > 0.33) {
            salarioAdicional = 0.20 * salarioVendedor; 
        }

        
        return salarioVendedor + salarioAdicional;
    }
}
