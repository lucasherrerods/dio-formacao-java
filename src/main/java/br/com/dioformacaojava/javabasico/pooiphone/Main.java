package br.com.dioformacaojava.javabasico.pooiphone;

import br.com.dioformacaojava.javabasico.pooiphone.exceptions.MusicException;
import br.com.dioformacaojava.javabasico.pooiphone.model.Iphone;

import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Configurando novo iPhone");
        System.out.print("Digite o modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Insira o armazenamento disponível: ");
        int armazenamento = sc.nextInt();
        int choice;

        Iphone iphone = new Iphone(modelo, armazenamento);
        System.out.println("---- MEU IPHONE ----");
        System.out.println("--------------------");
        System.out.println("Modelo: " + iphone.getModelo().toUpperCase());
        System.out.println("Memória: " + iphone.getArmazenamento() + "GB");

        do {
            System.out.println("--------------------");
            System.out.println("Selecione uma função:");
            System.out.println("--------------------");
            System.out.println("1. Reprodução Musical");
            System.out.println("2. Telefone");
            System.out.println("3. Navegar na internet");
            System.out.println("0. Desligar");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    musical(iphone);
                    break;
                case 2:
                    telefone(iphone);
                    break;
                case 3:
                    internet(iphone);
                    break;
                case 0:
                    System.out.println("Logout...");
                    break;
                default:
                    System.out.println("[ERRO] Valor inválido.");
                    break;
            }
        }   while (choice != 0);
    }

    public static void musical(Iphone iphone) {
        int choice;

        do {
            System.out.println("--------------------");
            System.out.println("Selecione uma ação: ");
            System.out.println("--------------------");
            System.out.println("1. Tocar");
            System.out.println("2. Pausar");
            System.out.println("3. Selecionar música");
            System.out.println("0. Voltar");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    try {
                        iphone.tocar();
                    } catch (MusicException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        iphone.pausar();
                    } catch (MusicException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        sc.nextLine();
                        System.out.print("Digite a música: ");
                        String musica = sc.nextLine();

                        iphone.selecionarMusica(musica);
                    } catch (MusicException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("[ERRO] Valor inválido.");
                    break;
            }
        }   while (choice != 0);
    }

    public static void telefone(Iphone iphone) {
        int choice;

        do {
            System.out.println("--------------------");
            System.out.println("Selecione uma ação: ");
            System.out.println("--------------------");
            System.out.println("1. Ligar");
            System.out.println("2. Atender");
            System.out.println("3. Iniciar correio de voz");
            System.out.println("0. Voltar");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    iphone.ligar("11999999999");
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("[ERRO] Valor inválido.");
                    break;
            }
        }   while (choice != 0);
    }

    public static void internet(Iphone iphone) {
        int choice;

        do {
            System.out.println("--------------------");
            System.out.println("Selecione uma ação: ");
            System.out.println("--------------------");
            System.out.println("1. Exibir página");
            System.out.println("2. Adicionar nova aba");
            System.out.println("3. Atualizar página");
            System.out.println("0. Voltar");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    iphone.exibirPagina("www.github.com/lucasherrerods");
                    break;
                case 2:
                    iphone.adicionarNovaAba();
                    break;
                case 3:
                    iphone.atualizarPagina();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("[ERRO] Valor inválido.");
                    break;
            }
        }   while (choice != 0);
    }
}
