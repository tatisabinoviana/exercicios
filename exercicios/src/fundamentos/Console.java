package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Negasena: %d %d %d %d %d %d %n", //\n ou %n pulam linha
				1, 2, 3, 4, 5, 6);
		System.out.printf("Sal�rio: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Jo�o");
		
		Scanner entrada = new Scanner(System.in); // entrada que deseja escanear
		
		System.out.println("Qual a sua idade?");
		int idade = entrada.nextInt();
		entrada.nextLine(); //l� o "\\n" que o teclado.nextInt() deixa para tr�s.
		System.out.println("Qual o seu nome?");
		String nome = entrada.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("%s %s tem %d anos.", 
				nome, sobrenome, idade);
		entrada.close(); // � necess�rio fechar para economizar recurs/mem�ria alocada
	}
}
