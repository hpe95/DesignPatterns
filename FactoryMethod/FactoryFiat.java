package FactoryMethod;

public class FactoryFiat implements FactoryCar {
	public Car createCar(){
		return new Strada();
	}
}
