package matrices;

public class MetodosArrays {

	//1.Método que recibe un array y devuelve la posición del primer valor que está
	//por encima de la media
	public static int getValorUpMedia(int m[]) {
		double media = getMedia(m);
		int pos = 0;
		for(int i=0;i<m.length;i++) {
			if(m[i] > media) {
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	private static double getMedia(int m[]) {
		double media = 0;
		int suma = 0;
		
		for(int x : m) {
			suma+=x;
		}
		media = suma/m.length;
		return media;
	}
	
	
	
	//2. Método que recibe un array y devuelve la cantidad de números negativos que en valor 
	//absoluto están en el rango [10,20] 
	
	public static int getNumsNegativosByRango(int []m) {
		int contador = 0;
		
		for(int valor : m) {
			if(valor<0 && Math.abs(valor)>=10 && Math.abs(valor)<=20) {
				contador++;
			}
		}
		return contador;
	}
	//3.Sobrecargarlo para que el rango pueda especificarse
	
	public static int getNumsNegativosByRango(int []m,int min,int max) {
		int contador = 0;
		if(min<max) {
		for(int valor : m) {
			if(valor<0 && Math.abs(valor)>=min && Math.abs(valor)<=max) {
				contador++;
			}
		}
		}
		return contador;
	}
	//4. Método que recibe un array y cambia todos los valores pares por 
	// el siguiente número primo más cercano, por ejemplo si hay un 7 lo cambia por el 11
	
	public static void cambiarParPorProximoPrimo(int m[]) {
		for(int i = 0;i<m.length;i++) {
			if(m[i]>1) {
			if(m[i]%2==0) {
				for(int j = m[i] + 1;;j++) {
					if(isPrimo(j)) {
						m[i] = j;
						break;
					}
				}
			}
		}
		}
	}
	private static boolean isPrimo(int n) {
		for(int i = 2;i<=n/2;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
