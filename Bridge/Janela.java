package Bridge;

public abstract class Janela {
	JanelaSO janela;
	
	public Janela(JanelaSO janela){
		this.janela = janela;
	}
	
	public void desenhaJanela(String titulo){
		this.janela.desenhaJanela(titulo);
	}
	
	public void desenhaBotao(String titulo){
		this.janela.desenhaBotao(titulo);
	}
	
	abstract void desenha();
}
