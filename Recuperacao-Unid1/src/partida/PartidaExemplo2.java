package partida;

import selecao.Selecao;

public class PartidaExemplo2 {
	Selecao equipeCasa;
	Selecao equipeVisitante;
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
