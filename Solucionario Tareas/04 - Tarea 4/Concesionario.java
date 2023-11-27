package clasesVehiculos;

public class Concesionario {
	
	private Coche coches[];
	private String nombre;
	private static String multinacional;
	
	//Constructores
	
	public Concesionario() {
		coches = new Coche[10];
	}
	
	public Concesionario(String nombre, int capacidad) {
		this.nombre = nombre;
		coches = new Coche[capacidad];
			
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Método que recibe un coche y lo almacena en la 1ª pos vacía
	public boolean addCoche(Coche c) {
		for(int i = 0;i<coches.length;i++) {
			if(coches[i]==null) {
				coches[i] = c;
				return true;
			}
		}
		return false;
	}
	
	//Método que busca un coche por la matrícula
	public Coche getCocheByMatricula(String matricula) {
		for(Coche c : coches) {
			if(c!=null) {
				if(c.getMatricula().equals(matricula)) {
					return c;
				}
			}
			else {
				break;
			}
		}
		return null;
	}
	
	//Método que elimina un coche de la matriz por matrícula
	
	public boolean deleteCoche(String matricula) {
		for (int i = 0; i < coches.length; i++) {
			if(coches[i]!=null) {
				if(coches[i].getMatricula().equals(matricula)) {
					coches[i] = null;
					//Ordenar la matriz para pasar todas las posiciones vacías al final
					reordenarMatriz();
					return true;
				}
			}
		}
		return false;
	}
	
	public int contarCoches() {
		int contador = 0;
		for (Coche coche : coches) {
			if(coche!=null) {
				contador++;
			}
			
		}
		return contador;
	}
	
	private void reordenarMatriz() {
		Coche copia[] = new Coche[coches.length];
		
		int contador = 0;
		
		for (int i = 0; i < coches.length; i++) {
			if(coches[i]!=null) {
			 copia[contador] = coches[i];
			 contador++;
			}			
		}
		
		coches = copia;
		
		}
	
	@Override
	public String toString() {
		String info = "Concesionario " + nombre +"\n";
		
		for (Coche coche : coches) {
			if(coche!=null) {
				info= info + coche.toString();
				info+="\n";
			}
			else {
				break;
			}
		}
		return info;
	}
	
	
	
	
	
	
	
	
	
	

}
