package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 1
public class OrdemNumerica implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        numeros.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new OrdemNumerica();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
