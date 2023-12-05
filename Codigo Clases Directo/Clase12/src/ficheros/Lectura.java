package ficheros;
import java.io.*;

import utils.Utilidad;

public class Lectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mostramos la ruta a la carpeta raí<
		System.out.println(Utilidad.ruta);
		String fichero = Utilidad.ruta + "\\Procesos.txt";
		//Leer de un fichero de texto --> Necesitamos dos clases:
		try {
			FileReader lector = new FileReader(fichero);
			BufferedReader bf = new BufferedReader(lector);
			
			String registro="";
			while(registro!=null) {
				registro = bf.readLine();
				if(registro!=null)
				System.out.println(registro);
				else {
					break;
				}
			}
			
			lector.close();
			bf.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("EL buffer no soportó operación de lectura.");
		}
		
		
		
	}

}
