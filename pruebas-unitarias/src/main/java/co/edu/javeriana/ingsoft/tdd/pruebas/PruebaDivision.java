package co.edu.javeriana.ingsoft.tdd.pruebas;

import co.edu.javeriana.ingsoft.tdd.operaciones.Division;

public class PruebaDivision extends BasePrueba {

    private Division division = new Division();

    public PruebaDivision() {
        super();
    }

    public void testDivisionZero() {
        int divisor = 50;
        int dividendo = 0;
        try {
            division.dividir(divisor, dividendo);
            this.adicionarResultado(false);
        }
        catch (IllegalArgumentException e) {
            this.adicionarResultado(true);
            e.printStackTrace();
        }
    }

    public void testRealizarDivisionOK() {
        int divisor = 50;
        int dividendo = 2;
        float resultado = division.dividir(divisor, dividendo);
        if(resultado==25.0f) {
            this.adicionarResultado(true);
        }
        else {
            this.adicionarResultado(false);
        }
    }

    public static void main(String args[]) {
        PruebaDivision pruebaDivision = new PruebaDivision();
        pruebaDivision.testDivisionZero();
        pruebaDivision.testRealizarDivisionOK();
        pruebaDivision.generarReporte();
    }
}
