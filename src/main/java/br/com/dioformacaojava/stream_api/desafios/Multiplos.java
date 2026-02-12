package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 10
public class Multiplos implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        List<Integer> multiplos = numeros.stream()
                                         .filter(n -> n % 3 == 0 || n % 5 == 0)
                                         .toList();

        System.out.println("Múltiplos de 3 ou 5: " + multiplos);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new Multiplos();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
