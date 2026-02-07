package br.com.dioformacaojava.javabasico.bancodigital;

import br.com.dioformacaojava.javabasico.bancodigital.exceptions.SaldoException;
import br.com.dioformacaojava.javabasico.bancodigital.model.*;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente = new Cliente("Lucas");

        Conta cc = new ContaCorrente(cliente);
        banco.adicionarConta(cc);
        Conta poupanca = new ContaPoupanca(cliente);
        banco.adicionarConta(poupanca);

        try {
            cc.depositar(150.45);
            poupanca.depositar(450.98);
            cc.sacar(800.45);
            poupanca.sacar(189.23);
            cc.transferir(10.23, poupanca);
            poupanca.transferir(56, cc);
        }   catch (SaldoException e) {
            System.out.println(e.getMessage());
        }

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.listarContas();
    }
}
