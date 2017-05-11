package Proxy2;

public class BancoUsuarioProxy implements Banco{
	Banco banco;
	private String nome;
	private String senha;
	public BancoUsuarioProxy(Banco banco, String nome, String senha){
		this.banco = banco;
		this.nome = nome;
		this.senha = senha;
	}
	@Override
	public double getUsuariosAtivos() {
		// Aqui pode haver uma nova funcionalidade
		return this.banco.getUsuariosAtivos();
	}

	@Override
	public double getUsuariosTotal() {
		// Aqui pode haver uma nova funcionalidade
		if(isAdmin())
			return this.banco.getUsuariosAtivos();
		else
			return -1;
	}
	
	private boolean isAdmin(){
		if(this.nome.equals("admin") && this.senha.equals("admin123"))
			return true;
		else
			return false;
	}
	
}
