package Proxy2;

public class BancoUsuarioPadrao implements Banco {
	private double  qtdUsuariosAtivos = 0;
	private double qtdUsuariosTotal = 0;
	
	@Override
	public double getUsuariosAtivos() {
		this.qtdUsuariosAtivos = Math.random() * 20;
		return this.qtdUsuariosAtivos;
	}

	@Override
	public double getUsuariosTotal() {
		this.qtdUsuariosTotal = Math.random() * 100;
		return this.qtdUsuariosTotal;
	}
	
	
}
