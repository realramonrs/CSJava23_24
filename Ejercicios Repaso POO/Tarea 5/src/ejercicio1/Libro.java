package ejercicio1;

import java.time.LocalDate;

public class Libro extends Producto {
	
	// Atributos
	private String autor;
	private int numPaginas;
	
	// Constructores
	public Libro() {
		super();
	}
	public Libro(String codigo, String titulo, String autor, int numPaginas) throws Exception {
		super(codigo, titulo);
		setAutor(autor);
		setNumPaginas(numPaginas);
	}
	
	// Métodos de acceso
	// Setters
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	// Getters
	public String getAutor() {
		return this.autor;
	}
	public int getNumPaginas() {
		return this.numPaginas;
	}
	
	// Método toString()
	@Override
	public String toString() {
		return super.toString() + "Libro [autor=" + autor + ", numPaginas=" + numPaginas + "]";
	}
	
	// Método prestar()
	public boolean prestar() {
		if (this.getPrestado() == true) {
			return false;
		}
		else {
			this.setPrestado(true);
			this.setFechaAlquiler(LocalDate.now());
			this.setFechaDevolucion(this.getFechaAlquiler().plusDays(10));
			return true;
		}
	}
	
	//Método toStringFichero con info de Peliculas
		public String toStringFichero() {
			if(super.getPrestado()) {
				return super.getCodigo()+"," + super.getTitulo() + "," + this.getAutor() + "," + this.getNumPaginas()+","+
			 "1," + super.getFechaAlquiler() +"," + super.getFechaDevolucion();
			}
				else {
					return super.getCodigo()+"," + super.getTitulo() + "," + this.getAutor() + "," + this.getNumPaginas()+","+
							 "0,0,0";
				}
		}

}
