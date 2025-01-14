package parte1;
//Capítulo 3, ejercicio propuesto 19
public class TrianguloEq {
    private double lado;

    public TrianguloEq(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 3 * lado;
    }

    public double calcularAltura() {
        return (Math.sqrt(3) / 2) * lado;
    }

    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    public void imprimirInformacion() {
        System.out.println("Triángulo Equilátero");
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Altura: " + calcularAltura());
        System.out.println("Área: " + calcularArea());
    }
}
