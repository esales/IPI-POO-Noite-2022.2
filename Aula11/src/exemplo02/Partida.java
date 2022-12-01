package exemplo02;

public class Partida {
	private Selecao timeCasa;
	private Selecao timeVisitante;
	private int golsTimeCasa;
	private int golsTimeVisitante;
	
	public void imprimirPlacar() {
		System.out.print( timeCasa.getNome() + " " + golsTimeCasa);
		System.out.print(" x ");
		System.out.print(golsTimeVisitante + " " + timeVisitante.getNome());
	}

	public Selecao getTimeCasa() {
		return timeCasa;
	}
	public void setTimeCasa(Selecao timeCasa) {
		this.timeCasa = timeCasa;
	}
	public Selecao getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(Selecao timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public int getGolsTimeCasa() {
		return golsTimeCasa;
	}
	public void setGolsTimeCasa(int golsTimeCasa) {
		this.golsTimeCasa = golsTimeCasa;
	}
	public int getGolsTimeVisitante() {
		return golsTimeVisitante;
	}
	public void setGolsTimeVisitante(int golsTimeVisitante) {
		this.golsTimeVisitante = golsTimeVisitante;
	}
}