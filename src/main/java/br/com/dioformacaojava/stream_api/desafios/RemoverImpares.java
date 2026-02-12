package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 4
public class RemoverImpares implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        List<Integer> pares = numeros.stream()
                                     .filter(n -> n % 2 == 0)
                                     .toList();

        System.out.println("Removendo ímpares: " + pares);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new RemoverImpares();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
