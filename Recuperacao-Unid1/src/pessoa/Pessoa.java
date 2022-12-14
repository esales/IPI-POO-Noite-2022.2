package pessoa;

public class Pessoa {
	String nome;
	int idade;
	Pessoa filiacao1;
	Pessoa filiacao2;
	
	public void imprimirFiliacoes() {
		System.out.println("Filiação 1: " + filiacao1);
		System.out.println("Filiação 2: " + filiacao2);
	}

	public void cadastrarFiliacao1(Pessoa filiacao1) {
		this.filiacao1 = filiacao1;
	}

	public void cadastrarFiliacao2(Pessoa filiacao2) {
		this.filiacao2 = filiacao2;
	}
	
}