package ejercicio1;



public class Coche {

	//De cada coche:
	//Matrícula, Fecha de Fabricación , Marca, Modelo, Precio , Motor
	private String matricula;
	private int anyoFabricacion;
	private String marca;
	private String modelo;
	private float precio;
	private TipoMotor motor;  //Composición.
	
	
	//Constructores de la clase Coche
	public Coche() {
	}
	public Coche(String matricula, int anyoFabricacion, String marca, String modelo, float precio, TipoMotor motor) {
		
		this.matricula = matricula;
		this.anyoFabricacion = anyoFabricacion;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.motor = motor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getanyoFabricacion() {
		return anyoFabricacion;
	}

	public void setanyoFabricacion(int anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public TipoMotor getMotor() {
		return motor;
	}

	public void setMotor(TipoMotor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Matricula=" + matricula + ", anyoFabricacion=" + anyoFabricacion  + ", marca=" + marca
				+ ", modelo=" + modelo + ", precio=" + precio + " Tipo Motor: " + this.motor + "]";
	}
		
	
}
