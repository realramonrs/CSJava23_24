package sentenciasRepeticion;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 partes y 1 variable de control
		//inicialización de la variable de control
		//Condición de continuidad --> variable de control
		// modificar la variable de control
		
		//Ejemplo 1: Mostrar por consola los 10 primeros números
		
		int i = 1;
		
		while(i<=10) {
			System.out.print(i + " ");
			i=i+1; //i++; i+=1;
		}
		System.out.println();
		System.out.println("i = " + i);
		
		//Mostrar el primer valor múltiplo de 3 y 7 entre n y m
		int n = 490 , m = 13000;
		
		int j = n;
		System.out.println();
		while(j<=m) {
			
			if(j%3==0 && j%7==0) {
				System.out.println("Primer múltiplo de 3 y 7: " + j + " ");
				break;
			}
			
			j++;
		}
		
		//Contar números negativos negativos en una matriz
		int matriz[] = {9,0,-3,8,2,-1,4,-5};
		//Crear una matriz sólo con números negativos de la matriz originals
		
		int k = 0; //variable de control
		int contador = 0;
		while(k<matriz.length) {
			if(matriz[k] < 0) {
				contador++;				
			}
			k++;
		}
		
		System.out.println("Hay " + contador + " numeros negativos");
		
		//Sumar los valores de la matriz que son pares.
		int suma = 0;
		int z = 0; //variable de control
		
		while(z<matriz.length) {
			if(matriz[z] % 2 == 0) {
				suma = suma + matriz[z];
			}
			z++;
		}
		
		System.out.println("La suma de valores pares : " + suma);
		
		
		
		
		/*if(matriz[0]<0) {
			
		}
		if(matriz[1]<0) {
			
		}
		if(matriz[2]<0) {
			
		}*/
		
		//...
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
