package iphoneModelo;

public class Teste {

	public static void main(String[] args) {
		/*
		 
		  ReprodutorMusical mp3 = new ReprodutorMusical();
		  mp3.selecionarMusica();
		  mp3.tocarMusica();
  		  mp3.pausarMusica();
		*/
		
		/*
		  AparelhoTel telefone = new AparelhoTel();
		  telefone.ligar("999999999");
		  telefone.atender();
		*/
		
		/*
		 NavegadorInternet opera = new NavegadorInternet();
		 opera.adicionarNovaAba();
		 opera.atualizarPagina();
		*/
		
		Iphone iphone = new Iphone();
		iphone.abrirPagina("https://www.swi-prolog.org/");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		iphone.atender();
		iphone.ligar("21-9999999");
		iphone.chamarCorreioVoz();
		
		iphone.selecionarMusica("Wet Dreams - J cole");
		iphone.tocarMusica();
		iphone.pausarMusica();
		
		}

}
