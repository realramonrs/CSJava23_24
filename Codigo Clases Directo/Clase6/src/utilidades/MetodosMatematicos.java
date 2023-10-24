package utilidades;

import java.util.Random;

public class MetodosMatematicos {

	
	public static void llenarMatriz(int []x) {
		Random aleatorio = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = aleatorio.nextInt(21);
		}
	}
	public static boolean isPar(int n) {
		
		if(n % 2 == 0) {
			return true;
		}
		return false;
	}
}
