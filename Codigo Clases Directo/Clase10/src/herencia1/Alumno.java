package herencia1;

public class Alumno {

	private String dni;

	private Aprobable pruebas[];

	public Alumno(String dni) {
		this.dni = dni;
		pruebas = new Aprobable[5];
	}

	public Alumno(String dni, int numeroPruebas) {
		this.dni = dni;
		pruebas = new Aprobable[numeroPruebas];
	}

	// Método que permita añadir una prueba a un alumno

	public void addPrueba(Aprobable prueba) {
		// Lo intento guardar en la primera pos vacía
		for (int i = 0; i < pruebas.length; i++) {
			if (pruebas[i] == null) {
				pruebas[i] = prueba;
				break;
			}
		}

	}

	// Método que me diga si un alumno está aprobado o no -->
	// Un alumno está aprobado si todas las pruebas están aprobadas

	public boolean evaluar() {
		boolean aprobado = true;
		for (Aprobable a : pruebas) {
			if (a != null) {
				if (!a.aprobar()) {
					aprobado =  false;
				}
			}
			else {
				break;
			}
		}

		return aprobado;

	}

}
