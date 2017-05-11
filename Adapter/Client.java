package Adapter;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		Teclado t = new Teclado("Razer");
		EntradaPS2 tipoEntrada = new EntradaAdapter();
		
		tipoEntrada.conecta(t);
		Thread.sleep(2500);
		
		tipoEntrada.desconecta(t);
	}

}
