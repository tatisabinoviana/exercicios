package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		double media = 3.6;
		String resultadoParcial = media >= 5.0 ?
				"em recuperacao" : "reprovado";
		String resultadoFinal = media >= 7.0 ?
				"aprovado" : resultadoParcial; // atribui��o condicional
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		System.out.printf("Tem desconto? %s", resultado);
	}
}
