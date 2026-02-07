package br.com.dioformacaojava.javabasico.pooiphone.model;

import br.com.dioformacaojava.javabasico.pooiphone.exceptions.MusicException;
import br.com.dioformacaojava.javabasico.pooiphone.interfaces.AparelhoTelefonico;
import br.com.dioformacaojava.javabasico.pooiphone.interfaces.NavegadorInternet;
import br.com.dioformacaojava.javabasico.pooiphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private int armazenamento;
    private String musica;

    public Iphone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public String getModelo() {
        return modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public String getMusica() {
        return musica;
    }

    @Override
    public void tocar() throws MusicException {
        if (getMusica() == null || getMusica().isEmpty()) {
            throw new MusicException("[ERRO] Nenhuma música selecionada.");
        }

        System.out.println("PLAYING: " + getMusica().toUpperCase() + "...");
    }

    @Override
    public void pausar() throws MusicException {
        if (getMusica() == null || getMusica().isEmpty()) {
            throw new MusicException("[ERRO] Nenhuma música selecionada.");
        }

        System.out.println("PAUSE: " + getMusica().toUpperCase());
    }

    @Override
    public void selecionarMusica(String musica) throws MusicException {

        if (musica == null || musica.isEmpty()) {
            throw new MusicException("[ERRO] Preencha o campo corretamente.");
        }

        this.musica = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Aba atual: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova página.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
