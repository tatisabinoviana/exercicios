package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5; // declara��o e inicializa��o
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		double d; // variavel foi declarada
		d = 123.65; // vari�vel foi inicializada
		System.out.println(d);
		
		// var e; // n�o pode, porque o java n�o entende qual seria o tipo da vari�vel
		// lembrando que o tipo da vari�vel vai ser sempre daclarado no come�o e n�o deve ser alterado
		
		var f = 12; // inteiro
		// f = 12.01; // n�o pode pois double n�o est� dentro dos inteiros
		System.out.println(f);
	}
}
