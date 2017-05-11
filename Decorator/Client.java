package Decorator;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		Bebida bebida1 = new Vodka();
		//bebida1.mostraInfo();
		Thread.sleep(1000);
		bebida1 = new Acucar(new Vodka());
		//bebida1.mostraInfo();
		Thread.sleep(1000);
		Bebida teste1 = new Vodka();
		Bebida teste = new Limao(new Vodka());
		teste.mostraInfo();
		System.out.println(teste.getNome());
		bebida1 = new Acucar(teste);
		bebida1.mostraInfo();
		Thread.sleep(1000);
	}

}
