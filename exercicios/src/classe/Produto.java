package classe;

public class Produto {
	
	// nome da loja: 25% de desconto
	// desconto para todos os produtos
	// alguns dias muda o desconto, mas o normal é ter 25%
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() {
		
	}
	Produto(String nomeInicial, double precoInicial, 
			double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
		
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto );
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
