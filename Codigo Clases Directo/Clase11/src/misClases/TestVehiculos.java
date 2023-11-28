package misClases;
import java.util.*;
public class TestVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Acelerable flota[] = new Acelerable[100];
		
			
		flota[0] = new Turismo("QW34",50,60);
		flota[1] = new Formula1("FR56",50,90);
		flota[2] = new Avion("ER90",50,100);
		
		flota[3] = new Turismo("AA34",70,60);
		flota[4] = new Formula1("BB56",70,90);
		flota[5] = new Avion("TT78",70,200);
		
				
		/*flota[6] = new Leopardo("Ricky");
		flota[7] = new Planeta();*/
		
		//Acelerar todos los vehiculos
		
		for(Acelerable v : flota) {
			if(v==null)
				break;
			v.acelerar(2);
		}
		
		//Mostrar el estado actual de la flota:
		
		for(Acelerable v : flota) {
			if(v==null) {
				break;
			}
			System.out.println(v);
			
		}
		
		//Modificar la altura de vuelo de todos los aviones em 500
		
		for(Acelerable v : flota) {
			if(v==null)
				break;
			
			   //Convertir v en avion --> Downcasting
			//¡¡¡¡¡¡¡Cuidado!!!!!!! Peligro !!!!!
			   // instanceof
			   if(v instanceof Avion) {
				// Avion vcopia = (Avion)v;
				 ((Avion)v).modificarAlturaDeVuelo(500);
			   }
			
		}
		
		System.out.println();
		System.out.println("Después de modificar altuar aviones: ");
		System.out.println();
		//Mostrar el estado actual de la flota:
		
				for(Acelerable v : flota) {
					if(v==null) {
						break;
					}
					System.out.println(v);
					
				}
				
		//Cambiar nivel de aceite a los Fórmula 1
		
		for(Acelerable v : flota) {
			if(v instanceof Formula1) {
				((Formula1)v).setNivelAceite(100);
			}
		}
		
		for(int i = 0;i<flota.length;i++) {
			if(flota[i]==null)
				break;
			if(flota[i] instanceof Formula1) {
				((Formula1)flota[i]).setNivelAceite(100);
			}
		}
	}

}
