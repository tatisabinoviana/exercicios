package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro sal�rio:");
		String valor1 = entrada.next().replace(",", ".");		
		System.out.print("Segundo sal�rio:");
		String valor2 = entrada.next().replace(",", ".");
		System.out.print("Terceiro sal�rio:");
		String valor3 = entrada.next().replace(",", ".");
		

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = salario1 + salario2 + salario3;
		double media = soma/3;
		
		System.out.printf("A soma dos sal�rios � %.2"
				+ "f e a m�dia � %.2f.", soma, media);
		
		entrada.close();
		
		// 3 strings salarios
		// funcionar por ponto ou virgula
		// soma os trs e mostra a m�dia
	}
}
