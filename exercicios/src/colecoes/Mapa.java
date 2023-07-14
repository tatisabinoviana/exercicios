package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Raffaela");
		usuarios.put(4, "Renatha");
		usuarios.put(2, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Reb"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "tati")); // caso não haja correspondência, retorna false
		
		for(int chave: usuarios.keySet()) {
			System.err.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.err.println(valor);
		}
		
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.print(usuario.getKey() + " ===> ");
			System.out.println(usuario.getValue());
		}
	}
}
