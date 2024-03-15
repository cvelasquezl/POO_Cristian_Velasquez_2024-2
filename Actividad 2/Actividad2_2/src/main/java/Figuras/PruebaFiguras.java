package Figuras;

public class PruebaFiguras {
/**
* Método main que crea un círculo, un rectángulo, un cuadrado y
* un triángulo rectángulo. Para cada uno de estas figuras geométricas,
* se calcula su área y perímetro.
     * @param args
*/
public static void main(String[] args) {
    Circulo figura1 = new Circulo(2);
    Rectangulo figura2 = new Rectangulo(1,2);
    Cuadrado figura3 = new Cuadrado(3);
    TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
    
    System.out.println("El area del circulo es = " + figura1.calcularArea());
    System.out.println("El perimetro del circulo es = " + figura1.calcularPerímetro());
    System.out.println();
    System.out.println("El area del rectangulo es = " + figura2.calcularArea());
    System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerímetro());
    System.out.println();
    System.out.println("El area del cuadrado es = " + figura3.calcularArea());
    System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerímetro());
    System.out.println();
    System.out.println("El area del triangulo es = " + figura4.calcularArea());
    System.out.println("El perimetro del triangulo es = " + figura4.calcularPerímetro());
    figura4.determinarTipoTriángulo();
    }
}
