package co.edu.javeriana.ingsoft.tdd.pruebas;

import java.util.ArrayList;
import java.util.List;

public class BasePrueba {

    private List<Boolean> resultadoPruebas;

    public BasePrueba() {
        resultadoPruebas = new ArrayList<>();
    }

    public void adicionarResultado(Boolean resultado) {
        resultadoPruebas.add(resultado);
    }

    public void generarReporte() {
        System.out.println("Pruebas ejecutadas: " + resultadoPruebas.size());
        System.out.println(resultadoPruebas);
    }

}
