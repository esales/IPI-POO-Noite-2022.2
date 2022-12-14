package partida;

public class Partida {
	String equipeCasa;
	String equipeVisitante;
	int golsEquipeCasa;
	int golsEquipeVisitante;
	
	public void imprimirPlacar() {
		System.out.println(equipeCasa + " " + golsEquipeCasa + " x " + golsEquipeVisitante + " " + equipeVisitante);
	}
	
	public void adicionarGolEquipeCasa() {
		golsEquipeCasa++;
	}
	
	public void adicionarGolEquipeVisitante() {
		golsEquipeVisitante++;
	}
}
