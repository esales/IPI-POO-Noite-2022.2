package questao03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[10];
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		String nome = "";
		int idade = 0;
		Cliente cliente = null;
		
		System.out.print("Digite o nome: ");
		nome = scanner.next();
		
		while (!nome.equalsIgnoreCase("fim") & i<10) {
			System.out.print("Digite a idade: ");
			idade = scanner.nextInt();
			
			cliente = new Cliente(nome, idade);
			clientes[i] = cliente;
			i++;
			
			if (i<10) {
				System.out.print("Digite o nome: ");
				nome = scanner.next();
			}
		}
		
		int j = 0;
		Cliente c = clientes[0];
		while ((j<10) & (c != null)) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Idade: " + c.getIdade());
			System.out.println();
			
			j++;
			if (j<10) {
				c = clientes[j];
			}
		}
	}
}