package iphoneModelo;

import iphoneModelo.funcionalidades.AparelhoTel;
import iphoneModelo.funcionalidades.NavegadorInternet;
import iphoneModelo.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTel, NavegadorInternet {

	@Override
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ABERTA VIA IPHONE");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("IPHONE : ATUALIZANDO PAGINA ...");
		
	}

	@Override
	public void ligar(String numeroTel) {
		System.out.println("IPHONE -> LIGANDO PARA CONTATO : " + numeroTel);
		
	}

	@Override
	public void atender() {
		System.out.println("IPHONE -> ATENDENDO CHAMADA");
		
	}

	@Override
	public void tocarMusica() {
		System.out.println("IPHONE : MUSICA TOCANDO.");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("IPHONE : MUSICA PAUSADA");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("IPHONE -> MUSICA SELECIONADA : " + musica);
		
	}

}
