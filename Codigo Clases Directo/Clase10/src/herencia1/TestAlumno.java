package herencia1;

import java.time.LocalDate;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno anonimo = new Alumno("12345678J",5);
		anonimo.addPrueba(new ExamenEscrito(LocalDate.now(),8,10));
		anonimo.addPrueba(new ExamenOral(LocalDate.now(),NivelSatisfaccion.Excelente));
		anonimo.addPrueba(new Boletin(true,NivelSatisfaccion.Excelente));
		
		//Evaluar a este alumno
		
		if(anonimo.evaluar()) {
			System.out.println("Aprobado!!!!!");
		}
		else {
			System.out.println("No ha superado esta evaluación.");
		}
		
		
		
	}

}
