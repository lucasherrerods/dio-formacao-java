package br.com.dioformacaojava.collections.list.pesquisa.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> autorLivros = new ArrayList<>();

        if (!catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    autorLivros.add(l);
                }
            }
            return autorLivros;
        }   else {
            throw new RuntimeException("Catálogo vazio!");
        }

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> autorLivros = new ArrayList<>();

        if (!catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    autorLivros.add(l);
                }
            }

            if (!autorLivros.isEmpty()) {
                return autorLivros;
            }   else {
                throw new RuntimeException("Nenhum livro encontrado dentro do período informado!");
            }
        }   else {
            throw new RuntimeException("Catálogo vazio!");
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livro = null;

        if (!catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livro = l;
                    break;
                }
            }
            return livro;
        }   else {
            throw new RuntimeException("Catálogo vazio!");
        }

    }
}
