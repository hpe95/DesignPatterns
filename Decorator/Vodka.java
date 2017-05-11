package Decorator;

public class Vodka extends Bebida {
	
	public Vodka(){
		this.nome = "Vodka";
		this.preco = 50.0;
	}
	@Override
	public void mostraInfo() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Preco: " + this.getPreco());
	}
	
}
