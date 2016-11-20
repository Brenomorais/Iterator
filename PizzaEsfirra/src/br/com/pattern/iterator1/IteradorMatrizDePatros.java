package br.com.pattern.iterator1;

//IteradorConcreto
public class IteradorMatrizDePatros implements IteradorInterface {
	
	protected Prato[] lista;
	protected int contador;

	public IteradorMatrizDePatros(Prato[] lista) {
		this.lista = lista;
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
		return contador == lista.length;
	}

	@Override
	public Prato currentItem() {
		if (isDone()) {
			contador = lista.length - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return lista[contador];
	}
}
