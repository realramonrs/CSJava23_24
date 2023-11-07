package misClases;

public class Coche {
	
	private String matricula;
	private float precio;
	private int kilometros;	
		
	
	public Coche() {
		super();
	}

	public Coche(String matricula, float precio) {
		super(); //LLamada al constructor de la clase object
		this.matricula = matricula;
		this.precio = precio;
	}

	public Coche(String matricula, float precio, int kilometros) {
		super();
		this.matricula = matricula;
		this.precio = precio;
		this.kilometros = kilometros;
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		
		if(validarMatricula(matricula)) {
			this.matricula = matricula;
		}
		
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public boolean pasarRevision() {
		if(kilometros>20000) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "matricula : " + matricula + ", precio : " + precio + ", kilometros : " + kilometros;
	}
   
	private boolean validarMatricula(String matricula) {
		boolean correcto = true;
		if(matricula.length()==7) {
			for(int i = 0;i<4;i++) {
				if(!Character.isDigit(matricula.charAt(i))){
					correcto = false;
					break;
				}
			}
			for(int i = 4;i<7;i++) {
				if(!Character.isLetter(matricula.charAt(i))) {
					correcto = false;
					break;
				}
			}
		}
		return correcto;
	}	

}
