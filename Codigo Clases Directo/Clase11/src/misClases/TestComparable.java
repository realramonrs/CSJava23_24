package misClases;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparable {
	
	public static void main(String[] args) {
		Vehiculo flota[] = new Vehiculo[6];
		
		
		flota[0] = new Turismo("2W34",50,60);
		flota[1] = new Formula1("FR56",50,90);
		flota[2] = new Avion("ER90",50,100);
		
		flota[3] = new Turismo("AA34",70,60);
		flota[4] = new Formula1("BB56",70,90);
		flota[5] = new Avion("TT78",70,200);
		
		//Arrays.sort(flota);
		
		
		String codigos[] = {"Zacarias","Manuel","Alejandro"};
		int notas[] = {5,3,1};
		
		System.out.println("Explicacion compareTo: ");
		System.out.println(codigos[0].compareTo(codigos[2]));
		System.out.println(codigos[1].compareTo(codigos[1]));
		
		Arrays.sort(codigos);
		Arrays.sort(notas);
		
		
		System.out.println(Arrays.toString(codigos));
		System.out.println(Arrays.toString(notas));
		
		
		//Comparación Vehiculos
		System.out.println();
		System.out.println("Resultado de compareTo con flota[0] y flota[1]");
		System.out.println(flota[0].compareTo(flota[1]));
		System.out.println(flota[0].getCodigo().compareTo(flota[1].getCodigo()));
	
		flota[3].acelerar(7);
		flota[0].acelerar(12);
		Arrays.sort(flota);
		Arrays.sort(flota, new ComparaVehiculo());
		
		//Utilizando Clase Anónima
		
		Arrays.sort(flota, new Comparator<Vehiculo>() {

			@Override
			public int compare(Vehiculo o1, Vehiculo o2) {
				// TODO Auto-generated method stub
				return o1.getCodigo().compareTo(o2.getCodigo());
			}
			
		});
		
		
		//Volcar a un Array todos los turismos
		//Contar cuantos turismos hay en el array
		int contadorTurismos = 0;
		for(Vehiculo v : flota) {
			if(v instanceof Turismo) {
				contadorTurismos ++;
			}
		}
		Turismo ts[] = new Turismo[contadorTurismos];
		int pos = 0;
		for(Vehiculo  v : flota) {
			if(v instanceof Turismo) {
				ts[pos] = (Turismo)v;
				pos++;
			}
		}
		Arrays.sort(ts);
		
		System.out.println();
		System.out.println("Turismo ordenados por velocidad:");
		for(Turismo t : ts) {
			System.out.println(t);
		}
		System.out.println();
		
		for(Vehiculo v : flota) {
			if(v==null)
				break;
			System.out.println(v);
		}
		
	}

}
