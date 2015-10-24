package br.padroes.iterator2;

import br.padroes.iterator1.IteradorInterface;
import br.padroes.iterator1.Prato;

public class IteradorPrint extends IteradorInterno {

	public IteradorPrint(IteradorInterface it) {
		this.it = it;
	}

	@Override
	protected void operacao(Prato prato) {
		System.out.println(prato.nome);
	}

}
