package Builder;

public class ConcessionariaDirector {
	protected CarroBuilder carroBuilder;
	
	public ConcessionariaDirector(CarroBuilder carroBuilder){
		this.carroBuilder = carroBuilder;
	}
	
	public void construirCarro(){
		carroBuilder.buildNome();
		carroBuilder.buildAnoFabricacao();
		carroBuilder.buildPreco();
	}
	
	public CarroProduct getCarro(){
		return carroBuilder.carro;
	}
}
