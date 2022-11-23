package questao02;

public class ConversorHoras {
	int horas;
	
	public ConversorHoras(int horas) {
		this.horas = horas;
	}
	
	public void imprimirEmMinutos() {
		int minutos = horas * 60;
		System.out.println(minutos + " minutos.");
	}
	
	public void imprimirEmSegundos() {
		int segundos = horas * 3600;
		System.out.println(segundos + "segundos.");
	}
}