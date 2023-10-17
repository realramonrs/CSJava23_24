package sentenciasSeleccion;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// If Else
		
		char resultado ='A';
		String valoracion;
		
		if(resultado =='A') {			
			valoracion = "Sobresaliente";
		}
		else {
			
			valoracion = "Suspenso";
		}
		
		//Sentencia de selección múltiple
		//Programa que indica si un número es múltiplo de 3, de 5 o de 7
		int numero = 9;
		
		if(numero % 3 == 0) {
			if(numero % 5 == 0) {
				System.out.println("Múltiplo de 3 y de 5");
			}
			else {
				System.out.println("Múltiplo de 3 y no de 5");
			}
			
		}
		else if(numero % 5 == 0) {
			System.out.println("Múltiplo de 5 y no de 3");
		}
		else if(numero % 7 == 0) {
			System.out.println("Múltilo de 7 , no de 3 ni de 5");
		}
		else {
			System.out.println("Ni de 3,ni de 5 ni de 7");
		}
		
		
		
		
	}

}
