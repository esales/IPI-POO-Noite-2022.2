package exercicio01;

public class Principal {

	public static void main(String[] args) {
		GeradorDeNome gerador = new GeradorDeNome();
		
		gerador.imprimirNome("Abcd", "Efgh");
		
		gerador.imprimirNome("Abcd", "Efgh", "Ijkl");
	}

}
