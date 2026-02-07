package br.com.dioformacaojava.javabasico.pooiphone.interfaces;

import br.com.dioformacaojava.javabasico.pooiphone.exceptions.MusicException;

public interface ReprodutorMusical {
    void tocar() throws MusicException;
    void pausar() throws MusicException;
    void selecionarMusica(String musica) throws MusicException;
}
