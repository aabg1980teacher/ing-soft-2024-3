package co.edu.javeriana.ingsoft.tdd.operaciones;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private Map<Integer, Integer> cache = new HashMap<>();

    /**
     * f < 0 IlegalArgumentExcepcion
     * F 0 = 0
     * F 1 = 1
     * F 2 = 1
     * F 3 = 2
     * F n = F n-1 + F n-2
     * El resultado no puede pasar la constante Integer.MAX_VALUE
     * */
    public int calcular(int n) {
        if(n<0) {
            throw new IllegalArgumentException("El fibonacci solo funciona con numeros negativos "+ n);
        }
        if(n==0) {
            return 0;
        }
        if(n==1||n==2) {
            return 1;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int result = calcular(n - 1) + calcular(n - 2);
        cache.put(n, result);
        return result;

       //return -1;
    }




}
