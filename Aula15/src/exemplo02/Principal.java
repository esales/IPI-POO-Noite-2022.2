package exemplo02;

public class Principal {

	public static void main(String[] args) {
		ContaPoupanca cc = new ContaPoupanca();
		
		cc.setSaldo(1000);
		
		cc.sacar(1001);
		
		System.out.println( cc.getSaldo() );
	}

}
