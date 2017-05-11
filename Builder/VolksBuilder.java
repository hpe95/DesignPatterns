package Builder;

public class VolksBuilder extends CarroBuilder{
	public void buildNome(){
		/*Aqui geralmente ocorre uma operacao complexa,
		que pode variar de acordo com cada "#{Fiat/Volks...}"Builder*/
		carro.nome = "Gol";
		
	}
	public void buildPreco(){
		/*Aqui geralmente ocorre uma operacao complexa,
		que pode variar de acordo com cada "#{Fiat/Volks...}"Builder*/
		carro.preco = 33.900;
	}
	
	public void buildAnoFabricacao(){
		/*Aqui geralmente ocorre uma operacao complexa,
		que pode variar de acordo com cada "#{Fiat/Volks...}"Builder*/
		carro.anoFabricacao = 2016;
	}
}
