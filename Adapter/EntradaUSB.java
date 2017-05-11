package Adapter;

public class EntradaUSB {
	public void conectaUSB(Teclado t, boolean b){
		if(b == true){
			System.out.println("Teclado com USB conectado");
			System.out.println(t.getMarcaTeclado());
		}
		if(b == false){
			System.out.println("Teclado com USB desconectado");
			
		}
	}
}
