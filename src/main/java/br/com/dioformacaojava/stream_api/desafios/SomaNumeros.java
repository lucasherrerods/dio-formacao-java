package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 8
public class SomaNumeros implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        int soma = numeros.stream()
                          .mapToInt(Integer::intValue)
                          .sum();

        System.out.println("Soma: " + soma);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new SomaNumeros();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
