package questao06;

import java.util.Scanner;

import questao04.Produto;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codigoEscolhido = -1;
		int quantidade = 0;
		Produto produtoEscolhido = null;
		Produto[] produtos = new Produto[5];
		
		produtos[0] = new Produto("Detergente", 2.12);
		produtos[1] = new Produto("Leite", 4.54);
		produtos[2] = new Produto("Macarrão", 6.52);
		produtos[3] = new Produto("Sabonete", 2.19);
		produtos[4] = new Produto("Feijão", 9.74);
		
		int i = 1;
		System.out.println("Lista de produtos");
		for(Produto p:produtos) {
			System.out.println(i + " - " +p.getDescricao() + " - " + p.getPreco());
			i++;
		}
		System.out.println();
		System.out.println("Produto escolhido: ");
		codigoEscolhido = scanner.nextInt();
		System.out.println("Quantidade: ");
		quantidade = scanner.nextInt();
		
		produtoEscolhido = produtos[codigoEscolhido-1];
		
		System.out.println("Produto escolhido: " + produtoEscolhido.getDescricao());
		System.out.println("Preço do produto: " + produtoEscolhido.getPreco());
		System.out.println("Valor total: " + produtoEscolhido.getPreco() * quantidade);
	}

}
