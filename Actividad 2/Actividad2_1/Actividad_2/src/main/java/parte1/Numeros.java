package parte1;
//Capitulo 4 ejercicio resuelto N 11
class Numeros {
    private int num1;
    private int num2;
    private int num3;

    public Numeros(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int encontrarMayor() {
        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        return mayor;
    }
}
