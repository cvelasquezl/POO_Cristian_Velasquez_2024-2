package parte1;
//Capitulo 4 ejercicio propuesto 24
class EsferasPropuestas {
    private char[] nombres;
    private double[] pesos;

    public EsferasPropuestas(char[] nombres, double[] pesos) {
        this.nombres = nombres;
        this.pesos = pesos;
    }

    public char encontrarEsferaDiferente() {
        int diferente = 0;
        char esferaDiferente = ' ';
        
        for (int i = 0; i < 3; i++) {
            int mismosPesos = 0;
            for (int j = 0; j < 3; j++) {
                if (i != j && pesos[i] == pesos[j]) {
                    mismosPesos++;
                }
            }
            if (mismosPesos == 0 || mismosPesos == 1) {
                diferente++;
                esferaDiferente = nombres[i];
            }
        }
        
        if (diferente != 1) {
            System.out.println("Advertencia: No se encontró una esfera claramente diferente.");
        }
        
        return esferaDiferente;
    }
}