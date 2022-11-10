package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		Animal animal01 = new Animal();
		animal01.cor = "cinza";
		animal01.especie = "gato";
		
		Animal animal02 = new Animal();
		animal02.cor = "preto";
		animal02.especie = "cachorro";
		
		animal01.correr();
		
		animal02.comer();
		
		
	}
}