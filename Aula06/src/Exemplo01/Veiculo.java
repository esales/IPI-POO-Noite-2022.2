package Exemplo01;

public class Veiculo {
	String cor;
	int velocidade;
	int numeroRodas;

	public void acelerar(int incremento) {
		velocidade += incremento;
	}
	
	public void frear(int decremento) {
		velocidade -= decremento;
	}
}