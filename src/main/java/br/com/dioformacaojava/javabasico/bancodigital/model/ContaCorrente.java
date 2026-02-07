package br.com.dioformacaojava.javabasico.bancodigital.model;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.tipo = "Conta Corrente";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- EXTRATO | CONTA CORRENTE ---");
        super.imprimirInfos();
    }
}
