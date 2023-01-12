package questao02;

import questao01.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setNome("Fulano");
		pessoa01.setIdade(20);
		
		Veiculo veiculo01 = new Veiculo();
		veiculo01.setCondutor(pessoa01);
		veiculo01.setMarca("Fiat");
		veiculo01.setModelo("Uno");
		
		Pessoa pessoa02 = new Pessoa();
		pessoa02.setNome("Teste");
		pessoa02.setIdade(35);
		
		Veiculo veiculo02 = new Veiculo();
		veiculo01.setCondutor(pessoa02);
		veiculo01.setMarca("Toyota");
		veiculo01.setModelo("Corolla");
	}

}
