package apiJava;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array = Matriz --> almacenar muchos valores del mismo tipo
		int []valores = new int[3];
		valores[0] = 9;
		System.out.println("Posicion 0: " + valores[0]);
		//Última posicion de la matriz
		valores[2] = 2;
		//No se puede acceder a posiciones más lejanas
		//valores[10] = 3; --> Excepción de índice no permitido
		
		//Declarar e inicializar un array 
		float temperaturas[] = {12.4f,7.4f,4.9f,5};
		int d = 9;
		float vv = d;
		//Propiedad length
		int capacidad = temperaturas.length;
		//Acceso seguro a la última posición
		temperaturas[temperaturas.length - 1] = 30;
		float ultimaTemperatura = temperaturas[temperaturas.length - 1];
		
		//Mostrar un array por consola
		System.out.println(temperaturas[0] + " " + temperaturas[1]);
		//Utilizando la clase Arrays
		System.out.println(Arrays.toString(temperaturas));
		//Otros métodos de la clase Arrays
		//Arrays.sort(temperaturas);
		System.out.println("Temperaturas ordenadas de menor a mayor: ");
		System.out.println(Arrays.toString(temperaturas));
		//Buscar un valor en el Array--> Binarysearch
		int posicion = Arrays.binarySearch(temperaturas, 7.4f);
		System.out.println("Posición: " + posicion);
		
		//Copiar valores de un array a otro
		int original[] = {1,2,3,4,5};
		int copiaBien[] = Arrays.copyOf(original, original.length);
		
		int copiaMal[] = original;
		copiaMal[0] = 20;
		System.out.println(original[0]);		
		

		
	}

}
