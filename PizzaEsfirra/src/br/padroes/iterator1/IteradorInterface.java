package br.padroes.iterator1;


//Iterador
public interface IteradorInterface {
	
	//Inicia o iterator
	void first();
	
	//Avança o iterator
	void next();

	//verifica se a coleção ja terminou
	boolean isDone();
	
	//retorna o objeto atual
	Prato currentItem();
}
