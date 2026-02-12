package br.com.dioformacaojava.collections.set.operacoes.palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavra.isEmpty()) {
            for (String p : palavras) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavras.remove(p);
                }
            }
        }   else {
            System.out.println("Palavra informada não localizada no conjunto.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        boolean check = false;

        for (String p : palavras) {
            if (palavras.contains(palavra)) {
                return true;
            }
        }

        return check;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavras);
    }
}
