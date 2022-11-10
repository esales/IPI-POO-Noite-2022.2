package exemplo03;

public class Calculadora {
	
	public void somar(int numeroA, int numeroB) {
		int resultado = numeroA + numeroB;
		System.out.println("Soma: " + resultado);
	}
	
	public void subtrair(int numeroA, int numeroB) {
		int resultado = numeroA - numeroB;
		System.out.println("Subtração: " + resultado);
	}
	
	public void dividir(int numeroA, int numeroB) {
		int resultado = numeroA / numeroB;
		System.out.println("Divisão: " + resultado);
	}

	public void multiplicar(int numeroA, int numeroB) {
        int resultado = numeroA * numeroB;
		System.out.println("Multiplicação: " + resultado);
	}
	
}
