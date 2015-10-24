package br.padroes.iterator2;

import br.padroes.iterator1.IteradorInterface;
import br.padroes.iterator1.Prato;

public abstract class IteradorInterno {

	IteradorInterface it;

	public void percorrerLista() {
		for (it.first(); !it.isDone(); it.next()) {
			operacao(it.currentItem());
		}
	}

	protected abstract void operacao(Prato prato);
}
