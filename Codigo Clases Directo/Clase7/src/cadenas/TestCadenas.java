package cadenas;

public class TestCadenas {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String prueba = "wtydd";
		if(MetodosStrings.validarString(prueba)) {
			System.out.println("Correcto");
		}
		else {
			System.out.println("Incorrecto.");
		}
		
		// Prueba método contar apariciones
		
		String prueba2 = "Hola caracola";
		int contadorCaracer = MetodosStrings.contarOcurrencias(prueba2, 'o');
		if(contadorCaracer == 0) {
			System.out.println("El caracter no está en la cadena.");
		}
		else {
			System.out.println("La o aparece " + contadorCaracer + " veces.");
		}
		
		//Prueba metodo contar palabras con 2 vocales
		String mensaje = "Hola tngo dos vocales";
		System.out.println(MetodosStrings.cuentaPalbrasDosVocales(mensaje));
		
		//Prueba método que busca la primera aparición de n caracteres
		
		int primeraAparicion = MetodosStrings.buscaCaracteres("Murcielago", 'j','h','b');
		
		System.out.println("Primera Posicion: " + primeraAparicion);
		
		
	}

}
