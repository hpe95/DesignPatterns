package Composite;

import java.util.ArrayList;

public class NotaFiscalComposite extends NotaFiscal {
	ArrayList<NotaFiscal> notaFiscalItems = new ArrayList<NotaFiscal>();
	@Override
	public void displayInfo(){
		for(NotaFiscal nf : notaFiscalItems){
			nf.displayInfo();
		}
	}
	
	public void add(NotaFiscal nf){
		this.notaFiscalItems.add(nf);
	}
	
	public void remove(NotaFiscal nf){
		this.notaFiscalItems.remove(nf);
	}
	
	public NotaFiscal getNotaFiscal(int index){
		NotaFiscal nf = notaFiscalItems.get(index);
		return nf;
	}
}
