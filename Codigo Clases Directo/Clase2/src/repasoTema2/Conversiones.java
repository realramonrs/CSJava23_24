package repasoTema2;

public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Entre variables numéricas:
		//Implícitas: Cuando un valor se pasa de una variable de menor capacidad
		//A otra de mayor capacidad
		byte edad = 20;
		int edadCopia = edad;
		
		float sueldo = 300.45f;
		double sueldoCopia = sueldo;
		//Explícitas
		int numero = 904;
		short numeroCopia = (short) numero;
		
		// Peligros de las conversiones explícitas:
		//1º Overflow--> Desbordamiento
		short v = 500;
		byte vCopia = (byte) v;
		System.out.println("v copia = " + vCopia);
		//2º Pérdida de precisión
		float f = 4.56f;
		int fCopia = (int) f;
		System.out.println("fCopia = " + fCopia);
		
		//Pasar de numero a String -->

		int numeroEntero = 945;
		byte numeroByte = 45;
		String numeroString = Integer.toString(numeroEntero);
		String byteString = Byte.toString(numeroByte);
				
		//Pasar de String a número --> Wrapper
		String dni = "12345678t";
		int numeroDNI;
		try {
			numeroDNI = Integer.parseInt(dni);
			System.out.println("Numero DNI: " + numeroDNI);
		}
		
		catch(NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("Error en el formato del dni");
		}
		catch(Exception e) {
			System.out.println("Error inesperado.");
		}
		
		
		 
		
	}

}
