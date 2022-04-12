package fundamentos.desafios;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a medição correspondente a BASE do triângulo:");
		double base = entrada.nextDouble();
		System.out.println("Digite a medição correspondente a ALTURA do triângulo:");
		double altura = entrada.nextDouble();
		double resultado = (base * altura) / 2;
		System.out.println("A área do triângulo será de: " + resultado);
		
		entrada.close();
	}
}
