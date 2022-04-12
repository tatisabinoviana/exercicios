package controle;

import java.util.Iterator;
import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// media das notas de uma turma
		// 10 a 0 -- usuario digita
		// total
		// nova nota soma com total
		// variavel com quantidades de notas digitadas
		// -1 digitado pra sair do programa
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		while(nota != -1) {
			System.out.print("Informe a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota <=10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
				
			} else {
				System.out.println("Nota inválida!!!!!! ;D");
			}
		}
		
		// calcular media
		
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		
		
		entrada.close();
	}
}
