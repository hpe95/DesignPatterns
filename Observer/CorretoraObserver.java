package Observer;

public class CorretoraObserver implements Observer{
	
	String nome;
	
	public CorretoraObserver(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void notifyAcao(Subject acao){
		System.out.println("Nome corretora: " + this.nome);
		System.out.println("Foi notificada que a acao: " + acao.getNome() +  " foi modificada para tal valor: " + acao.getValor());
	}
}
