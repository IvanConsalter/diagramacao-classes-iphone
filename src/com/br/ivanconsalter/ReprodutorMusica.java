package com.br.ivanconsalter;

import java.util.List;

public interface ReprodutorMusica {

	void reproduzirMusica(String musica);
    void pausarMusica();
    void ajustarVolume(int volume);
    List<String> getListaMusica();
    
}
