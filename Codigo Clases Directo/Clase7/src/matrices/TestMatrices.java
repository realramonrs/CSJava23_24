package matrices;
import static utilidades.GeneracionArrays.*;
import static utilidades.Printable.*;

public class TestMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[] = new int[20];
		llenarArray(m, -30, 30);  //Este método está en el paquete utilidades
		                          // al añadir el import static ya puedo llamarlo directamente
		
		writeArray(m); //Mostramos el array generado con este método del paquete utilidades
		
		//Primer valor por encima de la media
		int pos = MetodosArrays.getValorUpMedia(m);
		System.out.println("El primer valor por encima de la media es : " + m[pos]);
		int numsNegativosEntre10y20 = MetodosArrays.getNumsNegativosByRango(m);
		
		System.out.println(numsNegativosEntre10y20);
		
		int numsNegativosEnUnRango = MetodosArrays.getNumsNegativosByRango(m,5,10 );
		
		System.out.println(numsNegativosEnUnRango);
		
		//Cambiamos pares por siguiente primo
		MetodosArrays.cambiarParPorProximoPrimo(m);
		
		writeArray(m);
		
	}

}
