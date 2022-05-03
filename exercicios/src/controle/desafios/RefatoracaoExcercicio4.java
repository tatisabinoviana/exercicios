package controle.desafios;

import java.util.Scanner;

public class RefatoracaoExcercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int contadorDeDivisores = 0;
		
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch(contadorDeDivisores) {
		case 0:
			System.out.println("\nO numero " + numero + " é primo.");
			break;
		default:
			System.out.println("\nO numero " + numero + " não é primo.");
		}
				
		entrada.close();
	}
}
