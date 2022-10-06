import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numeroA = 0;
		double numeroB = 0;
		double media = 0;
		
		System.out.println("Digite a primeira nota");
		numeroA = scanner.nextDouble();
		
		System.out.println("Digite a segunda nota");
		numeroB = scanner.nextDouble();
		
		media = (numeroA+numeroB)/2;
		
		System.out.println("Média: " + media);

	}

}
