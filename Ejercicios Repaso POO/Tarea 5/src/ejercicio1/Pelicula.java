package ejercicio1;

import java.time.LocalDate;

public class Pelicula extends DVD {

	// Atributos
	private String director;
	private String genero;
	
	// Constructores
	public Pelicula() {
		super();
	}
	public Pelicula(String codigo, String titulo, int duracion, String director, String genero) throws Exception {
		super(codigo, titulo, duracion);
		setDirector(director);
		setGenero(genero);
	}
	
	// Métodos de acceso
	// Setters
	public void setDirector(String director) {
		this.director = director;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	// Getters
	public String getDirector() {
		return this.director;
	}
	public String getGenero() {
		return this.genero;
	}
	
	// Método toString()
	@Override
	public String toString() {
		return super.toString() + "Pelicula [director=" + director + ", genero=" + genero + "]";
	}
	
	// Método prestar()
	public boolean prestar() {
		if (this.getPrestado() == true) {
			return false;
		}
		else {
			this.setPrestado(true);
			this.setFechaAlquiler(LocalDate.now());
			this.setFechaDevolucion(this.getFechaAlquiler().plusDays(3));
			return true;
		}
	}
	//Método toStringFichero con info de Peliculas
	public String toStringFichero() {
		if(super.getPrestado()) {
			return super.getCodigo()+"," + getTitulo() + "," + this.getDuracion() + "," + this.getDirector()+","+
		this.getGenero()+ "1," + super.getFechaAlquiler() +"," + super.getFechaDevolucion();
		}
		else {
			return super.getCodigo()+"," + super.getTitulo() + "," + super.getDuracion() + "," + this.getDirector()+","+
					this.getGenero()+ "0,0,0";
		}
	}
	
}
