package jogador;

public class Principal {

	public static void main(String[] args) {
		Jogador jogador01 = new Jogador();
		jogador01.nome = "Teste 01";
		jogador01.clube = "Clube 01";
		jogador01.idade = 25;
		jogador01.numeroGols = 12;
		jogador01.posicao = "Atacante";
		jogador01.salario = 10000;

		Jogador jogador02 = new Jogador();
		jogador02.nome = "Teste 02";
		jogador02.clube = "Clube 02";
		jogador02.idade = 29;
		jogador02.numeroGols = 2;
		jogador02.posicao = "Zagueiro";
		jogador02.salario = 7500;
	
	}
}
