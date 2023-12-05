package ficheros;

import java.io.FileWriter;

import utils.Utilidad;

import java.io.*;

public class Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fichero = Utilidad.ruta + "\\Procesos.txt";
		
		try {
			FileWriter escritor = new FileWriter(fichero,true);
			BufferedWriter bfw = new BufferedWriter(escritor);
			bfw.newLine();
			bfw.write("1909_Rotación Maquina_45000");
			
			bfw.close();
			escritor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se pudo ejecutar la escritura");
		}
		
		
	}

}
