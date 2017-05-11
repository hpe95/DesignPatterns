package Strategy;

public class ProductContext {
	double valor;
	String nome;
	CalculoFreteStrategy frete;
	public ProductContext(String nome, double valor, CalculoFreteStrategy frete){
		this.nome = nome;
		this.valor = valor;
		this.frete = frete;
	}
	
	public double getValor(){
		return this.valor;
	}
	
	public void calculaFrete(){
		this.frete.calculaFrete(this);
	}
}
