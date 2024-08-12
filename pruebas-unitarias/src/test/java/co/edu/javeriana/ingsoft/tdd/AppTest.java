package co.edu.javeriana.ingsoft.tdd;


import co.edu.javeriana.ingsoft.tdd.operaciones.Division;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private Division division = new Division();

    @Test
    void testDivisionPorZero() {
        int divisor = 50;
        int dividendo = 0;
        assertThrows( IllegalArgumentException.class, () -> division.dividir(divisor, dividendo));
    }

    @Test
    void testDivisionOK() {
        int divisor = 50;
        int dividendo = 2;
        float resultado = division.dividir(divisor, dividendo);

        assertEquals(25.0f, resultado);
    }

}
