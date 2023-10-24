package utilidades;

public class Escritura {

	public static void escribir(String mensaje) {
		System.out.println(mensaje);
		
	}
	
	public static void escribir(int matriz[]) {
		for(int valor : matriz) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
}
