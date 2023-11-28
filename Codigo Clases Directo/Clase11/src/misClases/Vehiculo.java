package misClases;

public abstract class Vehiculo implements Acelerable,Comparable<Vehiculo> {

	private String codigo;
	private float velocidad;
	
	public Vehiculo(String codigo, float velocidad) {
		super();
		this.codigo = codigo;
		this.velocidad = velocidad;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}
	@Override
	public String toString() {
		return "[codigo=" + codigo + ", velocidad=" + velocidad + "]";
	}
	
	//Todos los vehiculos tienen la capacidad de aumentar su velocidad
	//pero cada vehiculo lo hará de diferente manera
	
	//Definir criterio de ordenación para Vehiculos
	
	@Override
	public int compareTo(Vehiculo v) {
	//	return this.codigo.compareTo(v.getCodigo());
		//Por Velocidad
		Float veloc = Float.valueOf(velocidad);
		return veloc.compareTo(v.getVelocidad());
	}
	
}
