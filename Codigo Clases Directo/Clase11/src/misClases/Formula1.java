package misClases;

public class Formula1 extends Coche {

	// Formula1 es un Coche
	
	public Formula1(String codigo, float velocidad, float nivelAceite) {
		super(codigo, velocidad, nivelAceite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar(int parametro) {
		// TODO Auto-generated method stub
		super.setVelocidad(super.getVelocidad()+parametro*5);
	}

	@Override
	public String toString() {
		return "Formula1" + super.toString() + "]";
	}
	
	

}
