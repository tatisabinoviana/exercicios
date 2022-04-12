package fundamentos.desafios;

import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos graus Celsius?");
		double celsius = entrada.nextDouble();
		double fahrenheit = (celsius * 1.8) + 32;
		
		System.out.printf("O grau de %.1f�C convertido para Fahrenheit ser� de %.1f�F", celsius, fahrenheit);
		
		entrada.close();
	}
}
