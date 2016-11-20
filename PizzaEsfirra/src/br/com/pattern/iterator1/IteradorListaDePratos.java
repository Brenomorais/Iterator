package br.com.pattern.iterator1;

import java.util.ArrayList;

//IteradorConcreto
public class IteradorListaDePratos implements IteradorInterface {

	protected ArrayList<Prato> lista;
	protected int contador;

	protected IteradorListaDePratos(ArrayList<Prato> lista) {
		this.lista = lista;
		contador = 0;
	}
	
	@Override	
	public void first() {
		contador = 0;
	}
	@Override	
	public void next() {
		contador++;
	}
	@Override	
	public boolean isDone() {
		return contador == lista.size();
	}
	@Override	
	public Prato currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return lista.get(contador);
	}
}
