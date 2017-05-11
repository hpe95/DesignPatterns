package Composite;

public abstract class NotaFiscal {
	String name;
	
	abstract void displayInfo();
	public String getFileName(){
		return this.name;
	}

}
