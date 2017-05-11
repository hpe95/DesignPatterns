package Composite;

public class CabecalhoNotaFiscal extends NotaFiscal {
	public CabecalhoNotaFiscal(String nome){
		this.name = nome;
	}

	@Override
	void displayInfo() {
		System.out.println("Cabecalho da nota fiscal");
	}
	
	
}
