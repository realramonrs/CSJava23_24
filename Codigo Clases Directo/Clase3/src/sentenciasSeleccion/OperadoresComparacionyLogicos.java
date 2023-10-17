package sentenciasSeleccion;

public class OperadoresComparacionyLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores de comparación : < , <= , >, >= , == , !=
		
		int x = 4, y = 5;
		boolean condicion1 = x < y;
		boolean condicion2 = x == y;
		boolean condicion3 = x!=y;
		int z = 8;
		
		// Operadores lógicos && --> Y Lógico
		boolean condicion4 = x < 9 && x>5;
		// || --> O Lógico --> 
		boolean condicion5 = x < 9 || (y == 0 &&  z %3 ==0);
		
		
		System.out.println(condicion5);
		
		// No lógico !
		boolean c6 = true;
		boolean c7 = !c6;
		
		
		
		
	}

}
