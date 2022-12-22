package exemplo02;

public class ContaPoupanca extends Conta {
	
	public void sacar(double valor, double valor2) {
		
	}
	
	@Override
	public void sacar(double valor) {
		double saldo = getSaldo();
		
		if ((saldo - valor) >= 0) {
			setSaldo(saldo - valor);
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
}