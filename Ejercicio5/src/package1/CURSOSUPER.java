package package1;

public class CURSOSUPER {

	String nombreCurso;
	String nombre;
	String apellidos;

	public CURSOSUPER() {
		super();
	}

	public void darClase(char idioma) {
		if(idioma == 's') {
			System.out.println("Dando clase...");
		}
		else if (idioma == 'e')
		{
			System.out.println("Imparting class...");
		}
		
	}

	public void irExcursion(char idioma) {
		if(idioma == 's') {
			System.out.println("Curso esta en excursión");
		}
		else if (idioma == 'e')
		{
			System.out.println("Class is on a field trip");
		}
	}

	public void hacerExamen() {
		System.out.println("Haciendo examen...");
	}

}