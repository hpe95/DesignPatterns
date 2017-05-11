package Builder;

public class Client {

	public static void main(String[] args) {
		//Main vai lidar apenas com o Director, toda a estrutura e algoritmos usados para construir o carro, ficarao por debaixo dos panos.
		// TODO Auto-generated method stub
		ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
		
		concessionaria.construirCarro();
		CarroProduct carro = concessionaria.getCarro();
		System.out.println("Nome do carro: " + carro.nome);
		System.out.println("Ano do carro: " + carro.anoFabricacao);
		System.out.println("Preco do carro: " + carro.preco);
	}

}
