import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		int soma = 0;

		System.out.println("Digite o primeiro número:");
		numeroA = scanner.nextInt();
		
		System.out.println("Digite o segundo número:");
		numeroB = scanner.nextInt();
		
		soma = numeroA + numeroB;
		
		System.out.println("O número digitado foi: " + soma);
		
	}

}
