import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int altura = 0;
		int largura = 0;
		int comprimento = 0;
		int volume = 0;
		
		System.out.println("Digite a altura: ");
		altura = scanner.nextInt();
		
		System.out.println("Digite a largura: ");
		largura = scanner.nextInt();
		
		System.out.println("Digite o comprimento: ");
		comprimento = scanner.nextInt();
		
		volume = altura * largura * comprimento;
		
		System.out.println("O volume é " + volume);
	}
}