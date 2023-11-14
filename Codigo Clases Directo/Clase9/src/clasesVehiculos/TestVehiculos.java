package clasesVehiculos;

import java.time.LocalDate;
import java.time.Month;

public class TestVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor m = new Motor();
		Motor m2 = new Motor(45,180,TipoMotor.Gasolina);
		
		//Mostrar info por consola de m2
		//System.out.println(m2.toString());
		
		
		Coche c1 = new Coche("4444UYT",LocalDate.of(2018, Month.JUNE, 12),"Nissan","Qasqai",23000,m2);
		Coche c2 = new Coche("1234UYT",LocalDate.of(2018, Month.JUNE, 12),"Nissan","Qasqai",23000,m2);
		Coche c3 = new Coche("6736HIU",LocalDate.of(2019, Month.APRIL, 19),"Renault","Megane",38000,new Motor(39,220,TipoMotor.Diesel));
		
		Coche c4 = new Coche("2345KIU",LocalDate.of(2019, Month.APRIL, 12),"Ford","Fiesta",13000,45,170,TipoMotor.Hibrido);
		//Cambiar litros aceite en c2:
		m2.setLitrosAceite(0);
		c2.getMotor().setLitrosAceite(30);
		//Cambiar litros aceite en c3
		c3.getMotor().setLitrosAceite(80);
		
		//Cambiar el tipo de motor
		c3.getMotor().setTipoMotor(TipoMotor.Gasolina);
		
		//Cambiar de motor
		c3.setMotor(new Motor(34,300,TipoMotor.Hibrido));
		
		//Cambiar los litros de aceite
		c4.getMotor().setLitrosAceite(12);
		
		//Printar por pantalla la información de un coche
		
		System.out.println(c4);
		
		//Matrices de coches
		
		Coche misCoches[] = new Coche[100];
		
		misCoches[0] = c2;
		misCoches[1] = new Coche("1111IKJ",LocalDate.of(2020, 12, 12),"Citroen","C3",23000,23,300,TipoMotor.Diesel);
		misCoches[2] = new Coche("2345IKJ",LocalDate.of(2020, 12, 12),"Peugeot","3008",15000,45,250,TipoMotor.Gasolina);
		misCoches[3] = new Coche("3453IKJ",LocalDate.of(2020, 12, 12),"Renault","Megane",18000,40,450,TipoMotor.Electrico);
		System.out.println(misCoches[0].toString());
		
		//Guardar c1 en la primera posición vacía.
		
		for(int i = 0;i<misCoches.length;i++) {
			if(misCoches[i]==null) {
				misCoches[i] = c1;
				break;
			}
		}
		
		//Calcular el precio total de los coches de la matriz
		float sumaTotal = 0;
		for(Coche c : misCoches) {
			if(c!=null) {
			sumaTotal = sumaTotal + c.getPrecio();
			}
			else {
				break;
			}
		}
		
		System.out.println("Precio total de los coches: " + sumaTotal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
