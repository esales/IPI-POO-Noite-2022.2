package questao02;

import questao01.Pessoa;

public class Veiculo {
	private String modelo;
	private String marca;
	private Pessoa condutor;

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Pessoa getCondutor() {
		return condutor;
	}
	public void setCondutor(Pessoa condutor) {
		this.condutor = condutor;
	}
}