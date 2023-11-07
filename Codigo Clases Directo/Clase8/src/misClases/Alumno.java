package misClases;

public class Alumno {
	
	//Atributos : Nombre , Edad , DNI
	private String nombre;
	private int edad;
	private String dni;
	
	
	//Constructores.
	public Alumno() {
			
	}
	
	public Alumno(String nombre, int edad,String dni)  {
		
		this.edad = edad;
		try {
			setDni(dni);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}	
	
	//Métodos de acceso get y set
	public String getDni() {
		return this.dni;
	}
	
	public void setDni(String dni) throws Exception {
		
		//Un DNI es correcto si tiene 9 caracteres
		
		if(dni.length()==9) {
			this.dni = dni;			
		}
		else {
			throw new Exception("DNI Erróneo");
		}
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) throws Exception {
		if(nombre.startsWith("Z")) {
			throw new Exception("Empieza por Z!!");
		}
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		if(edad>=16) {
			this.edad = edad;
		}
				
	}
	
	
	
	
	
	
	//Métodos de instancia
	public boolean esMayorEdad() {
		if(edad >=18) {
			return true;
		}
		return false;
	}
	
	//Métodos heredados de la clase Object
	//toString
	@Override
	
	public String toString() {
		return this.nombre + " " +  edad + " " +  dni;
	}
	
	
	
	//Métodos estáticos.

}
