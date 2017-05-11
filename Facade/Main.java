package Facade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock newStock = new Stock();
		Finance newFinance = new Finance();
		
		OrderFacade facade = new OrderFacade(newStock, newFinance);
		Order newOrder = new Order("Pizza", "Ceilandia", "Harrison");
		
		facade.registerOrder(newOrder);
	}

}
