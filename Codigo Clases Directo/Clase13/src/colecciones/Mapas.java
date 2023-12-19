package colecciones;
import java.util.*;
import java.util.Map.Entry;

public class Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> alumnos = new HashMap<String,String>();
		//Los mapas utilizan objetos de tipo EntrySet<String,String> --> key y value
		alumnos.put("12345678E", "Marta Rodríguez");
		alumnos.put("90909090D", "Julian Flores");
		alumnos.put("10101010A", "Alejandro Vieitez");
		
		//Búsqueda por clave:
		String alumno = alumnos.get("12345678E");
		System.out.println(alumno);
		
		//Buscar si hay una clave
		boolean existe = alumnos.containsKey("12345678E");
		//Buscar si hay un valor
		boolean existeValor = alumnos.containsValue("Julian Flores");
		
		//Recorrer un mapa --> 
		
		//Obtener el conjunto de claves
		Set<String> claves = alumnos.keySet();
		
		System.out.println("Claves utilizadas: ");
		for(String s : claves) {
			System.out.println(s);
		}
		
		//Obtener los valores
		Collection<String> valores = alumnos.values();
		
		System.out.println("Valores almacenados: ");
		for(String valor: valores) {
			System.out.println(valor);
		}
		
		//Recorrer con for --> EntrySet<String,String>
		Set<Entry<String,String>> entradas = alumnos.entrySet();
		
		System.out.println("Clave - Valor:");
		for(Entry<String,String> entrada : entradas) {
			System.out.println(entrada.getKey() + " - " + entrada.getValue());
		}
		
		System.out.println();
		System.out.println("Catálogo de Series: ");
		
		HashMap<String,ArrayList<String>> catalogo = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> seriesNetflix = new ArrayList<String>();
		seriesNetflix.add("7 seconds");
		seriesNetflix.add("Stranger Things");
		
		ArrayList<String> seriesHBO = new ArrayList<String>();
		seriesHBO.add("The Wire");
		seriesHBO.add("True Detective");
		
		
		catalogo.put("Netflix", seriesNetflix);
		catalogo.put("HBO", seriesHBO);
		
		Set<String> claves2 = catalogo.keySet();
		for(String s : claves2) {
			System.out.println("Series de : " + s);
			ArrayList<String> series = catalogo.get(s);
			
			for(String serie : series) {
				System.out.println(serie);
			}
		}
		
		/*
		 * Collection<ArrayList<String>> valores2 = catalogo.values();
		 * 
		 * for(ArrayList<String> lista : valores2) {
		 * 
		 * for(String s : lista) { System.out.println(s); } }
		 */
		
	}

}
