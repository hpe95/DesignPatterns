package Mediator;

public abstract class Colleague {
	Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
	
	public void enviarMensagem(String mensagem){
		this.mediator.enviar(mensagem, this);
	}
	abstract void recebeMensagem(String mensagem);
	abstract void defineProtocolo();
}
