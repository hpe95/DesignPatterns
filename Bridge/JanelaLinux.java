package Bridge;

public class JanelaLinux extends JanelaSO {

	@Override
	public void desenhaJanela(String titulo) {
		System.out.println("Janela linux: " + titulo);
	}

	@Override
	public void desenhaBotao(String titulo) {
		System.out.println("Botao linux: " + titulo);
		
	}

}
