package herencia1;

import java.time.LocalDate;

public  class ExamenTipoTest extends Examen {

	private int aciertos;
	private int fallos;
	
	public ExamenTipoTest(LocalDate fechaRealizacion, int aciertos, int fallos) {
		super(fechaRealizacion);
		this.aciertos = aciertos;
		this.fallos = fallos;
	}
	public int getAciertos() {
		return aciertos;
	}
	public void setAciertos(int aciertos) {
		this.aciertos = aciertos;
	}
	public int getFallos() {
		return fallos;
	}
	public void setFallos(int fallos) {
		this.fallos = fallos;
	}
	@Override
	public String toString() {
		return "ExamenTipoTest [aciertos=" + aciertos + ", fallos=" + fallos + ", getFechaRealizacion()="
				+ getFechaRealizacion() + "]";
	}
	@Override
	public boolean aprobar() {
		// TODO Auto-generated method stub
		return aciertos > fallos;
	}
	
	
}
