package herencia1;

import java.time.LocalDate;

public abstract class  Examen implements Aprobable {
	
	/*De todos los exámenes se sabe su fecha de realización (LocalDate). Los exámenes escritos también
	tienen una duración (en minutos) y una nota numérica entre 0 y 10. Los exámenes orales cuentan
	con un nivel de satisfacción (insuficiente, suficiente o excelente).
	Para considerar aprobado a un alumno, éste debe aprobar todos sus exámenes. Los exámenes
	escritos se aprueban con una calificación de 6 o más, siempre en un tiempo inferior a 90 minutos.
	Los exámenes orales deben ser todos, como mínimo, suficientes.*/
	
	private LocalDate fechaRealizacion;
	
	

	
	public Examen(LocalDate fechaRealizacion) {
		super();
		this.fechaRealizacion = fechaRealizacion;
		
	}

	public LocalDate getFechaRealizacion() {
		return fechaRealizacion;
	}

	public void setFechaRealizacion(LocalDate fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}

	@Override
	public String toString() {
		return "Examen [fechaRealizacion=" + fechaRealizacion + "]";
	}
	
	
	
	
	
	

}
