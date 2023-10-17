package sentenciasRepeticion;

import java.util.Random;

public class BuclesAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// * * * * * *
		// * * * * * *
		// * * * * * *
		
		int n = 6; //número de asteriscos
		int x = 5; // número de filas
		
		for(int j = 1;j<=x;j++) {
			System.out.print("j = " + j + " ");
			for(int i = 0;i<n;i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Algoritmo que muestra todos los números primos de una matriz
		int matriz[] = new int[100];
		Random aleatorio = new Random();
		
		for(int i = 0;i<matriz.length;i++) {
			matriz[i] = aleatorio.nextInt(1,31);
		}
		
		//Detectar números primos en la matriz
		//No mostrar valores repetidos
		boolean primo = true;
		for(int i = 0;i<matriz.length;i++) {
			//Bucle que vaya desde 2 hasta matriz[i]/2
			
			 primo = true;
			for(int j = 2;j<=matriz[i]-1;j++) {
				if(matriz[i] % j == 0) {
					primo = false;
					break;
				}
			} //Cierra el bucle de dentro
			
			if(primo) {
				System.out.print(matriz[i] + " ");
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
