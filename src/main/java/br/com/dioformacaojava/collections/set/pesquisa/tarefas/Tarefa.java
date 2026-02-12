package br.com.dioformacaojava.collections.set.pesquisa.tarefas;

public class Tarefa {
    private String descricao;
    private boolean checked;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.checked = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", checked=" + checked +
                '}';
    }
}
