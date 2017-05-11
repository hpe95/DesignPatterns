package FactoryMethod;

public class FactoryVolks implements FactoryCar {
	public Car createCar(){
		return new Gol();
	}
}
