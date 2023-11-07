package misClases;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear variables de tipo Alumno
		Alumno a1,a2,a3;  //Son referencias null
		
		//Asociar referencia con objeto --> Instanciar
		//--> Operador new
		a1 = new Alumno();  //--> Se ha creado un objeto en memoria de tipo Alumno
		a2 = new Alumno("María",23,"kjhgjhkgjhkg");
		a3 = new Alumno("María",23,"iutyutyutt");
	
		
		//Para acceder a los atributos de un objeto, utilizamos el operador .
		//Mostrar la edad de a1
		System.out.println("Valores de a1 por defecto: ");
		System.out.println("Edad de " + a1.getNombre() + " : " + a1.getEdad());
		//Modificar la edad:
		a1.setEdad(15);
		//Modificar nombre y DNI
		a1.setNombre("Javier");
		
		if(a1.setDni("123456789")) {
			System.out.println("DNI actualizado con éxito.");
		}
		else {
			System.out.println("No se ha podido guardar el dni");
		}
		
		
		System.out.println("Valores de a1 modificados: ");
		
		System.out.println("Edad de " + a1.getNombre() + " : " + a1.getEdad());
		
		//Es mayor de edad?
		if(a1.esMayorEdad()) {
			System.out.println("Es mayor de edad.");
		}
		else {
			System.out.println("No es mayor de edad.");
		}
		
		//Llamada a métodos heredados de la clase Object
		System.out.println(a1);
		System.out.println("HashCode a1: " + a1.hashCode());
		System.out.println("HashCode a2: " + a2.hashCode());
		System.out.println("HashCode a3: " + a3.hashCode());
		
		boolean iguales = a2.equals(a3);
		System.out.println(iguales);
		
		//Crear una matriz de alumnos
		Alumno []listaAlumnos;
		
		
	}

}
