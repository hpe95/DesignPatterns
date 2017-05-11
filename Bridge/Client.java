package Bridge;

public class Client {

	public static void main(String[] args) {
		Janela janela1 = new JanelaErro(new JanelaLinux());
		janela1.desenha();
		
		Janela janela2 = new JanelaConfirmacao(new JanelaWindows());
		janela2.desenha();
		
		Janela janela3 = new JanelaConfirmacao(new JanelaLinux());
		janela3.desenha();

	}

}
