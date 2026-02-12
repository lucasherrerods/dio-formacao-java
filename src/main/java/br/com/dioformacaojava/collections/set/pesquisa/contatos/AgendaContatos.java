package br.com.dioformacaojava.collections.set.pesquisa.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone) {
        contatos.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        if (!contatos.isEmpty()) {
            for (Contato c : contatos) {
                if (c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;
        }   else {
            throw new RuntimeException("Lista de contatos vazia!");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contato = null;

        if (!contatos.isEmpty()) {
            for (Contato c : contatos) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumeroTelefone(novoNumero);
                    contato = c;
                    break;
                }
            }
            return contato;
        }   else {
            throw new RuntimeException("Lista de contatos vazia!");
        }
    }
}
