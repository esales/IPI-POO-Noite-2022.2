package exemplo02;

public class Principal {

	public static void main(String[] args) {
		Selecao selecao1 = new Selecao();
		selecao1.setNome("Brasil");
		
		Selecao selecao2 = new Selecao();
		selecao2.setNome("Sérvia");
		
		Partida partida = new Partida();
		
		partida.setTimeCasa(selecao1);
		partida.setTimeVisitante(selecao2);
		partida.setGolsTimeCasa(3);
		partida.setGolsTimeVisitante(0);
		
		partida.imprimirPlacar();
		
			
	}

}
