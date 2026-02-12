package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 11
public class SomaQuadrados implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        int soma = numeros.stream()
                          .mapToInt(n -> n * n)
                          .sum();

        System.out.println("Soma do quadrado dos números: " + soma);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new SomaQuadrados();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
