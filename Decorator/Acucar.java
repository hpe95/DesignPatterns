package Decorator;

public class Acucar extends BebidaDecorator {
	public Acucar(Bebida umaBebida){
		super(umaBebida);
	}
	
	@Override
	public void mostraInfo(){
		System.out.println("Nome: " + this.getBebida().getNome() + " + Acucar");
		System.out.println("Preco: " + (this.getBebida().getPreco() + 10.0));
	}
}
