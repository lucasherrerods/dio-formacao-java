package br.com.dioformacaojava.collections.list.operacoes.tarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.obterDescricaoTarefas();

        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar");
        listaTarefa.adicionarTarefa("Ir para a academia");
        listaTarefa.adicionarTarefa("Passear com o Ted");
        listaTarefa.adicionarTarefa("Estudar");

        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
        listaTarefa.obterDescricaoTarefas();

        listaTarefa.removerTarefa("Estudar");

        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
        listaTarefa.obterDescricaoTarefas();

        listaTarefa.removerTarefa("Comprar leite");

        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
        listaTarefa.obterDescricaoTarefas();

    }
}
