import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		int numeroC = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		numeroA = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numeroB = scanner.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		numeroC = scanner.nextInt();
		
		if (numeroA < numeroB) {
			if (numeroA < numeroC) {
				System.out.println("Menor: " + numeroA);
			} else {
				System.out.println("Menor: " + numeroC);
			}
		} else if (numeroB < numeroC) {
			System.out.println("Menor: " + numeroB);
		} else {
			System.out.println("Menor: " + numeroC);
		}
	}
}