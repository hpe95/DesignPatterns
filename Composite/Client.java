package Composite;

public class Client {

	public static void main(String[] args) {
		NotaFiscalComposite nf = new NotaFiscalComposite();
		NotaFiscal nf_item1 = new CabecalhoNotaFiscal("Cabecalho");
		NotaFiscal nf_item2 = new Taxa("Taxa");

		nf.add(nf_item1);
		nf.add(nf_item2);
		nf.displayInfo();
		
	}

}
