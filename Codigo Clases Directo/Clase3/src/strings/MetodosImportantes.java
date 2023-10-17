package strings;

import java.util.Arrays;

public class MetodosImportantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "En un lugar de la Mancha";
		int numeroCaracteres = frase.length();
		System.out.println(frase);
		//Principales métodos de la clase String
		//charAt(int posicion) --> caracter que ocupa esa posición
		char primerCaracter = frase.charAt(0);
		char ultimoCaracter = frase.charAt(frase.length()-1);
		
		//indexOf(char caracter) --> la primera aparición
		int posicionu = frase.indexOf("u");
		int posiciona = frase.indexOf("r",6);
		System.out.println(posiciona);
		
		//lastIndexOf(char caracter)
		
		int ultimaPosiciona = frase.lastIndexOf("a");
		
		System.out.println(ultimaPosiciona);
		
		//substring(int indice) --> obtiene la cadena 
		//formada por los caracteres a partir de ese índice
		String subFrase = frase.substring(8);
		
		System.out.println(subFrase);
		
		String subFrase2 = frase.substring(posiciona, ultimaPosiciona);
		
		System.out.println(subFrase2);
		
		//contains(string) --> true o false si está en string o no
		String email = "pepe@gmail.com";
		
		boolean encontrado = email.contains(".com");
		
		//split("separador") --> trocea el string original
		
		String frase2 = "Me gusta programar en Java";
		String palabras[] = frase2.split(" ");
		
		System.out.println(Arrays.toString(palabras));
		char letras[] = frase.toCharArray();
		System.out.println(Arrays.toString(letras));
		
		//Strings son inmutables--> Una vez inicializados no se puede modificar
		String cadena1 = "Pedro";
		
		cadena1 = cadena1.replace('e', 'a');
		cadena1 = cadena1 + " hola";
		System.out.println(cadena1);
		
		
	}

}
