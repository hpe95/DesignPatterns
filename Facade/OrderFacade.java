package Facade;

public class OrderFacade {
	private Stock estoque;
	private Finance finacia;
	
	public OrderFacade(Stock estoque, Finance financia){
		this.estoque = estoque;
		this.finacia = financia;
	}
	
	public void registerOrder(Order newOrder){
		estoque.sendProduct(newOrder.getProduct(), newOrder.getAddressShipping());
		finacia.sendBill(newOrder.getProduct(), newOrder.getClient());
	}
}
