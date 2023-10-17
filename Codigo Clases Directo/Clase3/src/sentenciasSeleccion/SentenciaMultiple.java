package sentenciasSeleccion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SentenciaMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		
		System.out.println("Escoja una opción:");
		System.out.println("1. Decir sin un número es positivo");
		System.out.println("2. Calcular la raíz de un número.");
		System.out.println("3. Contar palabras.");
		
		Scanner lector = new Scanner(System.in);
		 opcion = lector.nextInt();
		
		if(opcion == 1) {
			System.out.println("Intro numero:");
			int n = lector.nextInt();
			if(n>0) {
				System.out.println("Positivo");
			} // Cierre del if n > 0
			else {
				System.out.println("Negativo o cero");
			}
		} // Cierre del If opcion
		else if(opcion == 2) {
			System.out.println("Introduzca numero positivo: ");
			int radicando = lector.nextInt();
			double raiz = Math.sqrt(radicando);
			System.out.println("Raiz de :" + radicando + " = " + raiz);
		}
		else if(opcion == 3) {
			System.out.println("Intro frase: ");
			//resetear el scanner
			lector = new Scanner(System.in);
			String frase = lector.nextLine();
			String palabras[] = frase.split(" ");
			int numeroDepalabras = palabras.length;
			System.out.println(numeroDepalabras);
		}
		else {
			System.out.println("La opción es errónea");
		}	
		
		
	}

}
