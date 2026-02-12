package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 2
public class SomaPares implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        int soma = numeros.stream()
                          .filter(n -> n % 2 == 0)
                          .mapToInt(Integer::intValue)
                          .sum();

        System.out.println("Soma dos valores (PARES): " + soma);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new SomaPares();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
