package Strategy;

public class Client {

	public static void main(String[] args) {
		/*O Client nao trabalha diretamente com as estrategias, 
		ele instancia um pedido indicando a estrategia que quer usar, 
		e atraves do metodo do **pedido** ele invoca o calculo 
		que a estrategia eh responsavel.*/
		ProductContext p1 = new ProductContext("Pizza", 30, new FretePadraoConcreteStrategy());
		p1.calculaFrete();
		p1.frete = new FreteExpressoConcreteStrategy();
		p1.calculaFrete();
	}

}
