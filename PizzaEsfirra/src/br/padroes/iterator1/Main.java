package br.padroes.iterator1;

public class Main {
	public static void main(String[] args) {
		
				
		System.out.println("=========================================");
		System.out.println("|         Lanchonete Iteradora          |"); 
		System.out.println("|            Pizza & Esfirra            |");
		System.out.println("=========================================\n");
		
		//Cardapio de Pizza
		AgregadoCardapio cardapioPizza = new CardapioPizza();
		System.out.println("+ Cardápio de Pizza:\n");
		for (IteradorInterface it = cardapioPizza.criarIterator(); !it
				.isDone(); it.next()) {
			System.out.println(it.currentItem().nome+" - R$ "+it.currentItem().preco);
		}
		
		//Cardapio de Esfirra
		AgregadoCardapio cardapioEsfirra = new CardapioEsfirra();		
		System.out.println("\n+ Cardapio de Esfirra:\n");		
		for (IteradorInterface it = cardapioEsfirra.criarIterator(); !it
				.isDone(); it.next()) {
			System.out.println(it.currentItem().nome+" - R$ "+it.currentItem().preco);
		}
		
		//Cardapio de Pastel
	AgregadoCardapio cardapioPastel = new CardapioPastel();
	System.out.println("\n+ Cardapio de Pastel:\n");
	for (IteradorInterface it = cardapioPastel.criarIterator(); !it
			.isDone(); it.next()) {
			System.out.println(it.currentItem().nome+" - R$ "+it.currentItem().preco);
	}
		
	}
}
