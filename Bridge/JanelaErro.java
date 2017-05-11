package Bridge;

public class JanelaErro extends Janela {

	public JanelaErro(JanelaSO janela) {
		super(janela);
		// TODO Auto-generated constructor stub
	}

	@Override
	void desenha() {
		desenhaJanela("Janela de ERRO");
		desenhaBotao("OK");
		desenhaBotao("CANCELA");
	}
	
}
