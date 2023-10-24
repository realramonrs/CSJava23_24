package metodosReturn;

import java.util.Arrays;

public class Ejemplos {

	public static boolean isPerfect(int n) {
		//Un número es perfecto si la suma de sus divisores(excepto n) es igual a n
		int suma = 0;
		for(int i = 1;i<n;i++) {
			if(n%i == 0) {
				suma+=i;
			}			
		}
		if(n == suma) {
			return true;
		}
		
		return false;		
	
	}
	
	public static int duplicar(int n) {
		return n*2;
	}
	
	//********** PARÁMETROS OPCIONALES *************//
	
	public static double calcularMedia(int x,int...n) {
		int suma =x;
		if(n.length == 0) {
			
			return x;
		}
		for(int valor : n) {
			suma = suma  + valor;
		}
		
		
		return suma/(n.length+1);
	}
	
	// ********* DEVUELVE UN ARRAY ********//
	//Método que recibe un array y devuelve un array con los mismos valores pero el doble de capacidad
	public static int[] doblarCapacidadArray(int m[]) {
		int copia[] = new int[m.length*2];
		copia = Arrays.copyOf(m, copia.length);
		return copia;
	}
	
	
	
	
	
	
}
