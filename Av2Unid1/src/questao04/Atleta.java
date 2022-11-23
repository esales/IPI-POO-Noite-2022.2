package questao04;

public class Atleta {
	String nome;
	String esporte;
	int qtdMedalhas;
	
	public void incrementarMedalhas() {
		qtdMedalhas++;
	}
	
	public void decrementarMedalhas() {
		if(qtdMedalhas > 0) {
			qtdMedalhas--;
		}
	}
}