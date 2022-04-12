package fundamentos.desafios;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Coeficiente a");
		double coeficienteA = entrada.nextDouble();
		System.out.println("Digite o Coeficiente b");
		double coeficienteB = entrada.nextDouble();
		System.out.println("Digite o Coeficiente c");
		double coeficienteC = entrada.nextDouble();
		
		double delta = (Math.pow(coeficienteB, 2)) - (4 * coeficienteA * coeficienteC);
				
		double xPositivo = ((- coeficienteB) + Math.pow(delta, 0.5)) / (2 * coeficienteA);
		double xNegativo = ((- coeficienteB) - Math.pow(delta, 0.5)) / (2 * coeficienteA);
		
		System.out.printf("O valor de x é x=%.2f e x=%.2f", xPositivo, xNegativo);
		
		entrada.close();
	}
}
