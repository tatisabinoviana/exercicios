package fundamentos.desafios;

import java.util.Scanner;

public class Potenciacao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		double numero = entrada.nextDouble();
		double quadrado = Math.pow(numero, 2);
		double cubo = Math.pow(numero, 3);
		System.out.printf("O quadrado ser� %.2f e o cubo ser� %.2f.", quadrado, cubo);
		
		entrada.close();
	}
}
