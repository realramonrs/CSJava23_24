package misClases;

public class Leopardo extends Animal implements Acelerable,Comparable<Leopardo> {

	private int velocidad;
	public Leopardo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void acelerar(int parametro) {
		// TODO Auto-generated method stub
		this.velocidad+=parametro*3;
	}
	@Override
	public int compareTo(Leopardo o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
