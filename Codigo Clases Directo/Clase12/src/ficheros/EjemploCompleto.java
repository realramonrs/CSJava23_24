package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import utils.Proceso;
import utils.Utilidad;

public class EjemploCompleto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = Utilidad.ruta + "\\Procesos.txt";
		// Recuperar info del archivo Procesos
		Proceso[] ps = new Proceso[200];
		
		int opcion;
		Scanner lector = new Scanner(System.in);
		System.out.println("Escoja una opcion: ");
		System.out.println("1. Leer procesos");
		System.out.println("2. Añadir nuevo proceso");
		opcion = lector.nextInt();

		switch (opcion) {
		case 1:
			int posicion = 0;

			try (BufferedReader bfr = new BufferedReader(new FileReader(ruta))) {
				String registro = "";

				while (registro != null) {
					registro = bfr.readLine();
					if (registro != null) {
						String[] partes = registro.split("_");
						ps[posicion] = new Proceso(partes[0], partes[1], Long.parseLong(partes[2]));
						posicion++;
					}
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		
		case 2:
			try(BufferedWriter bfw = new BufferedWriter(new FileWriter(ruta,true))){
				
				bfw.newLine();
				bfw.write("1111_Estandar_111");
				
				
			} catch (IOException e) {
				// TODO Auto-gene2rated catch block
				e.printStackTrace();
			}
			break;
		}
		// Visualizar por pantalla los procesos almacenados

		for (Proceso p : ps) {
			if (p != null)
				System.out.println(p);
		}
		
		//Editar algún registro en concreto
		ps[0].setDuracion(1200);
		
		//Vuelco la información al fichero
		//Acceso aleatorio a ficheros.
		
		try(BufferedWriter bfw = new BufferedWriter(new FileWriter(ruta,false))){
			
			for(Proceso p : ps) {
				if(p!=null) {
					
					bfw.write(p.toString());
					bfw.newLine();
				}
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-gene2rated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
