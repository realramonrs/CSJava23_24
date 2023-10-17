package apiJava;


public class EjemploMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Clase Math: métodos matemáticos
		//Calcular la raiz : Math.sqrt(numero)
		int numero = 23;
		float raiz = (float) Math.sqrt(numero);
		//Calcular potencias: Math.pow(base,exponente)
		int numero2 = 3;
		int potencia5 = (int) Math.pow(numero2, 5);
		
		//Redondear valores:
		float valor1 = 4.3f;
		int valor1EnteroPequenho = (int) Math.floor(valor1);
		int valor1EnteroGrande = (int) Math.ceil(valor1);
		int valor1EnteroCercano = Math.round(valor1);
		System.out.println("valor1EnteroPequenho : " + valor1EnteroPequenho);
		System.out.println("valor1EnteroGrande : " + valor1EnteroGrande);
		System.out.println("valor1EnteroCercano : " + valor1EnteroCercano);
		int x1 = 2,x2 = 9;
		int minimo = Math.min(x1, x2);
		
	}

}
