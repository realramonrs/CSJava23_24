package misClases;

public abstract class Coche extends Vehiculo {
	
	private float nivelAceite;

	public Coche(String codigo, float velocidad, float nivelAceite) {
		super(codigo,velocidad);
		this.nivelAceite = nivelAceite;
		
	}

	public float getNivelAceite() {
		return nivelAceite;
	}

	public void setNivelAceite(float nivelAceite) {
		this.nivelAceite = nivelAceite;
	}

	@Override
	public String toString() {
		return super.toString() + "nivelAceite=" + nivelAceite;
	}
	
	//Todavía no sabemos programar el método acelerar.

}
