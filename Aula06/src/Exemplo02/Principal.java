package Exemplo02;

public class Principal {

	public static void main(String[] args) {
		Estudante estudante1 = new Estudante();
		Estudante estudante2 = new Estudante();
		Estudante estudante3 = new Estudante();
		
		estudante1.nome = "Abc";
		estudante1.matricula = 123;
		
		estudante2.nome = "Cde";
		estudante2.matricula = 456;
		
		estudante3.nome = "Abc";
		estudante3.matricula = 123;
		
		System.out.println( estudante1.nome );
		System.out.println( estudante3.nome );
		System.out.println();
		
		estudante3.nome = "Xyz";
		
		System.out.println( estudante1.nome );
		System.out.println( estudante3.nome );
		
		

	}

}
