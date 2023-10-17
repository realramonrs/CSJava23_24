package sentenciasRepeticion;

import java.util.Random;

public class BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3 partes y 1 variable de control
		//inicialización de la variable de control
		//Condición de continuidad --> variable de control
		// modificar la varible de control
		
		//for(inicializacion;condicion;modificacion){  }
		//Contar los divisores de un número n
		long n = 1900000000;
		int contador = 2;
		for(int i = 2;i<=n/2;i++) {
			
			if(n % i == 0) {
				System.out.print(i + " ");
				contador++;
				break;
			}
			
			
		}
		
		System.out.println("Cantidad divisores: " + contador);
		
		if(contador == 2) {
			System.out.println("Número primo");
		}
		else {
			System.out.println("Número no es primo");
		}
		
		
		
		//Llenar una matriz con números aleatorios entre 1 y 100.
		//Calcular la media:
		//Calcular el valor más repetido
		
		int matriz[] = new int[1000];
		Random aleatorio = new Random();
		
		
		for(int i = 0;i<=matriz.length;i++) {
			matriz[i] = aleatorio.nextInt(20, 101);
		}
		
		int suma = 0;
		double media;		
		
		for(int i = 0;i<=matriz.length;i++) {
			suma = suma + matriz[i];
		}
		media = suma / matriz.length;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
