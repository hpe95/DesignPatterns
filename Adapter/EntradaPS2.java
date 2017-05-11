package Adapter;

public class EntradaPS2 {
	/*Aqui imagina que essa classe ja existia no contexto da empresa, mas surgiu uma novo tipo de entrada(usb). 
	E a empresa quer usar esse novo tipo, mas sem ter que refazer todo o codigo de conexao
	e desconexao de entrada do teclado, ou seja, sem ter q refazer toda a interface 
	de entrada antiga (ps2).*/
	abstract void conecta(Teclado t);
	abstract void desconecta(Teclado t);
}
