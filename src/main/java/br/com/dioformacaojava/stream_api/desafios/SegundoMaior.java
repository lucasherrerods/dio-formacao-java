package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 7
public class SegundoMaior implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        Integer segundoMaior = numeros.stream()
                                      .sorted((a, b) -> b -a)
                                      .skip(1)
                                      .findFirst()
                                      .orElse(null);

        System.out.println("Segundo maior item da lista: " + segundoMaior);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new SegundoMaior();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
