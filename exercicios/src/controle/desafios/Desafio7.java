package controle.desafios;

import java.util.Scanner;

public class Desafio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int resultado = 0;
		int numero = 0;
		
		while(numero >= 0) {
			System.out.print("Digite um n�mero: ");
			numero = entrada.nextInt();
			resultado += numero;
			System.out.println( "A soma dos n�meros �: " + resultado );
		}
		
		entrada.close();
	}
}
