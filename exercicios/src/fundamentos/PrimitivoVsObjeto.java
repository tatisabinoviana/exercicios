package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		//String s = "texto"; //  String � uma classe
		String s = new String("texto");
		s.toUpperCase();
		
		// Wrappers s�o a vers�o objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
		
		/*
		 * Tudo em java � objeto 
		 * menos os tipos primitivos
		 */
	}
}
