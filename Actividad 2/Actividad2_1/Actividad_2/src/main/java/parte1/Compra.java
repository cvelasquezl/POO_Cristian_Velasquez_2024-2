package parte1;
//Capitulo 4 ejercicio resulto N 13
class Compra {
    private double valorCompra;
    private String colorBolita;

    public Compra(double valorCompra, String colorBolita) {
        this.valorCompra = valorCompra;
        this.colorBolita = colorBolita;
    }

    public double calcularDescuento() {
        switch (colorBolita) {
            case "verde":
                return 0.1 * valorCompra; 
            case "amarilla":
                return 0.25 * valorCompra; 
            case "azul":
                return 0.5 * valorCompra; 
            case "roja":
                return valorCompra; 
            default:
                return 0; 
        }
    }

    public double calcularTotal() {
        double descuento = calcularDescuento();
        return valorCompra - descuento;
    }
}
