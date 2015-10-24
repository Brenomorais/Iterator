package br.padroes.iterator1;


//Iterador
public interface IteradorInterface {
	
	//Inicia o iterator
	void first();
	
	//Avan�a o iterator
	void next();

	//verifica se a cole��o ja terminou
	boolean isDone();
	
	//retorna o objeto atual
	Prato currentItem();
}
