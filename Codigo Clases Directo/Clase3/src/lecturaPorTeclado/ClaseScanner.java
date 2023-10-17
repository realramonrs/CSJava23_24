package lecturaPorTeclado;

import java.util.Scanner;

public class ClaseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner h = new Scanner(System.in);
		System.out.println("Introduzca DNI");
		String dni = h.next();
		System.out.println("Introduzca la edad: ");
		int edad = h.nextInt();
		System.out.println("DNI: " + dni +  " Edad : "+ edad);
		System.out.println("Introduzca el salario");
		float salario = h.nextFloat();
		System.out.println("Salario: " + salario);
		
		
	}

}
