package array;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas você quer informar? ");
		
		int quatidadeNotas = entrada.nextInt();
		System.out.println(quatidadeNotas);
		
		double[] notas = new double[quatidadeNotas];
		System.out.println(Arrays.toString(notas));
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i+1) + ": ");
			notas[i] = entrada.nextDouble();
			
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		double media = total / notas.length;
		System.out.println("A média é: " + media + "!");
		
		entrada.close();
	}
}
