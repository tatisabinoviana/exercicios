package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.234567888888; // convers�o expl�cita
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
}
