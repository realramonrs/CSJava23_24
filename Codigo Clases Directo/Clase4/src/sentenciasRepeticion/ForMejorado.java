package sentenciasRepeticion;

public class ForMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[] = {1,4,3,0,1,6,0,9};
		
		for(int i = 0;i<matriz.length;i++) {
			
		}
		
		//Para recorrer colecciones de datos de manera completa y para
		//operaciones de sólo lectura , podemos usar el siguinte for
		
		for(int valor : matriz) {
			System.out.print(valor + " ");
		}
		
		//No puede modificar la colección de datos subyacente
		//Ejercicio: Modificar posiciones que almacenen un cero y guardar un 1
		
		for(int valor : matriz) {
			if(valor == 0) {
				valor = 1;
			}			
		}
		
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i] == 0) {
				matriz[i] = 1;
			}
		}
		
		
		System.out.println();
		for(int valor : matriz) {
			System.out.print(valor + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
