package controle.desafios;

import java.util.Scanner;

public class NumeroEntre0E10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int numero = entrada.nextInt();
		if(numero >= 0 & numero <= 10 & (numero % 2 == 0)) {
			System.out.printf("O número %d está entre 0 e 10 e é par", numero);
		} else if(numero >= 0 & numero <= 10 & (numero % 2 == 1)){
			System.out.printf("O número %d está entre 0 e 10 e é ímpar", numero);
		} else if(numero < 0 || numero > 10 & (numero % 2 == 0)) {
			System.out.printf("O número %d não está entre 0 e 10 e é par", numero);
		}  else if(numero < 0 || numero > 10 & (numero % 2 == 1)) {
			System.out.printf("O número %d não está entre 0 e 10 e é ímpar", numero);
		}
		
		entrada.close();
	}
}
