package controle.desafios;

import java.util.Scanner;

public class NumeroEntre0E10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o n�mero: ");
		int numero = entrada.nextInt();
		if(numero >= 0 & numero <= 10 & (numero % 2 == 0)) {
			System.out.printf("O n�mero %d est� entre 0 e 10 e � par", numero);
		} else if(numero >= 0 & numero <= 10 & (numero % 2 == 1)){
			System.out.printf("O n�mero %d est� entre 0 e 10 e � �mpar", numero);
		} else if(numero < 0 || numero > 10 & (numero % 2 == 0)) {
			System.out.printf("O n�mero %d n�o est� entre 0 e 10 e � par", numero);
		}  else if(numero < 0 || numero > 10 & (numero % 2 == 1)) {
			System.out.printf("O n�mero %d n�o est� entre 0 e 10 e � �mpar", numero);
		}
		
		entrada.close();
	}
}
