package Strategy;

public class FreteExpressoConcreteStrategy implements CalculoFreteStrategy {

	@Override
	public double calculaFrete(ProductContext produto) {
		System.out.println("Frete Expresso, Valor: " + (produto.getValor() * 0.70));
		System.out.println("Valor Total: " + ((produto.getValor() * 0.70) + produto.getValor()));
		return produto.getValor() * 0.70;
	}
	
}
