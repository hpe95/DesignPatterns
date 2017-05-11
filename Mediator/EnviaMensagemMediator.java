package Mediator;

import java.util.ArrayList;

public class EnviaMensagemMediator implements Mediator {
	ArrayList<Colleague> contatos;
	
	public EnviaMensagemMediator(){
		this.contatos = new ArrayList<Colleague>();
	}
	
	public void addColleague(Colleague contato){
		this.contatos.add(contato);
	}
	
	public void enviar(String mensagem, Colleague sender){
		for(Colleague contato : contatos){
			if(contato != sender){
				contato.recebeMensagem(mensagem);
				contato.defineProtocolo();
			}
		}
	}
}
