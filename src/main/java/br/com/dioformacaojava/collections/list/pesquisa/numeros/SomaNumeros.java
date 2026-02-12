package br.com.dioformacaojava.collections.list.pesquisa.numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        for (int i : numeros) {
            soma += i;
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = 0;

        for (int i : numeros) {
            if (i > maior) {
                maior = i;
            }
        }

        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = numeros.get(0);

        for (int i : numeros) {
            if (i < menor) {
                menor = i;
            }
        }

        return menor;
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }
}
