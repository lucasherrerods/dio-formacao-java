package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 6
public class NumeroMaior10 implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        boolean contem = numeros.stream()
               .anyMatch(n -> n > 10);

        System.out.println("A lista possui algum número maior que 10? " + contem);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new NumeroMaior10();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
