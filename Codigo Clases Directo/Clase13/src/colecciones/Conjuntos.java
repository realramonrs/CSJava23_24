package colecciones;

import java.util.*;

public class Conjuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Conjuntos --> Colecciones de datos que no admiten duplicados
		// Además los elementos no se ordenan por orden de inserción y no están
		// indexados
		// HashSet y el TreeSet
		HashSet<String> nombres = new HashSet<String>();

		nombres.add("Pedro");
		nombres.add("Alberto");
		nombres.add("María");
		nombres.add("Juan");
		nombres.add("Juan");

		// Recorrer un conjunto de datos
		for (String s : nombres) {
			System.out.println(s);
		}

		ArrayList<Integer> lista = new ArrayList<Integer>();
		Random aleat = new Random();
		for (int i = 0; i < 20; i++) {
			lista.add(aleat.nextInt(11));
		}

		System.out.println("Matriz de números originales: ");

		for (int numero : lista) {
			System.out.print(numero + " ");
		}

		HashSet<Integer> numeros = new HashSet<Integer>(lista);

		System.out.println("Números sin duplicados: ");

		for (Integer i : numeros) {
			System.out.print(i + " ");
		}

		HashSet<Integer> numeros2 = new HashSet<Integer>();
		
		numeros2.add(9);
		numeros2.add(6);

		// addAll
		numeros.addAll(numeros2);
		System.out.println();
		System.out.println("Unión de dos conjuntos:");
		for (Integer i : numeros) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// retainAll
		numeros.retainAll(numeros2);
		
		System.out.println("Intersección de dos conjuntos:");
		
		for(Integer i : numeros) {
			System.out.print(i + " ");
		}
		
		//removeAll
		numeros.add(99);
		numeros2.add(88);
		numeros.removeAll(numeros2);
		
		System.out.println("Resta de dos conjuntos: ");
		
		for(Integer i : numeros) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		HashSet<Factura> facturas = new HashSet<Factura>();
		facturas.add(new Factura("A1",750));
		facturas.add(new Factura("A1" ,750));
		facturas.add(new Factura("C1", 950));
		
		for(Factura fs : facturas) {
			System.out.println(fs);
		}
		
		TreeSet<Factura> ts = new TreeSet<Factura>();
		ts.addAll(facturas);
		
	}

}
