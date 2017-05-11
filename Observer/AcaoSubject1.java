package Observer;

public class AcaoSubject1 extends Subject {
	public AcaoSubject1(String nome, int valor){
		super(nome,valor);
	}
	
	void addObserver(Observer observer){
		this.observers.add(observer);	
	}
	
	void removeObserver(Observer observer){
		this.observers.remove(observer);	
	}
	
	
}
