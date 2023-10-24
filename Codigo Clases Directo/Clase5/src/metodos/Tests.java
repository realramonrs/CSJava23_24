package metodos;

public class Tests {
	private static int esMayor(int n1,int n2) {
		if(n1>n2) {
			return n1;
		}
		return n2;
	}
	
	private static boolean isPrimo(int n) {
		
		boolean primo = true;
		
		for(int i = 2;i<n;i++) {
			if(n % i==0) {
				primo = false;
				break;
			}
		}
		
		return primo;
		
	}
	
	private static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	private static void escribir(int x[]) {
		for(int i = 0;i<x.length;i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pruebas del metodo esPar(int n)
		int numero = 9;
		
		if(EjemplosSencillos.esPar(numero)) {
			System.out.println("Número par");
		}
		else {
			System.out.println("Número impar.");
		}
			
		int matriz[] = {7,2,5,4,3,9,13,8};
		escribir(matriz);
		boolean primo = true;
		int contador = 0;
		
		for(int i = 0;i<matriz.length;i++) {
			if(isPrimo(matriz[i])) {
				contador++;
				System.out.print(matriz[i] + " ");
			}
		}
		
		System.out.println();
		//Calcular Media
		double media = EjemplosSencillos.calcularMedia(matriz);
		int matriz2[] = {9,5,3,2};
		double media2 = EjemplosSencillos.calcularMedia(matriz2);
		double matriz3[] = {6,5,4,3,2};
		double media3 = EjemplosSencillos.calcularMedia(matriz3);
		
		double media4 = EjemplosSencillos.calcularMedia(matriz3, 2);
		
		double media5 = EjemplosSencillos.calcularMedia(matriz3, 2, 70);
		System.out.println("media = " + media5);
		
		int posicion = EjemplosSencillos.buscarValor(matriz2, 5);
		
		
		/*for(int i = 0;i<matriz.length;i++) {
			primo = true;
			for(int j = 2;j<matriz[i];j++) {
				if(matriz[i] % j ==0) {
					primo = false;
					break;
				}
			}
			if(primo) {
				contador++;
				
			}
		}*/
		
		escribir("Esto es impresionante, como pude vivir sin saber esto!");

	}

}
