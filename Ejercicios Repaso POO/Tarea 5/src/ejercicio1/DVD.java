package ejercicio1;

public abstract class DVD extends Producto {

	// Atributos
	private int duracion;
	
	// Constructores
	public DVD() {
		super();
	}
	public DVD(String codigo, String titulo, int duracion) throws Exception {
		super(codigo, titulo);
		setDuracion(duracion);
	}
	
	// M�todos de acceso
	// Setters
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	// Getters
	public int getDuracion() {
		return this.duracion;
	}
	
	// M�todo toString()
	@Override
	public String toString() {
		return super.toString() + "DVD [duracion=" + duracion + "]";
	}
	
}
