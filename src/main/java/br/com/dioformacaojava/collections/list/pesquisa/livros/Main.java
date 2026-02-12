package br.com.dioformacaojava.collections.list.pesquisa.livros;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogo.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogo.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogo.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogo.pesquisarPorAutor("Robert C. Martin"));

        System.out.println(catalogo.pesquisarPorAutor("Autor Inexistente"));

        System.out.println(catalogo.pesquisarPorIntervaloAnos(2010, 2022));

        System.out.println(catalogo.pesquisarPorIntervaloAnos(2025, 2030));

        System.out.println(catalogo.pesquisarPorTitulo("Java Guia do Programador"));

        System.out.println(catalogo.pesquisarPorTitulo("Título Inexistente"));
    }
}
