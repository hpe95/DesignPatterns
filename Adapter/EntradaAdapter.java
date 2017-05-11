package Adapter;
/*Essa classe é responsavel de usar a interface ja existente na empresa(ps2) para de fato usar a nova interface(usb),
lembrando ##sem modificar a interface ja existente.*/
public class EntradaAdapter extends EntradaPS2 {
	EntradaUSB entradaUSB;
	
	public EntradaAdapter(){
		this.entradaUSB = new EntradaUSB();
	}
	@Override
	void conecta(Teclado t) {
		entradaUSB.conectaUSB(t, true);
	}

	@Override
	void desconecta(Teclado t) {
		entradaUSB.conectaUSB(t, false);
	}
	
}
