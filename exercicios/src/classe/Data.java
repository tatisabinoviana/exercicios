package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data() {
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada(){
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	void imprimirDataFormatada(){
//		formato = "...";
		System.out.println(obterDataFormatada());
	}
}
