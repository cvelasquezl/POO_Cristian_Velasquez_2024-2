package parte1;
//Capitulo 4 ejercicio propuesto 23
class EcuacionSegundoGrado {
    private double coeficienteA;
    private double coeficienteB;
    private double coeficienteC;

    public EcuacionSegundoGrado(double coeficienteA, double coeficienteB, double coeficienteC) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    public String resolverEcuacion() {
        double discriminante = coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;
        
        if (discriminante > 0) {
            
            double x1 = (-coeficienteB + Math.sqrt(discriminante)) / (2 * coeficienteA);
            double x2 = (-coeficienteB - Math.sqrt(discriminante)) / (2 * coeficienteA);
            return "Las soluciones son: " + x1 + " y " + x2;
        } else if (discriminante == 0) {

            double x = -coeficienteB / (2 * coeficienteA);
            return "La solución es: " + x;
        } 
        else {
            
            return "No hay soluciones reales";
        }
    }
}
