package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 3
public class NumerosPositivos implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        boolean resultado = numeros.stream()
                                   .allMatch(n -> n > 0);

        System.out.println("Todos os números da lista são positivos? " + resultado);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new NumerosPositivos();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
