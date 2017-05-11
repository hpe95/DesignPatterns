package Observer;

public class AcaoSubject2 extends Subject {
	public AcaoSubject2(String nome, int valor){
		super(nome,valor);
	}
	
	void addObserver(Observer observer){
		this.observers.add(observer);	
	}
	
	void removeObserver(Observer observer){
		this.observers.remove(observer);	
	}
}
