package apiJava;

public class Matrices2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float tempMes[][] = {{10,2.5f,30},{5,6,7},{9,8,4}};
		// 10, 2.5f, 30
		// 5, 6, 7
		// 9, 8 , 4
		float mediaEnero = (tempMes[0][0] + tempMes[0][1] + tempMes[0][2])/3;
		
		
		
		//Si la matriz es 2D
		int capacidadtemMes = tempMes.length;
		System.out.println("Capacidad temMes: " + capacidadtemMes);
		int capacidadTotal = tempMes.length * tempMes[0].length;
		System.out.println("Capacidad Total = " + capacidadTotal);
	}

}
