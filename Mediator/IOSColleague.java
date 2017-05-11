package Mediator;

public class IOSColleague extends Colleague {
	public IOSColleague(Mediator mediator){
		super(mediator);
	}
	
	void recebeMensagem(String mensagem){
		System.out.println("IOS recebeu mensgem: " + mensagem);
	}
	
	void defineProtocolo(){
		System.out.println("IOS protocolo");
	}
}
