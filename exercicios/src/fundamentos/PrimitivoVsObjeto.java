package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		//String s = "texto"; //  String é uma classe
		String s = new String("texto");
		s.toUpperCase();
		
		// Wrappers são a versão objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
		
		/*
		 * Tudo em java é objeto 
		 * menos os tipos primitivos
		 */
	}
}
