package Facade;

public class Stock {
	
	public void sendProduct(String product, String addressShipping){
		System.out.println("O produto: " + product + 
				"vai ser entregue no endereco: " + addressShipping);
	}
}
