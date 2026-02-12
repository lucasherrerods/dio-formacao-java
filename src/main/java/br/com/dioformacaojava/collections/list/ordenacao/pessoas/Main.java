package br.com.dioformacaojava.collections.list.ordenacao.pessoas;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa listaPessoas = new OrdenacaoPessoa();

        listaPessoas.adicionarPessoa("Lucas", 25, 1.75);
        listaPessoas.adicionarPessoa("Fábio", 49, 1.70);
        listaPessoas.adicionarPessoa("Isabelle", 21, 1.56);
        listaPessoas.adicionarPessoa("Pedro", 19, 1.80);


        System.out.println("Lista original:");
        System.out.println(listaPessoas.getPessoas());

        System.out.println("Lista ordenada por idade:");
        System.out.println(listaPessoas.ordenarPorIdade());

        System.out.println("Lista ordenada por altura:");
        System.out.println(listaPessoas.ordenarPorAltura());
    }
}
