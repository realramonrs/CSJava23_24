package herencia1;

import java.time.LocalDate;

public class ExamenOral extends Examen {

	
	private NivelSatisfaccion ns;

	public ExamenOral(LocalDate fechaRealizacion, NivelSatisfaccion ns) {
		super(fechaRealizacion);
		this.ns = ns;
	}

	
	public NivelSatisfaccion getNs() {
		return ns;
	}

	public void setNs(NivelSatisfaccion ns) {
		this.ns = ns;
	}
	
	public boolean aprobar() {
	/*	if(ns == NivelSatisfaccion.Suficiente || ns == NivelSatisfaccion.Excelente) {
			return true;
		}
		return false;*/
		
		return ns == NivelSatisfaccion.Suficiente || ns == NivelSatisfaccion.Excelente;
	}

	@Override
	public String toString() {
		return "ExamenOral [Calificacion=" + ns + ", getFechaRealizacion()=" + getFechaRealizacion() + "]";
	}

	
	
	
	
}
