package exemplo01;
public class Principal {

	public static void main(String[] args) {
		VeiculoTerrestre veiculoTerrestre = new VeiculoTerrestre("Honda");
		
		System.out.println( veiculoTerrestre.getMarca() );
		
		veiculoTerrestre.setMarca("Yamaha");
		System.out.println( veiculoTerrestre.getMarca() );
		
		
		Veiculo veiculo = new Veiculo("Suzuki");
		System.out.println( veiculo.getMarca() );

		System.out.println(veiculoTerrestre instanceof Veiculo);
		System.out.println(veiculoTerrestre instanceof VeiculoTerrestre);
		
		
		Veiculo veiculo1 = new Veiculo("");
		
		VeiculoTerrestre veiculo2 = new VeiculoTerrestre("");
		
		Veiculo veiculo3 = new VeiculoTerrestre("");
		
		//VeiculoTerrestre veiculo4 = new Veiculo("");
		
		System.out.println(veiculo3 instanceof Veiculo);
		System.out.println(veiculo3 instanceof VeiculoTerrestre);
	}
}