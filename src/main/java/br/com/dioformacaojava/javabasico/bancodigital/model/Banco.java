package br.com.dioformacaojava.javabasico.bancodigital.model;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        System.out.println("---------------");
        System.out.println("Listando contas:");
        System.out.println("---------------");

        for (Conta c : contas) {
            c.contaInfo();
            System.out.println("---------------");
        }
    }
}
