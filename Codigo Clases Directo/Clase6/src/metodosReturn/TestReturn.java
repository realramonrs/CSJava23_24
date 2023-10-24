package metodosReturn;

import static utilidades.MetodosMatematicos.*;
import static utilidades.Escritura.*;

public class TestReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[] = {6,28,9,45,9,13,9};
		
		//Visualizar todos los números perfectos de matriz
		System.out.println("Números perfectos: ");
		for(int numero : matriz) {
			if(Ejemplos.isPerfect(numero)) {
				System.out.print(numero + " " );
			}
		}
		
		//Duplicar el valor de una variable
		System.out.println();
		int numero = 10;
		numero = Ejemplos.duplicar(numero);
		System.out.println("numero después de duplicar = " + numero);
		
		//Calcular la media de 2 números
		int x = 9, y = 8;
		double media = Ejemplos.calcularMedia(x,y) ;
		
		//Calcular la media de 5 números
		int a = 8,b=4,c=7,d = 5, e = 9;
		
		double media2 = Ejemplos.calcularMedia(a,b,c,d,e);
		
		//Calcular la media de 3 números
		int x1 = 8,x2 = 3,x3 = 5;
		
		double media3 = Ejemplos.calcularMedia(x1,x2,x3);
		
		double media0 = Ejemplos.calcularMedia(7,3,6,7,8,1,2);
		System.out.println(media0);
		
		//Llamada al método isPar del paquete utilidades
		
		isPar(10);
		
		//Llamar al método duplica la capacidad de un array
		
		int m[] = {1,4,5};
		
		m = Ejemplos.doblarCapacidadArray(m);
		
		escribir(m);
		
		
		
		
		
	}

}
