package misClases;

public class Turismo extends Coche {

	
	public Turismo(String codigo, float velocidad, float nivelAceite) {
		super(codigo, velocidad, nivelAceite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar(int parametro) {
		// TODO Auto-generated method stub
		super.setVelocidad(super.getVelocidad() + parametro*2);
	}

	@Override
	public String toString() {
		return "Turismo " + super.toString();
	}
	
	

}
