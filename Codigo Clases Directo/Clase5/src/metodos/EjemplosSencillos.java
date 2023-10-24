package metodos;

public class EjemplosSencillos {
	
	//Ejemplos de m�todos con n�meros
	
	//atributo de acceso: 
	//public --> Se puede ejecutar desde cualquier clase del proyecto
	//private --> Se puede ejecutar desde la misma clase
	//protected --> Se puede ejecutar desde cualquier clase hija.
	//Por defecto --> Se puede ejecutar desde cualquier clase del mismo paquete
	
 public static boolean esPar(int n) {
		
		if(n % 2 ==0) {
			return true;
		}
		
		return false;
		
	}
 
 //M�todo que me devuelve la media de un array de enteros
 public static double calcularMedia(int []m) {
	 
	 int suma = 0;
	 
	 for(int valor : m) {
		 suma = suma + valor;
	 }
	 
	 return suma/m.length;
 }
 
 //Sobrecargar m�todo calcular media
 
public static double calcularMedia(double []m) {
	 
	 double suma = 0;
	 
	 for(double valor : m) {
		 suma = suma + valor;
	 }
	 
	 return suma/m.length;
 }
 
 
 public static double calcularMedia(double []m,int inicio) {
	 double suma = 0;
	 int contador = 0;
	 
	 for(int i = inicio;i<m.length;i++) {
		 suma = suma + m[i];
		 contador++;
	 }
	 
	 return suma/ contador ;
 }
 
 public static double calcularMedia(double []m,int inicio,int end) {
	 double suma = 0;
	 int contador = 0;
	 if(end >=m.length) {
		 end = m.length - 1;
	 }
		 for(int i = inicio;i<=end;i++) {
			 suma = suma + m[i];
			 contador++;
		 }
	 
	 
	 return suma/ contador ;
 }
 
 //b�squeda en matriz, devuelve posici�n primera aparici�n
 public static int buscarValor(int c[],int valor) {
	 
	 int posicion = -1;
	 for(int i = 0;i<c.length;i++) {
		 if(c[i]==valor) {
			posicion = i;
			break;
		 }
	 } 
	 return posicion;
 }
 
 
 
 
 
 
	
	
	
	
	
	

}
