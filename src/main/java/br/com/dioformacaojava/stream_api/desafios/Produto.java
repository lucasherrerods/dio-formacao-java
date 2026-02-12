package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 12
public class Produto implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        int produto = numeros.stream()
                             .reduce(1, (a, b) -> a * b);

        System.out.println("Produto: " + produto);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new Produto();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
