package fundamentos.desafios;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a medi��o correspondente a BASE do tri�ngulo:");
		double base = entrada.nextDouble();
		System.out.println("Digite a medi��o correspondente a ALTURA do tri�ngulo:");
		double altura = entrada.nextDouble();
		double resultado = (base * altura) / 2;
		System.out.println("A �rea do tri�ngulo ser� de: " + resultado);
		
		entrada.close();
	}
}
