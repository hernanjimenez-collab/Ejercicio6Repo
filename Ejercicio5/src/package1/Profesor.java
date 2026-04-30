package package1;

public class Profesor extends CURSOSUPER {
	String materia;
	
	public void prepararClase() {
		System.out.println("Preparando clase...");
	}
	public void corregir() {
		System.out.println("Corrigiendo...");
	}
	public void explicar() {
		System.out.println("Explicando...");
	}
}
