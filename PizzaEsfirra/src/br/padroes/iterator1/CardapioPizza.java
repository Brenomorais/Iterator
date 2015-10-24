package br.padroes.iterator1;

//AgregadoConcreto
public class CardapioPizza implements AgregadoCardapio {

	protected Prato[] pratos;

	public CardapioPizza() {
		pratos = new Prato[4];
		pratos[0] = new Prato("-Pizza Frango", 44.99);
		pratos[1] = new Prato("-Pizza Calabresa",45.99);
		pratos[2] = new Prato("-Pizza 4 Queijo", 42.59);
		pratos[3] = new Prato("-Pizza Tradicional", 39.90);
	}

	@Override
	public IteradorInterface criarIterator() {
		return new IteradorMatrizDePatros(pratos);
	}
}
