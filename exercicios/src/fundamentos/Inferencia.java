package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		double d; // variavel foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d);
		
		// var e; // não pode, porque o java não entende qual seria o tipo da variável
		// lembrando que o tipo da variável vai ser sempre daclarado no começo e não deve ser alterado
		
		var f = 12; // inteiro
		// f = 12.01; // não pode pois double não está dentro dos inteiros
		System.out.println(f);
	}
}
