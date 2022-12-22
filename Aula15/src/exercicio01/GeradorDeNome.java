package exercicio01;

public class GeradorDeNome {
	
	public void imprimirNome(String nome, String sobrenome) {
		System.out.println(nome + " " + sobrenome);
	}
	
	public void imprimirNome(
							String nome, 
							String sobrenome1, 
							String sobrenome2) {
		
		System.out.println( nome + " " + 
							sobrenome1  + " " + 
							sobrenome2);
	}

}