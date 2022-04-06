package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "bom dia X"; // não é palavra reservada nem tipo primitivo
		
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		int a = 3;  // a. não tem comportamentos e nem atributos associados
		System.out.println(a);
	}
}
