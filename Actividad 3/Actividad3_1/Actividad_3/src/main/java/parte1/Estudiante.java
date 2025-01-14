package parte1;
//Capitulo 4 ejercicio resuelto N 10
class Estudiante {
    private int numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estratoSocial;

    public Estudiante(int numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public String getNombres() {
        return nombres;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public int getEstratoSocial() {
        return estratoSocial;
    }

    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public void setEstratoSocial(int estratoSocial) {
        this.estratoSocial = estratoSocial;
    }

    public double calcularPagoMatricula() {
        double pagoMatriculaBase = 50000.0;
        if (patrimonio > 2000000 && estratoSocial > 3) {
            double incremento = patrimonio * 0.03;
            return pagoMatriculaBase + incremento;
        } 
        else {
            return pagoMatriculaBase;
        }
    }
}

