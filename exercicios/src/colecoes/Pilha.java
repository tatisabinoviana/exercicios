package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	//LIFO - Last In First Out
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		// apresenta o ultimo elemento adicionado
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		// remove o ultimo elemento adicionado
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.remove());		
	}

}
