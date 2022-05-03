package controle.desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafio6Adivinhacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();
		
		System.out.print("Adivinhe! Qual o número? ");
		double numeroDigitado = entrada.nextDouble();
		int numeroGerado = gerador.nextInt(101);
		
		while (numeroGerado != numeroDigitado) {
			System.out.println("Voc errou... Por favor, tente novamente!");
			System.out.print("Adivinhe! Qual o número? ");
			numeroDigitado = entrada.nextDouble();
		}
		
		System.out.println("Parabéns! Você adivinhou o número!");
		
		
		entrada.close();
	}
}
