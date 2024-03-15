package parte1;
//Capitulo 4 ejercicio resulto N 7
public class AyB {
    private double A;
    private double B;

    public AyB(double A, double B) {
        this.A = A;
        this.B = B;
    }

    public void comparar() {
        if (A > B) {
            System.out.println("A es mayor que B.");
        } else if (A < B) {
            System.out.println("A es menor que B.");
        } else {
            System.out.println("A es igual a B.");
        }
    }

    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }
}