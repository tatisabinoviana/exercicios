package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		// Deve ser utilizado equal para comparar strings
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); // o next retira os espaços em branco e o nextLine permanece com os espaços
		System.out.println("2" == s2.trim()); // trim tira os espaços digitados
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
