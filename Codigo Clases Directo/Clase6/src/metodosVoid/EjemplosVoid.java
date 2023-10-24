package metodosVoid;

import java.util.Random;

public class EjemplosVoid {
	
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
		
	}
	
	public static void escribir(int matriz[]) {
		for(int valor : matriz) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	
	public static void escribir(int matriz[][]) {
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//Método que recibe un entero y lo multiplica por dos
	
	public static void duplicar(int n) {
		n = n*2;		
	}
	
	//Método que llena una matriz con números aleatorios.
	public static void llenarMatriz(int []x) {
		Random aleatorio = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = aleatorio.nextInt(21);
		}
	}
	
	public static void llenarMatriz(int []x,int minimo,int maximo) {
		Random aleatorio = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = aleatorio.nextInt(minimo, maximo);
		}
	}
	
	public static void llenarMatriz(int [][]x,int minimo,int maximo) {
		Random aleatorio = new Random();
		
		for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<x[i].length;j++) {
			    x[i][j] = aleatorio.nextInt(minimo, maximo);
			}
		}
	}
	
	//Método que busca números negativos en un array y los convierte en positivos.
	
	public static void positivizar(int x[][]) {
		
		for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<x[i].length;j++) {
				
				if(x[i][j]<0) {
					x[i][j] = Math.abs(x[i][j]);
				}
			}
		}
	}
	
	

}
