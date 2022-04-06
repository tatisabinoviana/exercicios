package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // pode ser usado underline para a melhor leitura e deve ser usado L para que seja lido como literal long
		
		//Tipos num�ricos reais
		float salario = 11_445.44F; // F indica literal float
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo catactere
		char status = 'A'; // aceita pois � uma correspondncia para tabela unicode, mas caso n�o, deve ser apenas um caractere
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�meros de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		/*
		 * O ideal � que todas as vari�veis criadas sejam utilizadas.
		 * Caso isso n�o ocorra, o eclipse denunciar� com uma advertencia
		 */
	}
}
