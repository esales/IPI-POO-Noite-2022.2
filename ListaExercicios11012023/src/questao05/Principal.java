package questao05;

import java.util.Scanner;
import questao04.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto[] produtos = new Produto[10];
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		String descricao = "";
		double preco = 0;
		Produto produto = null;
		
		System.out.print("Digite a descri��o do produto: ");
		descricao = scanner.next();
		
		while (!descricao.equalsIgnoreCase("fim") & i<10) {
			System.out.print("Digite o pre�o do produto: ");
			preco = scanner.nextDouble();
			
			produto = new Produto(descricao, preco);
			produtos[i] = produto;
			i++;
			
			if (i<10) {
				System.out.print("Digite a descri��o do produto: ");
				descricao = scanner.next();
			}
		}
		
		int j = 0;
		Produto p = produtos[0];
		while ((j<10) & (p != null)) {
			System.out.println("Descri��o: " + p.getDescricao());
			System.out.println("Pre�o: " + p.getPreco());
			System.out.println();
			
			j++;
			if (j<10) {
				p = produtos[j];
			}
		}
	}

}
