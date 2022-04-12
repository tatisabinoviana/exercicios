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
		
		String s2 = entrada.next(); // o next retira os espa�os em branco e o nextLine permanece com os espa�os
		System.out.println("2" == s2.trim()); // trim tira os espa�os digitados
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
