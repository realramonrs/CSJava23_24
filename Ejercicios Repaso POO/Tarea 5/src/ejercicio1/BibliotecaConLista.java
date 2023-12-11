package ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaConLista {
	
	public static void main(String[] args) {
		
		
		//Lo primero que debe de realizar la aplicación es leer los ficheros
		
		ArrayList<Prestable> productos = MisFunciones.leerFicheroPrestables();
		char opcion;
		char continuidad;
		
		do {
		MisFunciones.mostrarMenu();
	
		
		
		opcion = MisFunciones.leerMenu();
		
		//Evaluamos la opción del usuario
		switch(opcion) {
		
		case 'a':
		case 'A':
			//Alquilar un libro
			System.out.println("Introduzca código de libro que desea alquilar: ");
			
			//Mostramos libros que se pueden alquilar
			for(Prestable p : productos) {
				if(p instanceof Libro && !((Libro) p).getPrestado()) {
					System.out.println(((Libro)p).toString());
				}
			}
			String codigo = MisFunciones.leerCadena();
			//oBTENEMOS EL Recurso con ese código
			Producto p = (Libro)MisFunciones.buscarRecurso(productos, codigo);
			//Lo alquilamos
			if(p!=null) {
				p.prestar();
				System.out.println("El libro ha sido alquilado correctamente");
				System.out.println("Deberá devolverlo el : " + p.getFechaDevolucion());
			}
			break;
		case 'b':
		case 'B':
			//Alquilar una película
			System.out.println("Introduzca código de película que desea alquilar: ");
			
			//Mostramos peliculas que se pueden alquilar
			for(Prestable pr : productos) {
				if(pr instanceof Pelicula && !((Pelicula) pr).getPrestado()) {
					System.out.println(((Pelicula)pr).toString());
				}
			}
			String codigo2 = MisFunciones.leerCadena();
			//OBTENEMOS EL Recurso con ese código
			Producto p2 = (Pelicula)MisFunciones.buscarRecurso(productos, codigo2);
			//Lo alquilamos
			if(p2!=null) {
				p2.prestar();
				System.out.println("La película ha sido alquilada correctamente");
				System.out.println("Deberá devolverlo el : " + p2.getFechaDevolucion());
			}
		
			break;
		case 'c':
		case 'C':
			//Alquilar una película
			System.out.println("Introduzca código de dvd que desea alquilar: ");
			
			//Mostramos DVDS que se pueden alquilar
			for(Prestable pr : productos) {
				if(pr instanceof DVDMusica && !((DVDMusica) pr).getPrestado()) {
					System.out.println(((DVDMusica)pr).toString());
				}
			}
			String codigo3 = MisFunciones.leerCadena();
			//oBTENEMOS EL Recurso con ese código
			Producto p3 = (DVDMusica)MisFunciones.buscarRecurso(productos, codigo3);
			//Lo alquilamos
			if(p3!=null) {
				p3.prestar();
				System.out.println("EL DVD ha sido alquilada correctamente");
				System.out.println("Deberá devolverlo el : " + p3.getFechaDevolucion());
			}
			break;
		case 'd':
		case 'D':
			System.out.println("Introduzca código que desea devolver:");
			String codigoDevolucion = MisFunciones.leerCadena();
			
			Prestable pres = MisFunciones.buscarRecurso(productos, codigoDevolucion);
			if(pres!=null) {
				pres.devolver();
			}
			else {
				System.out.println("No se ha podido encontrar el producto.");
			}
			break;
		case 'e':
		case 'E':
			//Mostrar todos los productos disponibles
			for(Prestable prest : productos) {
				if(prest instanceof Producto) {
					Producto product = (Producto)prest;
					if(!product.getPrestado()) {
						System.out.println(product.toString());
					}
				}
			}
			break;
		case 'f':
		case 'F':
			System.out.println("Vamos a escribir en los ficheros: ");
			MisFunciones.escribirFicheroAlquilables(productos);
			break;
		case 'g':
		case 'G':
			break;
			
		}
		
		System.out.println("Desea seguir s/n");
		continuidad = MisFunciones.leerMenu();
	}
		
		while(continuidad=='s'|| continuidad =='S');

}
}
