package Decorator;

public abstract class Bebida {
	protected String nome;
	protected double preco;
	
	public abstract void mostraInfo();
	public String getNome(){
		return this.nome;
	}
	
	public double getPreco(){
		return this.preco;
	}
}
