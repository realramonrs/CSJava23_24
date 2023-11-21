package herencia1;

import java.time.LocalDate;

public class ExamenEscrito extends Examen {
	
	private int nota;
	private int tiempoEjecucion;
	
	public ExamenEscrito(LocalDate fechaRealizacion,int nota,int tiempoEjecucion) {
		super(fechaRealizacion);
		this.nota = nota;
		this.tiempoEjecucion = tiempoEjecucion;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getTiempoEjecucion() {
		return tiempoEjecucion;
	}

	public void setTiempoEjecucion(int tiempoEjecucion) {
		this.tiempoEjecucion = tiempoEjecucion;
	}
	
	

	@Override
	public String toString() {
		return "ExamenEscrito [nota=" + nota + ", tiempoEjecucion=" + tiempoEjecucion + ", fechaRealizacion="
				+ getFechaRealizacion() + "]";
	}

	@Override
	public boolean aprobar() {
		// TODO Auto-generated method stub
		return nota >=6 && tiempoEjecucion <= 90;
	}

/*	@Override
	public String toString() {
		return "ExamenEscrito: Fecha Realizacion:" + super.fechaRealizacion + " [nota=" + nota + ", tiempoEjecucion=" + tiempoEjecucion + "]";
	}*/
	
	

}
