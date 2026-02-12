package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 5
public class MediaNumeros implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        List<Integer> maior = numeros.stream()
                                     .filter(n -> n > 5)
                                     .toList();

        double media = maior.stream()
                            .mapToInt(Integer::intValue)
                            .average()
                            .orElse(0.0);

        System.out.println("Números maior que 5: " + maior);
        System.out.println("Média: "+ media);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new MediaNumeros();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
