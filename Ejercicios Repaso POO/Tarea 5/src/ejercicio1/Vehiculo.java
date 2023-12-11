package ejercicio1;

import java.time.LocalDate;

public class Vehiculo implements Prestable  {

	private String matricula;
	private String marca;
	private String modelo;
	private boolean alquilado;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	
	@Override
	public boolean prestar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}

	

}
