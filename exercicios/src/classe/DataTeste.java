package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data(14, 8, 1988);
//		data1.dia = 14;
//		data1.mes = 8;
//		data1.ano = 1988;
		
		var data2 = new Data();
//		data2.dia = 03;
//		data2.mes = 5;
//		data2.ano = 2020;
		
		String dataFormatada1 = data1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(data2.obterDataFormatada());

		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}
}
