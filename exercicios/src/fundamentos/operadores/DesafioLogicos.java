package fundamentos.operadores;

public class DesafioLogicos {
	 public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		 
		 boolean trabalho1 = false;
		 boolean trabalho2 = false;
		 
		 // 1 trabalho der certo, compra TV de 32"
		 // 2 trabalhos derem certo, compra TV de 50"
		 // nenhum trabalho deu certo, não toma sorvete e fica saudável
		 
		 boolean comprouTv50 = trabalho1 && trabalho2;
		 boolean comprouTv32 = trabalho1 ^ trabalho2;
		 boolean comprouSorvete = trabalho1 || trabalho2;
		 boolean maisSaudavel = !comprouSorvete; //Operador unário
		 
		 System.out.println("Comprou Tv 50\"? " + comprouTv50); // \" é como dizer ao java que precisa ser usado o " como valor literal
		 System.out.println("Comprou Tv 32\"? " + comprouTv32);
		 System.out.println("Comprou sorvete\"? " + comprouSorvete); 
		 System.out.println("Mais saudável? " + maisSaudavel);
		 
	}
}
