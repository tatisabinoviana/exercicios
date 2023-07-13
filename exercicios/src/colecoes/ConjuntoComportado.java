package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
//		Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Zelda");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados ) {
			System.out.println(candidato);
		}
		
		Set<Integer> num = new HashSet<>();
		num.add(1);
		num.add(2);
		num.add(120);
		num.add(6);
		
		// num.get(1); Não é possível acessar pelo índice
		
		for(int n: num) {
			System.out.println(n);	
		}
	}
}
