package Decorator;

public class Limao extends BebidaDecorator{
	public Limao(Bebida umaBebida){
		super(umaBebida);
		nome = "Limao";
	}	
	@Override
	public void mostraInfo(){
		System.out.println("Nome: " + this.getBebida().getNome() + " + Limao");
		System.out.println("Preco: " + (this.getBebida().getPreco() + 5.0));
	}
}
