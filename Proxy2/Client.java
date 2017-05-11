package Proxy2;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		Banco banco1 = new BancoUsuarioPadrao();
		System.out.println(banco1.getUsuariosAtivos());
		Thread.sleep(1000);
		System.out.println(banco1.getUsuariosTotal());
		Thread.sleep(1000);
		banco1 = new BancoUsuarioProxy(new BancoUsuarioPadrao(), "admin", "admin123");
		System.out.println(banco1.getUsuariosAtivos());
		Thread.sleep(1000);
		System.out.println(banco1.getUsuariosTotal());
		Thread.sleep(1000);
	}

}
