package matrices2d;

public class Ejemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//matriz de int 5 x 5
		int matriz[][] = new int[5][5];
		//matriz de float de 3 x 5
		float matriz2[][] = new float[3][5];
		//matriz irregular --> Filas de distintos tamaños (nºs de columnas)
		
		int matriz3 [][] = new int[3][];
		matriz[0] = new int[2];
		matriz[1] = new int[7];
		matriz[2] = new int[4];
		
		//Obtener capacidad .length
		int filas = matriz.length;
		System.out.println(filas);
		
		//Capacidad
		int capacidad = filas*matriz[0].length;
		
		//Capacidad matriz irregular
		int capacidadIrregular = matriz[0].length + matriz[1].length + matriz[2].length;
		
		System.out.println(capacidadIrregular);
		
		//Recorrer un array 2D
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
