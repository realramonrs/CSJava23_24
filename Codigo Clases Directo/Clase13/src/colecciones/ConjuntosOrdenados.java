package colecciones;

import java.util.TreeSet;

public class ConjuntosOrdenados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> nombres = new TreeSet<String>();
		nombres.add("Zacarias");
		nombres.add("Juan");
		nombres.add("Alberto");
		nombres.add("Alberto");
		
		for(String n : nombres) {
			System.out.print(n + " , ");
		}
		
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		numeros.add(8);
		numeros.add(2);
		numeros.add(3);
		
		System.out.println();
		for(Integer n : numeros) {
			System.out.print(n + " ,");
		}
		
		TreeSet<Factura> facturas = new TreeSet<Factura>();
		facturas.add(new Factura("A1",750));
		facturas.add(new Factura("B1" , 1800));
		facturas.add(new Factura("C1", 650));
		
		System.out.println("Facturas ordenadas por precio:");
		
		for(Factura f : facturas) {
			System.out.println(f);
		}
		
		
	}

}
