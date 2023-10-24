package metodosVoid;

public class TestVoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EjemplosVoid.escribir("Me encanta programar en Java");
		
		//Probar método duplicar
		int numero = 10;
		EjemplosVoid.duplicar(numero);
		System.out.println("n después de duplicar su valor = " + numero);
		
		//Probar método llenarMatriz
		int matriz[] = new int[15];
		EjemplosVoid.escribir(matriz);
		EjemplosVoid.llenarMatriz(matriz);		
		EjemplosVoid.escribir(matriz);
		
		//Probar método positivizar
		int matriz2[][] = new int[5][5];
		EjemplosVoid.llenarMatriz(matriz2, -10, 11);
		
		System.out.println("Matriz 2D original: ");
		EjemplosVoid.escribir(matriz2);
		
		EjemplosVoid.positivizar(matriz2);
		
		System.out.println("Matriz 2D Siempre Positiva: ");
		EjemplosVoid.escribir(matriz2);
		
	}

}
