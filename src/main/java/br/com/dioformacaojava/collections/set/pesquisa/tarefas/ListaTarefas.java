package br.com.dioformacaojava.collections.set.pesquisa.tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefas.remove(descricao);
    }

    public void exibirTarefas() {
        System.out.println(tarefas);
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();

        for (Tarefa t : tarefas) {
            if (t.isChecked()) {
                concluidas.add(t);
            }
        }

        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();

        for (Tarefa t : tarefas) {
            if (!t.isChecked()) {
                pendentes.add(t);
            }
        }

        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefa = null;

        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa = t;
            }
        }

        tarefa.setChecked(true);
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefa = null;

        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa = t;
            }
        }

        tarefa.setChecked(false);
    }

    public void limparListaTarefas() {
        tarefas.clear();
    }
}
