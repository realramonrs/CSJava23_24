package listas;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> series = new ArrayList<String>();
		//Obtener el numero de elementos inicial
		System.out.println("Tamaño inicial: " + series.size());
		//Añadir objetos a la lista
		series.add("Ozark");
		series.add("Breaking Bad");
		series.add("Stranger Things");
		series.add("The Wire");
		
		//Recorrer la lista:
		for(int i = 0;i<series.size();i++) {
			System.out.println(series.get(i));
		}
		
		//Obtener el numero de elementos inicial
		System.out.println("Nº Elementos actualmente: " + series.size());
		
		
		//Insertar un elemento en medio de la lista
		series.add(0, "Fargo");
		//Intercambiar un elemento por otro
				series.set(0, "Vikingos");
		//Recorrer la lista de nuevo pero con un For Mejorado
		for(String s : series) {
			System.out.println(s);
		}
		
		//Eliminar elementos:
		//a) por índice
		series.remove(0);
		//b) por valor
		series.remove("Ozark");
		System.out.println("Después de eliminar con Iterator: ");
		
		Iterator<String> it = series.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		series.add("Los Soprano");
		it = series.iterator();
		System.out.println("Después de eliminar con Iterator II: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
