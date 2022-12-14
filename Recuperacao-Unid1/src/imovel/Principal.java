package imovel;

public class Principal {

	public static void main(String[] args) {
		Imovel imovel1 = new Imovel();
		imovel1.categoria = "Casa";
		imovel1.area = 200;
		imovel1.endereco = "Rua X";
		imovel1.valor = 300000;
		imovel1.financiavel = false;
		
		Imovel imovel2 = new Imovel();
		imovel2.categoria = "Casa";
		imovel2.area = 310;
		imovel2.endereco = "Rua Abc";
		imovel2.valor = 450000;
		imovel2.financiavel = true;
	}

}
