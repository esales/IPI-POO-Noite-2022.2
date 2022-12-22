package exemplo02;

public class Conta {
	private double saldo;
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}