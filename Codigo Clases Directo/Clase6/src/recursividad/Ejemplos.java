package recursividad;

public class Ejemplos {
	
	//Se dice que un método es recursivo cuando se llama a sí mismo
	//Debe de existir un caso base que finaliza la pila de llamadas recursivas
	//Ejemplo : Factorial:
	
	public static long  factorialRecursivo(int n) {
		if(n == 0 || n ==1) {
			return 1;
		}
		return factorialRecursivo(n-1)*n;
	}
	public static long factorial(int n) {
		long fact = 1;
		if(n == 0 || n ==1) {
			fact = 1;
		}
		else {
			for(int i = n;i>=1;i--) {
				fact=fact*i;
			}
		}
		
		return fact;
	}
	

}
