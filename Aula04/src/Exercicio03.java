import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[3];
		double maiorNota = -1;
		double menorNota = 11;
		double totalNotas = 0;
		double media = 0;
		double nota = 0;
		
		for (int i=0; i<=notas.length-1; i++) {
			System.out.println("Digite a próxima nota: ");
			nota = scanner.nextDouble();
			
			if(nota > maiorNota)
				maiorNota = nota;
			
			if(nota < menorNota)
				menorNota = nota;
			
			totalNotas = totalNotas + nota;
			
			notas[i] = nota;
		}
		
		media = totalNotas/notas.length;
		
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Menor nota: " + menorNota);
		System.out.println("Média: " + media);
		
		System.out.println("Notas: ");
		
		for (int i=0; i<=notas.length-1; i++) {
			System.out.println(notas[i]);
		}
	}
}