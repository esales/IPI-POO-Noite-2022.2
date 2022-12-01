
public class Principal {

	public static void main(String[] args) {
		Produto[] produtos = new Produto[4];
		
		produtos[0] = new Produto("Café", "Café Petinho", 9.5);
		produtos[1] = new Produto("Leite", "Leite Nan", 35);
		produtos[2] = new Produto("Achocolatado", "Nescau", 11);
		produtos[3] = new Produto("Pão", "Pão Plusvita", 13);
		
		Site site = new Site("Americanas", "www.americanas.com.br", produtos);
		
		site.imprimirProdutos();
	}

}
