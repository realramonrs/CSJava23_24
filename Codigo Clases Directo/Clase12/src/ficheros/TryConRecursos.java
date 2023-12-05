package ficheros;

import java.io.*;

import utils.Utilidad;

public class TryConRecursos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ruta = Utilidad.ruta + "\\NuevosProcesos.txt";
		
		try(BufferedWriter bfw = new BufferedWriter(new FileWriter(ruta,true))){
			bfw.newLine();
			bfw.write("9090_Caída del Brazo_900");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
