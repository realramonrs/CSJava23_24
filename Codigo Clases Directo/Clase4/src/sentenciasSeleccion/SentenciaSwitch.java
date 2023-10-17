package sentenciasSeleccion;

import java.util.Scanner;

public class SentenciaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char opcion = 'a';
		
		System.out.println("Escoja una opcion: ");
		Scanner lector = new Scanner(System.in);
		System.out.println("a. Validar DNI");
		System.out.println("b. Ver provincias españolas.");
		System.out.println("c. Mostrar números romanos. ");
	
		opcion = lector.nextLine().charAt(0);
		
		
		switch(opcion) {
		case 'a','A':
			
			System.out.println("Validación DNI");
			break;
		case 'b','B':
			
			System.out.println("Listado de provincias españolas:");
			break;
		case 'c','C':
			System.out.println("I II III IV V");
			break;
			default:
				System.out.println("Opción errónea.");
				break;
				
			
		}
		
		
	}

}
