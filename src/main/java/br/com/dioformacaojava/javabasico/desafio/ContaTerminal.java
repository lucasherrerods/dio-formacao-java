package br.com.dioformacaojava.javabasico.desafio;

import java.util.Scanner;

public class ContaTerminal {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem vindo ao Banco Central! Vamos criar sua conta?");

        System.out.print("Por favor, insira o número da sua conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite qual a sua agência (000-0): ");
        String agencia = sc.nextLine();

        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o saldo atual da conta: ");
        double saldo = sc.nextDouble();

        ContaBanco contaBanco = new ContaBanco(numero, agencia, nome, saldo);

        System.out.println("Olá " + contaBanco.getNomeCliente() + ", obrigado por criar uma conta em nosso banco! Sua agência é " + contaBanco.getAgencia() + ", conta " + contaBanco.getNumero() + " e seu saldo R$" + contaBanco.getSaldo() + " já está disponível para saque.");
    }
}
