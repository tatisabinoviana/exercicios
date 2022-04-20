package controle.desafios;

import java.util.Scanner;

public class NotaDoAluno {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double primeiraNota = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double segundaNota = entrada.nextDouble();
		
		double media = (primeiraNota + segundaNota) / 2;
		System.out.println("Média: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado!");
		} else if(media < 7 & media > 4) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
		entrada.close();
	}
}
