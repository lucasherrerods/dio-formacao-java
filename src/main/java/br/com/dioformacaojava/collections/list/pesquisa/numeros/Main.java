package br.com.dioformacaojava.collections.list.pesquisa.numeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(20);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(30);
        numeros.adicionarNumero(95);
        numeros.adicionarNumero(17);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(46);
        numeros.adicionarNumero(11);

        System.out.println("Números adicionados:");
        System.out.println(numeros.exibirNumeros());

        System.out.println("Soma dos números: " + numeros.calcularSoma());

        System.out.println("Maior número: " + numeros.encontrarMaiorNumero());

        System.out.println("Menor número: " + numeros.encontrarMenorNumero());
    }
}
