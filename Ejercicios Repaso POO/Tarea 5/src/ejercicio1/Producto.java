package ejercicio1;

import java.time.LocalDate;

public abstract class Producto implements Prestable {

	// Atributos
	private String codigo;
	private String titulo;
	private boolean prestado;
	private LocalDate fechaAlquiler;
	private LocalDate fechaDevolucion;
	
	// Constructores
	public Producto() {
		
	}
	public Producto(String codigo, String titulo) throws Exception {
		setCodigo(codigo);
		setTitulo(titulo);
	}
	
	// Métodos de acceso
	// Setters
	public void setCodigo(String codigo) throws Exception {
		if (codigo.length() == 4) {
			byte contadorLetras = 0;
			byte contadorDigitos = 0;
			for (int i = 0; i < codigo.length(); i++) {
				if (Character.isLetter(codigo.charAt(i))) {
					contadorLetras++;
				}
				else if (Character.isDigit(codigo.charAt(i))) {
					contadorDigitos++;
				}
			}
			if (contadorLetras == 2 && contadorDigitos == 2) {
				this.codigo = codigo;
			}
			else {
				throw new Exception();
			}
		}
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}
	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	// Getters
	public String getCodigo() {
		return this.codigo;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public boolean getPrestado() {
		return this.prestado;
	}
	public LocalDate getFechaAlquiler() {
		return this.fechaAlquiler;
	}
	public LocalDate getFechaDevolucion() {
		return this.fechaDevolucion;
	}
	
	// Método toString()
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", titulo=" + titulo + ", prestado=" + prestado + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + "]";
	}
	
	// Método devolver()
	public final void devolver() {
		setPrestado(false);
		setFechaAlquiler(null);
		setFechaDevolucion(null);
	}
	
	public abstract String toStringFichero();
		
	
	
}
