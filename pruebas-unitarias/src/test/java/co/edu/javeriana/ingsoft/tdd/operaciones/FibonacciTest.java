package co.edu.javeriana.ingsoft.tdd.operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    void calcularFibonacciNegativo() {

        int numero=-1;

        assertThrows(IllegalArgumentException.class, ()-> fibonacci.calcular(numero));
    }

    @Test
    void calcularFibonacciCero(){

        int numero=0;
        int resultado= fibonacci.calcular(numero);

        assertEquals(0,resultado);
    }

    @Test
    void calcularFibonacciUno(){

        int numero=1;
        int resultado= fibonacci.calcular(numero);

        assertEquals(1,resultado);

    }

    @Test
    void calcularFibonacciDos(){
        int numero=2;
        int resultado= fibonacci.calcular(numero);

        assertEquals(1,resultado);
    }
}