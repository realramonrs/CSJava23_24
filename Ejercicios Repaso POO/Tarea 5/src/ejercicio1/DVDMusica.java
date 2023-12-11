package ejercicio1;

import java.time.LocalDate;

public class DVDMusica extends DVD {

	// Atributos
	private String grupo;
	
	// Constructores
	public DVDMusica() {
		super();
	}
	public DVDMusica(String codigo, String titulo, int duracion, String grupo) throws Exception {
		super(codigo, titulo, duracion);
		setGrupo(grupo);
	}
	
	// Métodos de acceso
	// Setters
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	// Getters
	public String getGrupo() {
		return this.grupo;
	}
	
	// Método toString()
	@Override
	public String toString() {
		return super.toString() + "DVDMusica [grupo=" + grupo + "]";
	}
	
	// Método prestar()
	public boolean prestar() {
		if (this.getPrestado() == true) {
			return false;
		}
		else {
			this.setPrestado(true);
			this.setFechaAlquiler(LocalDate.now());
			this.setFechaDevolucion(this.getFechaAlquiler().plusDays(5));
			return true;
		}
	}
	
	//Método toStringFichero con info de Peliculas
			public String toStringFichero() {
				if(super.getPrestado()) {
					return super.getCodigo()+"," + super.getTitulo() + "," + this.getDuracion() + "," + this.getGrupo()+","+
				 "1," + super.getFechaAlquiler() +"," + super.getFechaDevolucion();
				}
					else {
						return super.getCodigo()+"," + super.getTitulo() + "," + this.getDuracion() + "," + this.getGrupo()+","+
								 "0,0,0";
					}
			}
	
}
