package br.com.dioformacaojava.collections.set.ordenacao.alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(Long matricula) {
        Aluno aluno = null;

        for (Aluno a : alunos) {
            if (a.getMatricula().equals(matricula)) {
                aluno = a;
            }
        }

        alunos.remove(aluno);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos() {
        return alunos;
    }
}
