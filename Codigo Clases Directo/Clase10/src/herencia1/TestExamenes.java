package herencia1;

import java.time.LocalDate;
import java.time.Month;

public class TestExamenes {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExamenEscrito programacion = new ExamenEscrito(LocalDate.of(2024, Month.FEBRUARY, 6),4, 120);
		
		System.out.println("Info del examen de programación: ");
		System.out.println(programacion);
		
		ExamenOral ingles = new ExamenOral(LocalDate.of(2023, 11, 10),NivelSatisfaccion.Excelente);
		
		System.out.println("Info del examen de Inglés");
		System.out.println(ingles);
		
	//	Examen indefinido = new Examen(LocalDate.of(2023, Month.APRIL, 23));
		
		Examen examen,examen2,examen3;
		
		examen = new ExamenEscrito(LocalDate.of(2023, Month.AUGUST, 20),8,80);
		examen2 = new ExamenOral(LocalDate.of(2024, Month.DECEMBER,5), NivelSatisfaccion.Insuficiente);
		examen3 = new ExamenTipoTest(LocalDate.of(2023, Month.AUGUST, 10),30,20);
		
		
		
		Examen examenes[] = new Examen[10];
		Boletin boletines[] = new Boletin[10];
		
		examenes[0] = examen;
		examenes[1] = examen2;
		examenes[2] = examen3;
		examenes[3] = new ExamenOral(LocalDate.now(),NivelSatisfaccion.Excelente);
		
		int puntuacion = 9;
		
		//Clases anónima
	/*	examenes[4] = new ExamenOral(LocalDate.now(), NivelSatisfaccion.Suficiente) {
		
			 int puntos = puntuacion;
			 
			 @Override
			 public String toString() {
				 return super.toString() + "Puntuacion: " + puntuacion;
			 }
			
		};*/
		
		System.out.println();
		//Desacoplamiento entre código cliente librería.
		System.out.println("Examenes almacenados en la matriz:");
		for(Examen ex : examenes) {
			if(ex!=null) {
				System.out.println(ex.toString());
			}
			else {
				break;
			}
		}
		
		//Evaluación de los exámenes
		System.out.println();
		System.out.println("Examenes aprobados: ");
		for(Examen ex : examenes) {
			if(ex!=null) {
				if(ex.aprobar()) {
					System.out.println(ex);
				}
			}
		}
		
		
		//******** InterFaz Aprobable ************//
		Aprobable pruebas[] = new Aprobable[10];
		
		pruebas[0] = examen;
		pruebas[1] = examen2;
		pruebas[2] = examen3;
		pruebas[3] = new Boletin(true,NivelSatisfaccion.Excelente);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
