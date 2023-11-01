package cadenas;

import java.util.Arrays;

public class MetodosStrings {

	// 1. Método que recibe un String y comprueba que empieza por mayuscula y
	// contiene al menos un dígito
	public static boolean validarString(String mensaje) {
		boolean contieneDigito = false;
		boolean empiezaPorMayuscula = false;
		boolean correcto = false;

		if (Character.isUpperCase(mensaje.charAt(0))) {
			empiezaPorMayuscula = true;
		}

		for (int i = 0; i < mensaje.length(); i++) {
			if (Character.isDigit(mensaje.charAt(i))) {
				contieneDigito = true;
				break;
			}
		}
		// correcto = empiezaPorMayuscula && contieneDigito;
		return empiezaPorMayuscula && contieneDigito;

	}

	// 2. Método que recibe un string y un char y cuenta las apariciones del char en
	// el String

	public static int contarOcurrencias(String frase, char caracter) {
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == caracter) {
				contador++;
			}
		}
		return contador;

	}
	// 3. Método que recibe un String y cuenta las palabras que contienen al menos 2
	// vocales

	public static int cuentaPalbrasDosVocales(String mensaje) {
		// Obtener las palbras del String
		String palabras[] = mensaje.split(" ");
		int palabrasCon2Vocales = 0;

		for (String pal : palabras) {
			int contadorVocales = 0;
			for (int i = 0; i < pal.length()&&contadorVocales<2; i++) {
				if (pal.charAt(i) == 'a' || pal.charAt(i) == 'e' || pal.charAt(i) == 'i' || pal.charAt(i) == 'o'
						|| pal.charAt(i) == 'u') {
					contadorVocales++;
				}
			} // Cierra el for interior
			if (contadorVocales == 2) {
				palabrasCon2Vocales++;
			}
		}
		return palabrasCon2Vocales;

	}
	// 4. Método que recibe un String y un número opcional de chars , busca los
	// chars en el string y devuelve la posición de la primera aparición de cualquiera de ellos

	 public static int buscaCaracteres(String mensaje,char c,char...letras) {

		 int posicionPrimeraLetraOpcional = -1;
		 
		 //Guardar la posición del primer char 	
		 int pos = mensaje.indexOf(c);
		 
		 for(int i = 0;i<mensaje.length();i++) {
			 //Por cada caracter del String buscamos las letras del array de chars opcionales
			 for(char car : letras) {
				 if(mensaje.charAt(i)==car) {
					 if(i<pos) {
						 //Si está en el string y está antes que char pasado como argumento obligatorio
						 return i;
					 }
					 //Si no devolvemos la posición del char que se pasó como argumento obligatorio
					 return pos;
					 
				 }
			 }
		 }				 
		 return -1;
	 } 
	 

	// 5. Método que recibe una matriz de Strings y devuelve el número de posiciones
	// ocupadas
	 
	 public static int getPosicionesOcupadas(String []m) {
		 int contador = 0;
		 for(String s : m) {
			 if(s!=null) {
				 contador++;
			 }
		 }
		 return contador;
	 }
	// 6. Método que recibe una matriz de Strings e introduce en la primera posición
	// vacía el string "Disponible".
	 public static void addDisponible(String []m) {
		 for(int i = 0;i<m.length;i++) {
			 if(m==null) {
				 m[i] = "Disponible";
				 break;
			 }
		 }
	 }
	 
	 
	 
}
