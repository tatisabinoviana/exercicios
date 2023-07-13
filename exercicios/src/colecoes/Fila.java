package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> Adicionam elementos na fila
		// A diferença é o comportamento quando a fila está cheia
		// no Add, retorna uma exceção e no caso do Offer retorna false
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Rafaela");
		fila.add("Gui");
		fila.offer("Bibi");
		
		// peek e element obtem o proximo elemento da fila sem remover
		System.out.println(fila.peek()); // se a lista for vazia, retorna null
		System.out.println(fila.element()); // se a lista for vazia, retorna exceção
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
		
		System.out.println(fila.poll()); // chama o primeiro da fila, já removendo
		System.out.println(fila.poll()); // Caso não haja elementos a serem chamado, retorna null
		System.out.println(fila.remove()); // caso a lista estiver vazia, retorna uma exceção
	}
}
