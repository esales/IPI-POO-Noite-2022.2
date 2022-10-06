import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] lista = new String[5];
		
		for(int i=0; i<=lista.length-1; i++) {
			System.out.println("Digite o próximo nome: ");
			lista[i] = scanner.nextLine();
		}
		
		System.out.println();
		System.out.println("Imprimindo lista... ");
		for(int i=0; i<=lista.length-1; i++) {
			System.out.println(lista[i]);
		}
	}

}
