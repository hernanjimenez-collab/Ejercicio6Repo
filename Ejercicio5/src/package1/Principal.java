package package1;

public class Principal {

	public static void main(String[] args) {
		char idioma = 'e';
		
		Estudiante alumno1 = new Estudiante();
		Profesor profesor1 = new Profesor();
		alumno1.darClase(idioma);
		alumno1.irExcursion(idioma);
		alumno1.hacerExamen();
		profesor1.darClase(idioma);
		profesor1.irExcursion(idioma);
		profesor1.hacerExamen();
		alumno1.Atender();
		alumno1.Estudiar();
		profesor1.corregir();
		profesor1.explicar();
		profesor1.prepararClase();
		
		System.out.println("Validación de cambios remota");
	}

}
