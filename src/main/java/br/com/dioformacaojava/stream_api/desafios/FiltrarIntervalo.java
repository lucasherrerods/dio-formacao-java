package br.com.dioformacaojava.stream_api.desafios;

import br.com.dioformacaojava.stream_api.Dados;
import br.com.dioformacaojava.stream_api.Desafio;

import java.util.List;

// Desafio 13
public class FiltrarIntervalo implements Desafio {

    @Override
    public void executar(List<Integer> numeros) {
        int inicioIntervalo = 2;
        int fimIntervalo = 8;

        List<Integer> listaIntervalo = numeros.stream()
                                              .filter(n -> n > inicioIntervalo && n < fimIntervalo)
                                              .toList();

        System.out.println("Lista (INTERVALO ENTRE " + inicioIntervalo + " e " + fimIntervalo + "): " + listaIntervalo);
    }

    public static void main(String[] args) {
        Dados db = new Dados();
        Desafio desafio = new FiltrarIntervalo();

        System.out.println("Lista original: " + db.getNumeros());
        desafio.executar(db.getNumeros());
    }
}
