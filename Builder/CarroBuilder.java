	package Builder;

public abstract class CarroBuilder {
	protected CarroProduct carro;
	//Aqui define quais os passos devem ser executados para ter o carro. Enquanto na Director define como eles devem ser executados.
	public CarroBuilder(){
		this.carro = new CarroProduct();
	}
	
	abstract void buildNome();
	abstract void buildPreco();
	abstract void buildAnoFabricacao();
	
	public CarroProduct getCarro(){
		return carro;
	}
}
