package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;

public class MisFunciones {
	public static String rutaPelis = System.getProperty("user.dir")+"\\Peliculas.txt";
	public static String rutaLibros = System.getProperty("user.dir")+"\\Libros.txt";
	public static String rutaDvds = System.getProperty("user.dir")+"\\Discos.txt";
	
	private static ArrayList<Prestable> leerFicheroPeliculas() {
		ArrayList<Prestable> ap = new ArrayList<Prestable>();
		
		//
		try {
			BufferedReader bf = new BufferedReader(new FileReader(rutaPelis));
			
			String registro = bf.readLine();
			while(registro!=null) {
				String tokens[] = registro.split(",");
				//Comprobar si está alquilado
				
				if(tokens[6].equals("0")) {
					try {
						Pelicula p = new Pelicula(tokens[0],tokens[1],Integer.parseInt(tokens[2]),tokens[3],tokens[4]);
				          ap.add(p);	
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				else {
					Pelicula p;
					try {
						p = new Pelicula(tokens[0],tokens[1],Integer.parseInt(tokens[2]),tokens[3],tokens[4]);
						p.setPrestado(true);
						p.setFechaAlquiler(LocalDate.parse(tokens[6]));
						p.setFechaDevolucion(LocalDate.parse(tokens[7]));
						ap.add(p);
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        
				} //Fin del else
				
				registro = bf.readLine();
			}
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ap;
	}
	
	private static ArrayList<Prestable> leerFicheroLibros() {
		ArrayList<Prestable> ap = new ArrayList<Prestable>();
		
		//
		try {
			BufferedReader bf = new BufferedReader(new FileReader(rutaLibros));
			
			String registro = bf.readLine();
			while(registro!=null) {
				String tokens[] = registro.split(",");
				//Comprobar si está alquilado
				
				if(tokens[4].equals("0")) {
					try {
						Libro p = new Libro(tokens[0],tokens[1],tokens[2],Integer.parseInt(tokens[3]));
				          ap.add(p);	
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				else {
					Libro p;
					try {
						p = new Libro(tokens[0],tokens[1],tokens[2],Integer.parseInt(tokens[3]));
						p.setPrestado(true);
						p.setFechaAlquiler(LocalDate.parse(tokens[5]));
						p.setFechaDevolucion(LocalDate.parse(tokens[6]));
						ap.add(p);
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        
				} //Fin del else
				
				registro = bf.readLine();
			}
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ap;
	}
	
	private static ArrayList<Prestable> leerFicheroDiscos() {
		ArrayList<Prestable> ap = new ArrayList<Prestable>();
		
		//
		try {
			BufferedReader bf = new BufferedReader(new FileReader(rutaDvds));
			
			String registro = bf.readLine();
			while(registro!=null) {
				String tokens[] = registro.split(",");
				//Comprobar si está alquilado
				
				if(tokens[4].equals("0")) {
					try {
						DVDMusica p = new DVDMusica(tokens[0],tokens[1],Integer.parseInt(tokens[2]),tokens[3]);
				          ap.add(p);	
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				else {
					DVDMusica p;
					try {
						p = new DVDMusica(tokens[0],tokens[1],Integer.parseInt(tokens[2]),tokens[3]);
						p.setPrestado(true);
						p.setFechaAlquiler(LocalDate.parse(tokens[5]));
						p.setFechaDevolucion(LocalDate.parse(tokens[6]));
						ap.add(p);
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        
				} //Fin del else
				
				registro = bf.readLine();
			}
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ap;
	}
	public static ArrayList<Prestable> leerFicheroPrestables(){
		ArrayList<Prestable> productos = leerFicheroPeliculas();
		productos.addAll(leerFicheroLibros());
		productos.addAll(leerFicheroDiscos());
		return productos;
	}
	public static void escribirFicheroAlquilables(ArrayList<Prestable> a) {
		//Obtengo todas las peliculas y las escribo en el fichero de peliculas
		ArrayList<Prestable> pelis = new ArrayList<Prestable>();
		ArrayList<Prestable> libros = new ArrayList<Prestable>();
		ArrayList<Prestable> dvds = new ArrayList<Prestable>();
		for(Prestable p:a) {
			if(p instanceof Pelicula) {
				pelis.add(p);
			}
			else if(p instanceof Libro){
				libros.add(p);
			}
			else if(p instanceof DVDMusica) {
				dvds.add(p);
			}
			else {
				break;
			}
		}
		
		//Volcamos info a los ficheros.
		String rutaPelis = System.getProperty("user.dir")+"\\Peliculas.txt";
		String rutaLibros = System.getProperty("user.dir")+"\\Libros.txt";
		String rutaDiscos = System.getProperty("user.dir")+"\\Peliculas.txt";
		
		escribirFichero(pelis,rutaPelis);
		escribirFichero(libros,rutaLibros);
		escribirFichero(pelis,rutaDiscos);
			
		
	}
	
	private static void escribirFichero(ArrayList<Prestable> a,String ruta) {
		try {
			BufferedWriter bfw = new BufferedWriter(new FileWriter(ruta));
			
			for(Prestable p : a) {
				Producto pro = (Producto)p;
				bfw.write(pro.toStringFichero());
				bfw.newLine();
			}
			bfw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

public static void mostrarMenu() {
	System.out.println("Qué operación desea realizar: ");
	System.out.println("a. Alquilar un libro.");
	System.out.println("b. Alquilar una peli");
	System.out.println("c. Alquilar un DVD musical");
	System.out.println("d. Devolver un producto");
	System.out.println("e. Ver todos los productos disponibles");
	System.out.println("f. Guardar info en ficheros.");
	System.out.println("g. Añadir un nuevo producto.");
}

public static char leerMenu() {
	Scanner lector = new Scanner(System.in);
	char opcion = lector.next().charAt(0);
	//lector.close();
	return opcion;
}

public static String leerCadena() {
	Scanner lector = new Scanner(System.in);
	String cadena = lector.next();
	//lector.close();
	return cadena;
}

public static Prestable buscarRecurso(ArrayList<Prestable> lista,String codigo) {
	Prestable p = null;
	
	for(Prestable prest : lista) {
		Producto pro = (Producto)prest;
		if(pro.getCodigo().equals(codigo)) {
			p = pro;
			break;
		}
	}
	return p;
	
}
}
