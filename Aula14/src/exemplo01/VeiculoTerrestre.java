package exemplo01;

public class VeiculoTerrestre extends Veiculo{
	
	private int numeroRodas;

	public VeiculoTerrestre(String marca) {
		super(marca);
	
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
}