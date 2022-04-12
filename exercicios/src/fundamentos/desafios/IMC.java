package fundamentos.desafios;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu peso?");
		double peso = entrada.nextDouble();
		System.out.println("Qual a sua altura?");
		double altura = entrada.nextDouble();
		double imc = peso / (altura * altura);
		boolean magreza = imc < 18.5;
		boolean normal = (imc >= 18.5) && (imc < 24.9);
		boolean sobrepeso = (imc >= 24.9) && (imc < 29.9);
		boolean obesidade = (imc >= 29.9) && (imc < 39.9);
		boolean obesidadeGrave = imc > 40;
		
		String resultado = magreza ? "magreza" : " ";
		resultado = normal ? "normal" : resultado;
		resultado = sobrepeso ? "sobrepeso" : resultado;
		resultado = obesidade ? "obesidade" : resultado;
		resultado = obesidadeGrave ? "obesidade grave" : resultado;
		
		System.out.printf("Seu resultado do imc é %.2f e confere com %s", imc, resultado);
		
		entrada.close();
	}}
