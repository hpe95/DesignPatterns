package Composite;

public class Taxa extends NotaFiscal{
	public Taxa(String nome){
		this.name = nome;
	}

	@Override
	void displayInfo() {
		System.out.println("Campo de imposto");
	}
	
	
}
