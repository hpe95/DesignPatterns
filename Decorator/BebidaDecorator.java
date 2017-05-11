package Decorator;

public abstract class BebidaDecorator extends Bebida {
	Bebida bebida;
	
	public BebidaDecorator(Bebida umaBebida){
		this.bebida = umaBebida;
		System.out.println("DECORATOR: " + umaBebida.getNome());
	}
	
	public abstract void mostraInfo();
	
	public Bebida getBebida(){
		return this.bebida;
	}
	
}
