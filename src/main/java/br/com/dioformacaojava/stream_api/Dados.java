package br.com.dioformacaojava.stream_api;

import java.util.Arrays;
import java.util.List;

public class Dados {
    private List<Integer> numeros;

    public Dados() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    public List<Integer> getNumeros() {
        return numeros;
    }
}
