package com.br.ivanconsalter;

import java.util.List;

public interface Telefone {
	
	void fazerChamada(String numero);
    void receberChamada(String numero);
    List<String> getListaContato();

}
