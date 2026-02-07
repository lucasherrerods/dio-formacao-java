package br.com.dioformacaojava.javabasico.bancodigital.interfaces;

import br.com.dioformacaojava.javabasico.bancodigital.exceptions.SaldoException;
import br.com.dioformacaojava.javabasico.bancodigital.model.Conta;

public interface ContaInterface {
    void depositar(double valor);

    void sacar(double valor) throws SaldoException;

    void transferir(double valor, Conta conta) throws SaldoException;

    void imprimirExtrato();
}
