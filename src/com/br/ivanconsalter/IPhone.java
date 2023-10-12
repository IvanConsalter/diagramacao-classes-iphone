package com.br.ivanconsalter;

import java.util.ArrayList;
import java.util.List;

public class IPhone implements Telefone, ReprodutorMusica, NavegadorInternet {
	
	private String numeroTelefone;
    private int volume;
    private String paginaAtual;
    private List<String> listaDeContatos;
    private List<String> listaDeMusicas;

    public IPhone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        this.volume = 50;
        this.paginaAtual = "";
        this.listaDeContatos = new ArrayList<>();
        this.listaDeMusicas = new ArrayList<>();
    }
    
    public String getNumeroTelefone() {
		return numeroTelefone;
	}
    
    public int getVolume() {
		return volume;
	}
    
    public void setVolume(int volume) {
		this.volume = volume;
	}
    
    public String getPaginaAtual() {
		return paginaAtual;
	}
    
    public void setPaginaAtual(String paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

    @Override
    public void fazerChamada(String numero) {
        // Implementação para fazer chamadas
    }

    @Override
    public void receberChamada(String numero) {
        // Implementação para receber chamadas
    }

    @Override
    public List<String> getListaContato() {
        return listaDeContatos;
    }

    @Override
    public void reproduzirMusica(String musica) {
        // Implementação para reproduzir música
    }

    @Override
    public void pausarMusica() {
        // Implementação para pausar a reprodução de música
    }

    @Override
    public void ajustarVolume(int volume) {
        setVolume(volume);
    }

    @Override
    public List<String> getListaMusica() {
        return listaDeMusicas;
    }

    @Override
    public void abrirPagina(String pagina) {
        setPaginaAtual(pagina);
    }

    @Override
    public void voltarPagina(String paginaAnterior) {
    	setPaginaAtual(paginaAnterior);
    }

    @Override
    public void adicionarAoHistorico(String pagina) {
        // Implementação para adicionar uma página ao histórico
    }

}
