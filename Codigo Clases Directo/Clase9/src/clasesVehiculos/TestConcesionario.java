package clasesVehiculos;

import java.time.LocalDate;

public class TestConcesionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concesionario montecastelo = new Concesionario("Coches Fantasticos",20);
		Concesionario rodosa = new Concesionario("RODOSA",80);
		montecastelo.addCoche(new Coche("1234RTY",LocalDate.of(2019, 3, 23),"Porsche","Carrera",60000,40,400,TipoMotor.Gasolina));
		montecastelo.addCoche(new Coche("4567ABS",LocalDate.of(2020, 4, 12),"Tesla","Model X",90000,60,300,TipoMotor.Electrico));
		montecastelo.addCoche(new Coche("8765IUY",LocalDate.of(2021, 3, 23),"Porsche","Cayenne",12000,90,500,TipoMotor.Diesel));
		montecastelo.addCoche(new Coche("9997KJH",LocalDate.of(2021, 9, 23),"Lexus","CHR",45000,60,200,TipoMotor.Gasolina));
		
		System.out.println(montecastelo);
		
		Coche c = montecastelo.getCocheByMatricula("124RTY");
		System.out.println();
		System.out.println("Coche de matrícula: 1234RTY");
		if(c==null) {
			System.out.println("No se encuentra esa matrícula");
		}
		else {
			System.out.println(c);
		}
		
		//Eliminar un coche del concesionario
		boolean eliminado = montecastelo.deleteCoche("4567ABS");
		
		System.out.println();
		if(eliminado) {
		System.out.println("Despues de eliminar coche matrícula: 4567ABS");
		System.out.println(montecastelo);
		}
		else {
			System.out.println("No se encuentra esa matrícula.");
		}
	}

}
