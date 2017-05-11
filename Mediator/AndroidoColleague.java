package Mediator;

public class AndroidoColleague extends Colleague {
	
	public AndroidoColleague(Mediator mediator){
		super(mediator);
	}
	
	void recebeMensagem(String mensagem){
		System.out.println("Android recebeu: " + mensagem);
	}
	
	void defineProtocolo(){
		System.out.println("Androido protocolo");
	}
}
