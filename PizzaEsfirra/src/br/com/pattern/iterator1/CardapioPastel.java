package br.com.pattern.iterator1;

import java.util.ArrayList;

//AgregadoConcreto
public class CardapioPastel implements AgregadoCardapio {

   protected ArrayList<Prato> pratos;
	
	public CardapioPastel() {
		pratos = new ArrayList<Prato>();
		pratos.add(new Prato("-Pastel de Carne",1.99));
		pratos.add(new Prato("-Pastel de Bacon",1.89 ));
		pratos.add(new Prato("-Pastel de Queijo",1.49));
		pratos.add(new Prato("-Pastel de Pizza", 1.99));
		pratos.add(new Prato("-Pastel de Frango", 1.79));
	}	
		
	@Override
	public IteradorInterface criarIterator() {		
		return new IteradorListaDePratos(pratos);
	}

}
