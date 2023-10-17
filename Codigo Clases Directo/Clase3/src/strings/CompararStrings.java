package strings;

public class CompararStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "Hola";
		String cadena2 = "Hola";
		
		//Para comparar Strings --< equals
		
		boolean iguales = cadena.equals(cadena2);
		System.out.println("cadena.equals(cadena2: " + iguales);
		
		//EL operador de comparación --> ==
		boolean iguales2 = cadena == cadena2;
		System.out.println("cadena==cadena2 :" + iguales2);
		
		
		
		/*boolean iguales = cadena == cadena2;
		boolean igualesConEquals = cadena.equals(cadena2);
		System.out.println("cadena == cadena2 --> " + iguales);
		System.out.println("cadena.equals(cadena2) --> " + igualesConEquals);
	*/
	}

}
