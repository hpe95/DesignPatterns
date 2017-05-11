package Builder;

public class FiatBuilder extends CarroBuilder{
	public void buildNome(){
		/*Aqui geralmente ocorre uma operacao complexa,
		que pode variar de acordo com cada "#{Fiat/Volks...}"Builder*/
		carro.nome = "Strada";
		
		
	}
	public void buildPreco(){
		/*Aqui geralmente ocorre uma operacao complexa,
		que pode variar de acordo com cada "#{Fiat/Volks...}"Builder*/
		carro.preco = 27.500;
	}
	
	public void buildAnoFabricacao(){
		/*Aqui geralmente ocorre uma operacao complexa,
		que pode variar de acordo com cada "#{Fiat/Volks...}"Builder*/
		carro.anoFabricacao = 2011;
	}
}
