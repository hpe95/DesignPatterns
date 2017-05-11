package Observer;

public class Client {

	public static void main(String[] args) {
		Subject acao1 = new AcaoSubject1("Acao Teste 1", 1200);
		Subject acao2 = new AcaoSubject2("Acao Teste 2", 3300);
		
		Observer observer1 = new CorretoraObserver("Corretora 1");
		acao1.addObserver(observer1);
		acao2.addObserver(observer1);
		
		acao1.setValor(5000);
		acao2.setValor(13000);
		acao1.setValor(1);
	}

}
