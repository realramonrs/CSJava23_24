package repasoTema2;

import java.io.File;
import javax.swing.*;
import java.text.*;

public class MostrarPorConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Caracteres Especiales
		int n = 9;
		System.out.println("Variable n = " + n + " dolares \nEsta es otra linea");
		System.out.println();
		System.out.println("Esta es otra linea");
		System.out.println("Como dijo Benitez: \"El equipo no gana\"");
		
		//printf
		int x = 9;
		float y = 5.46765f;
		System.out.printf("Entero x= %d%nfloat y = %.2f ", x,y);
		//Decimal Format
		float value = 39.123456f;
		String patron = "#.##";
		DecimalFormat myFormatter = new DecimalFormat(patron);
		String output = myFormatter.format(value);
		System.out.println(value + " patrón: " + patron + " = " + output);

		File archivo;
	}

}
