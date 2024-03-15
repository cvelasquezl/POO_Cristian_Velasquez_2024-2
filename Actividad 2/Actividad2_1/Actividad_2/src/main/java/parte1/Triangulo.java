package parte1;
//Capitulo 3 ejercicio propuesto 21
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularSemiperimetro() {
        return calcularPerimetro() / 2;
    }

    public double calcularArea() {
        double s = calcularSemiperimetro();
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public void imprimirInformacion() {
        System.out.println("Triángulo:");
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Semiperímetro: " + calcularSemiperimetro());
        System.out.println("Área: " + calcularArea());
    }
}