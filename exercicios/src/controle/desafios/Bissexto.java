package controle.desafios;

import java.util.Scanner;

public class Bissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int bissexto = entrada.nextInt();
		
		if(bissexto % 4 == 0) {
			System.out.printf("O ano %d é bissexto", bissexto);
		} else {
			System.out.printf("O ano %d não é bissexto", bissexto);
		}
		
		
		entrada.close();
	}
}
