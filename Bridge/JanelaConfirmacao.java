package Bridge;

public class JanelaConfirmacao extends Janela {
	public JanelaConfirmacao(JanelaSO janela){
		super(janela);
	}

	@Override
	void desenha() {
		desenhaJanela("Janela de confirmacao");
		desenhaBotao("Sim");
		desenhaBotao("Nao");
		desenhaBotao("Cancelar");
		
	}
	
	
}
