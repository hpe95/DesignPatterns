package Observer;

import java.util.ArrayList;

public abstract class Subject {
	String nome;
	int valor;
	ArrayList<Observer> observers;
	
	public Subject(String nome, int valor){
		this.observers = new ArrayList<Observer>();
		this.nome = nome;
		this.valor = valor;
	}
	
	abstract void addObserver(Observer observer);
	
	abstract void removeObserver(Observer observer);
	
	public String getNome(){
		return this.nome;
	}
	
	public int getValor(){
		return this.valor;
	}
	
	public void setValor(int valor){
		this.valor = valor;
		for(Observer observer : observers){
			observer.notifyAcao(this);
		}
	}
}
