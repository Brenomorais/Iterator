package br.com.pattern.iterator1;

import java.util.ArrayList;

//AgregadoConcreto
public class CardapioEsfirra implements AgregadoCardapio {

	protected ArrayList<Prato> pratos;

	public CardapioEsfirra() {
		pratos = new ArrayList<Prato>();
		pratos.add(new Prato("-Esfirra de Carne",1.49));
		pratos.add(new Prato("-Esfirra de Bacon",1.59 ));
		pratos.add(new Prato("-Esfirra de Queijo",1.29));
		pratos.add(new Prato("-Esfirra de Pizza", 1.89));
		pratos.add(new Prato("-Esfirra de Frango", 1.69));
	}

	@Override
	public IteradorListaDePratos criarIterator() {
		return new IteradorListaDePratos(pratos);
	}

}
