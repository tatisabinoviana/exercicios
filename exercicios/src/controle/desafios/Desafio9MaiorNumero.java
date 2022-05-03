package controle.desafios;

import java.util.Scanner;

public class Desafio9MaiorNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double numero = 0.0;
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + ". insira um valor: ");
			double digitado = entrada.nextDouble();
			if(numero < digitado) {
				numero = digitado;
			}
		}
		System.out.println("O maior número digitado foi: " + numero);
		
		entrada.close();
	}
}
