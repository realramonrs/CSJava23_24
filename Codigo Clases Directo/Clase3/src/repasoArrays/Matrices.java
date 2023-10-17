package repasoArrays;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaración
		int []matriz = new int[5];
		//Declaración + inicialización
		int matriz2[] = {9,8,4};
		//Obtener capacidad de una matriz
		int capacidad = matriz.length;
		//Acceso a primera y última posición
		matriz2[0] = 5;
		matriz2[1]  = 9;
		matriz2[matriz2.length - 1] = 3;
		
		//Mostrar por pantalla
		System.out.println(matriz2[0] + " " + matriz2[1]);
		System.out.println(Arrays.toString(matriz2));
		//Calculo de la media
		int suma = matriz2[0] + matriz2[1] + matriz2[2];
		double media = suma / matriz2.length ;
		
		
	}

}
