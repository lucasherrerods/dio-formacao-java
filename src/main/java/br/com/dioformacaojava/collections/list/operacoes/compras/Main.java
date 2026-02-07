package br.com.dioformacaojava.collections.list.operacoes.compras;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.exibirItens();

        carrinho.adicionarItem("Lápis", 1.58, 3);
        carrinho.adicionarItem("Lápis", 2.5, 3);
        carrinho.adicionarItem("Caderno", 35.89, 1);
        carrinho.adicionarItem("Borracha", 3.57, 2);
        carrinho.adicionarItem("Mochila", 189.47, 10);

        carrinho.exibirItens();

        carrinho.removerItem("Lápis");

        carrinho.exibirItens();

        System.out.println("Valor total da compra: R$" + carrinho.calcularValorTotal());
    }
}
