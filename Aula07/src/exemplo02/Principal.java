package exemplo02;

public class Principal {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(10, 2);
		
		calculadora.somar();
		
		calculadora.subtrair();
		
		calculadora.dividir();
		
		calculadora.multiplicar();
	}

}
