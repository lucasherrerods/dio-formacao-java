package br.com.dioformacaojava.javabasico.bancodigital.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.tipo = "Conta Poupança";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- EXTRATO | CONTA POUPANCA ---");
        super.imprimirInfos();
    }
}
