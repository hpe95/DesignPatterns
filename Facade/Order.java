package Facade;

public class Order {
	private String product;
	private String addressShipping;
	private String client;
	
	public Order(String product, String addressShipping, String client){
		this.product = product;
		this.addressShipping = addressShipping;
		this.client = client;
	}
	public String getProduct(){
		return product;
	}
	
	public String getAddressShipping(){
		return addressShipping;
	}
	
	public String getClient(){
		return client;
	}
}
