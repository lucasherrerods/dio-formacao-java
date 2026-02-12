package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 9
public class NumerosDistintos implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        boolean distintos = numeros.stream()
                                   .distinct()
                                   .count() == numeros.size();

        System.out.println("Todos os números são distintos? " + distintos);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new NumerosDistintos();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
