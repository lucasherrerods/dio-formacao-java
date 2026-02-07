package br.com.dioformacaojava.collections.list.operacoes.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();

        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasRemover.add(t);
                }
            }
            listaTarefas.removeAll(tarefasRemover);
        }   else {
            System.out.println("Lista vazia!");
        }

    }

    public int obterNumeroTotalTarefas() {
        return listaTarefas.size();
    }

    public void obterDescricaoTarefas() {
        if (!listaTarefas.isEmpty()) {
            System.out.println(listaTarefas);
            System.out.println("-------------------");
        }   else {
            System.out.println("Lista vazia!");
            System.out.println("-------------------");
        }
    }
}
