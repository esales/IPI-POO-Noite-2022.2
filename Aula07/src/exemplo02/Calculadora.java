package exemplo02;

public class Calculadora {
	
	int resultado;
	int numeroA;
	int numeroB;
	
	public Calculadora(int numeroA, int numeroB) {
		resultado = 0;
		this.numeroA = numeroA;
		this.numeroB = numeroB;
	}
	
	public void somar() {
		resultado = numeroA + numeroB;
		System.out.println("Soma: " + resultado);
	}
	
	public void subtrair() {
		resultado = numeroA - numeroB;
		System.out.println("Subtra��o: " + resultado);
	}
	
	public void dividir() {
		resultado = numeroA / numeroB;
		System.out.println("Divis�o: " + resultado);
	}

	public void multiplicar() {
		resultado = numeroA * numeroB;
		System.out.println("Multiplica��o: " + resultado);
	}
	
}
