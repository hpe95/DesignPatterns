package Mediator;

public class Client {

	public static void main(String[] args) {
		Mediator mediador = new EnviaMensagemMediator();
		AndroidoColleague android = new AndroidoColleague(mediador);
		IOSColleague ios = new IOSColleague(mediador);
		mediador.addColleague(android);
		mediador.addColleague(ios);
		
		android.enviarMensagem("OI");
		ios.enviarMensagem("EAEW");
	}

}
