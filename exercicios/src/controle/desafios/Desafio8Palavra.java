package controle.desafios;

import java.util.Scanner;

public class Desafio8Palavra {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual seria a palavra? ");
		String palavra = entrada.nextLine();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		entrada.close();
	}
}
