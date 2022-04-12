package fundamentos.desafios;

import java.util.Scanner;

public class FahrenheitCelsius {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o grau em Fahrenheit?");
		double fahrenheit = entrada.nextDouble();
		double celsius = (fahrenheit - 32) / 1.8;
		
		System.out.printf("O grau de %.1f�F convertido para Celsius ser� de %.1f�C", fahrenheit, celsius);
		
		entrada.close();
	}
}
