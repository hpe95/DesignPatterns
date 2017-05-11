package Strategy;

public class FretePadraoConcreteStrategy implements CalculoFreteStrategy{

	@Override
	public double calculaFrete(ProductContext produto) {
		System.out.println("Frete Padrao, Valor: " + (produto.getValor() * 0.85));
		System.out.println("Valor Total: " + ((produto.getValor() * 0.85) + produto.getValor()));
		return produto.getValor() * 0.85;
		
	}
	
}
