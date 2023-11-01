package utilidades;

public class Printable {

	public static void write(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void writeArray(int []m) {
		for(int valor : m) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
}
