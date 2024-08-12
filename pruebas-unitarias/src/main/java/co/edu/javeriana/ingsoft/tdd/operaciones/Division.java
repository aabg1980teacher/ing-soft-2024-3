package co.edu.javeriana.ingsoft.tdd.operaciones;

public class Division {

    public float dividir(int dividendo, int divisor) {
        Double resultado;
        if(divisor==0) {
            throw new IllegalArgumentException("No se puede dividir por 0");
        }
        resultado = (double) dividendo / divisor;
        return resultado.floatValue();
    }
}
