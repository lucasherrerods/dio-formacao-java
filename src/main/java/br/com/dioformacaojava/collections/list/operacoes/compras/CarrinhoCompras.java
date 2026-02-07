package br.com.dioformacaojava.collections.list.operacoes.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itens;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();

        if (!itens.isEmpty()) {
            for (Item i : itens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensRemover.add(i);
                }
            }
            itens.removeAll(itensRemover);
        }   else {
            System.out.println("Carrinho vazio!");
        }
    }

    public double calcularValorTotal() {
        double total = 0;

        for (Item i : itens) {
            double valor = i.getPreco() * i.getQuantidade();
            total += valor;
        }

        return total;
    }

    public void exibirItens() {
        System.out.println("CARRINHO");
        System.out.println("-------------------");
        System.out.println(itens);
    }
}
