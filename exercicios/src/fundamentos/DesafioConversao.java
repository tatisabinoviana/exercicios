package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro salário:");
		String valor1 = entrada.next().replace(",", ".");		
		System.out.print("Segundo salário:");
		String valor2 = entrada.next().replace(",", ".");
		System.out.print("Terceiro salário:");
		String valor3 = entrada.next().replace(",", ".");
		

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = salario1 + salario2 + salario3;
		double media = soma/3;
		
		System.out.printf("A soma dos salários é %.2"
				+ "f e a média é %.2f.", soma, media);
		
		entrada.close();
		
		// 3 strings salarios
		// funcionar por ponto ou virgula
		// soma os trs e mostra a média
	}
}
