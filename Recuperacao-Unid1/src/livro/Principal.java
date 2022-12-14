package livro;

public class Principal {

	public static void main(String[] args) {
		Livro livro01 = new Livro();
		livro01.autor = "Teste";
		livro01.titulo = "Livro 123";
		livro01.ISBN = "12345678";
		livro01.numeroPaginas = 200;
		livro01.ehCapaDura = false;
		
		Livro livro02 = new Livro();
		livro02.autor = "Teste";
		livro02.titulo = "Livro 123";
		livro02.ISBN = "12345678";
		livro02.numeroPaginas = 200;
		livro02.ehCapaDura = false;
	}
}