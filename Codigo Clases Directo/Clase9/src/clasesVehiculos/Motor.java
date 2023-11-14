package clasesVehiculos;

public class Motor extends Object {
 //De cada motor interesa almacenar:
	//litros de aceite
	//Potencia en caballos o KW 1kw = 1.34 caballos. 
	//tipo de motor -> Gasolina, Diesel, Eléctrico, Híbrido.
	
	private int litrosAceite;
	private float potencia;
	private TipoMotor tipoMotor;
	
		
	public Motor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motor(int litrosAceite, float potencia, TipoMotor tipoMotor) {
	
		this.litrosAceite = litrosAceite;
		this.potencia = potencia;
		this.tipoMotor = tipoMotor;
	}

	public int getLitrosAceite() {
		return litrosAceite;
	}

	public void setLitrosAceite(int litrosAceite) {
		this.litrosAceite = litrosAceite;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public TipoMotor getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(TipoMotor tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	@Override
	public String toString() {
		return "Motor [litrosAceite=" + litrosAceite + ", potencia=" + potencia + ", tipoMotor=" + tipoMotor + "]";
	}
	
	
	
}
