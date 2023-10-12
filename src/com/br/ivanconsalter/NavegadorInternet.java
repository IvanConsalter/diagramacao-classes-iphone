package com.br.ivanconsalter;

public interface NavegadorInternet {
	
	void abrirPagina(String url);
    void voltarPagina(String paginaAnterior);
    void adicionarAoHistorico(String pagina);

}
