package sentenciasSeleccion;

import java.util.Scanner;

public class SentenciaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if else 
		//Programa que indica si un número es par o impar
		int n;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		n = lector.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("El número es par");
			
		}
		else {
			System.out.println("El número es impar");
			
		}
		
		
		
		
		
		System.out.println("Final del programa");

	}

}
