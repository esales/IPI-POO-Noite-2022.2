package Exemplo01;
public class Principal {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();
		Veiculo veiculo2 = new Veiculo();
		
		veiculo.cor = "Azul";
		veiculo.numeroRodas = 4;
		veiculo.velocidade = 90;
		
		veiculo2.cor = "Branco";
		veiculo2.numeroRodas = 2;
		veiculo2.velocidade = 70;
		
		System.out.println( veiculo.cor );
		System.out.println( veiculo.numeroRodas );
		System.out.println( veiculo.velocidade );
		System.out.println();
		
		System.out.println( veiculo2.cor );
		System.out.println( veiculo2.numeroRodas );
		System.out.println( veiculo2.velocidade );
		System.out.println();
		
		veiculo.acelerar(30);
		System.out.println( veiculo.velocidade );
		System.out.println( veiculo2.velocidade );
		
		
	}
}