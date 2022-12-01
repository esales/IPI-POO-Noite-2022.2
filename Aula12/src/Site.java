

public class Site {
	private String nome;
	private String url;
	private Produto[] produtos;
	
	public Site(String nome, String url, Produto[] produtos) {
		this.nome = nome;
		this.url = url;
		this.produtos = produtos;
	}
	
	public void imprimirProdutos() {
		for(int i=0; i<=produtos.length-1; i++) {
			System.out.println( produtos[i].getDescricao() );
		}
	}
}