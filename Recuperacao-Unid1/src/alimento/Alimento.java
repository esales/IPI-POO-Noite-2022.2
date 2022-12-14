package alimento;

public class Alimento {
	String nome;
	String origem;
	int qtdProteina;
	int qtdCarboidrato;
	int qtdGordura;
	
	public void imprimirMacroNutrientes() {
		System.out.println("Proteínas: " + qtdProteina);
		System.out.println("Carboidratos: " + qtdCarboidrato);
		System.out.println("Gorduras: " + qtdGordura);
	}
	
	public void imprimirCalorias() {
		int calorias = (qtdCarboidrato + qtdProteina)*4 + qtdGordura*9;
		
		System.out.println(calorias + " kcal");
	}
}