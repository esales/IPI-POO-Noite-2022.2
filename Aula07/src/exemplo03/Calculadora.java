package exemplo03;

public class Calculadora {
	
	public void somar(int numeroA, int numeroB) {
		int resultado = numeroA + numeroB;
		System.out.println("Soma: " + resultado);
	}
	
	public void subtrair(int numeroA, int numeroB) {
		int resultado = numeroA - numeroB;
		System.out.println("Subtra��o: " + resultado);
	}
	
	public void dividir(int numeroA, int numeroB) {
		int resultado = numeroA / numeroB;
		System.out.println("Divis�o: " + resultado);
	}

	public void multiplicar(int numeroA, int numeroB) {
        int resultado = numeroA * numeroB;
		System.out.println("Multiplica��o: " + resultado);
	}
	
}
