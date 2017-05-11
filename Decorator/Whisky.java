package Decorator;

public class Whisky extends Bebida{
	public Whisky(){
		this.nome = "Whisky";
		this.preco = 100.0;
	}
	
	@Override
	public void mostraInfo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Preco: " + this.preco);
	}
}
