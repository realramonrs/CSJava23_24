package utilidades;

import java.util.Random;

public class GeneracionArrays {

	public static void llenarArray(int m[],int max) {
		Random aleatorio = new Random();
		for(int i = 0;i<m.length;i++) {
			m[i] = aleatorio.nextInt(max+1);
		}
	}
	
	public static void llenarArray(int m[],int min,int max) {
		Random aleatorio = new Random();
	
		for(int i = 0;i<m.length;i++) {
			m[i] = aleatorio.nextInt(min,max+1);
		}
	}
}
