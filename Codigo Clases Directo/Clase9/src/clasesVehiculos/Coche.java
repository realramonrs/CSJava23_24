package clasesVehiculos;

import java.time.LocalDate;

public class Coche {

	//De cada coche:
	//Matrícula, Fecha de Fabricación , Marca, Modelo, Precio , Motor
	private String matricula;
	private LocalDate fechaFabricacion;
	private String marca;
	private String modelo;
	private float precio;
	private Motor motor;  //Composición.
	
	
	//Constructores de la clase Coche
	public Coche() {
	}

	

	public Coche(String matricula, LocalDate fechaFabricacion, String marca, String modelo, float precio, Motor motor) {
		
		this.matricula = matricula;
		this.fechaFabricacion = fechaFabricacion;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.motor = motor;
	}
	
public Coche(String matricula, LocalDate fechaFabricacion, String marca, String modelo, float precio, int litrosAceite,float potencia,TipoMotor tipoMotor) {
		
		this.matricula = matricula;
		this.fechaFabricacion = fechaFabricacion;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.motor = new Motor(litrosAceite,potencia,tipoMotor);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
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

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", fechaFabricacion=" + fechaFabricacion.getDayOfMonth() + "-" + fechaFabricacion.getMonthValue() + "-" +fechaFabricacion.getYear() + ", marca=" + marca
				+ ", modelo=" + modelo + ", precio=" + precio + ", Litros Aceite :" + motor.getLitrosAceite() + "]";
	}
		
	
}
