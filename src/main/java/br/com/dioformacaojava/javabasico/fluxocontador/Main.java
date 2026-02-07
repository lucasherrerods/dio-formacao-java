package br.com.dioformacaojava.javabasico.fluxocontador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- CONTADOR -----");
        System.out.println("--------------------");
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        try {
            count(n1, n2);
        }   catch (InvalidParamsException e) {
            System.out.println("[ERRO] O primeiro número tem que ser menor do que o segundo.");
        }
    }

    public static void count(int n1, int n2) throws InvalidParamsException{
        if (n1 > n2) {
            throw new InvalidParamsException();
        }

        System.out.println("Iniciando contagem...");

        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }
}
