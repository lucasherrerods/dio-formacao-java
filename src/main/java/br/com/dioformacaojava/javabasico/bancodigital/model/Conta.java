package br.com.dioformacaojava.javabasico.bancodigital.model;

import br.com.dioformacaojava.javabasico.bancodigital.exceptions.SaldoException;
import br.com.dioformacaojava.javabasico.bancodigital.interfaces.ContaInterface;

public abstract class Conta implements ContaInterface {
    private static final int agenciaPadrao = 1;
    private static int count = 1;

    private int numero;
    private int agencia;
    protected String tipo;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.numero = count++;
        this.agencia = agenciaPadrao;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) throws SaldoException {
        if (this.saldo <= 0 || (this.saldo - valor) <= 0) {
            throw new SaldoException("[ERRO] Saldo insuficiente!");
        }

        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta conta) throws SaldoException {
        this.sacar(valor);
        conta.depositar(valor);
    }

    protected void imprimirInfos() {
        System.out.println("Titular: " + getCliente().getNome());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número CC: " + getNumero());
        System.out.println("Saldo: R$" + String.format("%.2f", getSaldo()));
    }

    void contaInfo() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Titular: " + getCliente().getNome());
        System.out.println("Número CC: " + getNumero());
    }
}
