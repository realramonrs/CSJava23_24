package repaso;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion,intentos=0;
		do {
			System.out.println("1. Calcular suma/resta de dos números");
			System.out.println("2. Sumar divisores.");
			System.out.println("3. Contar mayúsculas.");
			System.out.println("4. Salir");
			Scanner lector = new Scanner(System.in);
			
			opcion = lector.nextInt();

			switch (opcion) {
			case 1:
				int x1, x2, resultado;
				System.out.println("Intro valor para x1: ");
				x1 = lector.nextInt();
				System.out.println("Intro valor para x2: ");
				x2 = lector.nextInt();
				System.out.println("Escoja operación: ");
				lector = new Scanner(System.in);
				char operacion = lector.nextLine().charAt(0);
				switch (operacion) {
				case 's':
					resultado = x1 + x2;
					System.out.println("Suma : " + resultado);
					break;
				case 'r':
					resultado = x1 - x2;
					System.out.println("Resta: " + resultado);
					break;
				}

				break;
			case 2:
				System.out.println("Intro numero para sumar divisores");
				int n = lector.nextInt();
				int sumaDivisores = 1;
				
				for(int i = 2;i<=n;i++) {
					if(n % i == 0) {
						sumaDivisores = sumaDivisores + i;
					}
				}
				System.out.println("Suma divisores : " + sumaDivisores);
				break;
			case 3:
				System.out.println("Introduce una frase");
				lector = new Scanner(System.in);
				String frase = lector.nextLine();
				
				int contarMayusculas = 0;
				
				for(int i = 0;i< frase.length();i++) {
					if(Character.isUpperCase(frase.charAt(i))) {
						contarMayusculas++;
					}
				}
				System.out.println("Mayusculas : " + contarMayusculas);
				
				break;
			case 4:
				System.out.println("Vuelva pronto.");
				break;
			default:
				System.out.println("Opcion errónea, vuelva a intentarlo");
				intentos++;
				System.out.println("Nº de intentos " + intentos);
				break;
			}

		} // Cierre del bucle do
		while (opcion != 4);

	}

}
