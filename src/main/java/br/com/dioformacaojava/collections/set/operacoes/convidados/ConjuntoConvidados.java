package br.com.dioformacaojava.collections.set.operacoes.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidado = null;

        for (Convidado c : convidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidado = c;
            }
        }

        convidados.remove(convidado);
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(this.convidados);
    }
}
