package herencia1;

public class Boletin implements Aprobable {
	
	private  boolean entregado;
	private NivelSatisfaccion calificacion;
	
	
	public Boletin(boolean entregado, NivelSatisfaccion calificacion) {
		super();
		this.entregado = entregado;
		this.calificacion = calificacion;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public NivelSatisfaccion getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(NivelSatisfaccion calificacion) {
		this.calificacion = calificacion;
	}
	
	public boolean aprobar() {
		//Un boletín está aprobado si está entregado y la calificación es Excelente
		return entregado && calificacion == NivelSatisfaccion.Excelente;
	}
	@Override
	public String toString() {
		return "Boletin [entregado=" + entregado + ", calificacion=" + calificacion + "]";
	}
	
	
 
}
