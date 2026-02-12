package br.com.dioformacaojava.collections.list.ordenacao.numeros;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        System.out.print("Lista de números: ");
        numeros.exibirNumeros();

        System.out.print("Ordem ascendente: ");
        System.out.println(numeros.ordenarAscendente());

        System.out.print("Ordem descendente: ");
        System.out.println(numeros.ordenarDescendente());

    }
}
