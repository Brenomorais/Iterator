package br.padroes.iterator2;

import br.padroes.iterator1.AgregadoCardapio;
import br.padroes.iterator1.CardapioEsfirra;
import br.padroes.iterator1.CardapioPizza;

public class Main {
	public static void main(String[] args) {
		AgregadoCardapio cardapioEsfirra = new CardapioEsfirra();
		System.out.println("Cardapio de Esfirra:");
		IteradorInterno it = new IteradorPrint(cardapioEsfirra.criarIterator());
		it.percorrerLista();

		AgregadoCardapio cardapioPizza = new CardapioPizza();
		System.out.println("\nCardapio de Pizza:");
		it = new IteradorPrint(cardapioPizza.criarIterator());
		it.percorrerLista();
	}
}
