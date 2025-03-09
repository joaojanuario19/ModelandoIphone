package iphoneModelo.funcionalidades;

public interface NavegadorInternet {
	private void exibirPagina(String url) {
		 System.out.println("Exibindo página: " + url);
	}
	public default void abrirPagina(String url) {
		exibirPagina(url);
	}
	
	public void adicionarNovaAba();
	public void atualizarPagina();
	
	
	/*private void exibirPagina() {
		System.out.println("EXIBINDO PAGINA");
	}
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ABERTA");
	}
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA ...");
	}*/
	

}
