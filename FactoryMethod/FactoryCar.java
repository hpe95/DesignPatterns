package FactoryMethod;
// Factory Method é usado para encapsular criacao de objetos, logo ao adicionar novos produtos para serem criados, o código que ja existe de criacao de objetos, nao sera alterado.
public interface FactoryCar {
	public Car createCar();
}
