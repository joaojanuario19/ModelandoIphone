package iphoneModelo.funcionalidades;

public interface AparelhoTel {
	public void ligar(String numeroTel);
	public void atender();
	private void iniciarCorreioVoz(){
		System.out.println("CORREIO DE VOZ INICIOU");
	} 
    public default void chamarCorreioVoz(){
    	iniciarCorreioVoz();
    }
	
	/*public void ligar(String numeroTel) {
		System.out.println("LIGANDO PARA CONTATO");
	}
	public void atender() {
		System.out.println("ATENDENDO CHAMADA");
	}
	private void iniciarCorreioVoz() {
		System.out.println("CORREIO DE VOZ ATENDEU A CHAMADA");
	}*/
}
