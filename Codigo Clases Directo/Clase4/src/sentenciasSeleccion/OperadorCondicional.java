package sentenciasSeleccion;

public class OperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char resultado ='A'; //A --> Sobre, B--> Aprobado  C --> Suspenso
		String valoracion;
		
		//Operador condicional   = condicion? si se cumple : sino se cumple
		//valoracion = resultado =='A' ?  "Sobresaliente" : "Suspenso";
		
		valoracion = resultado == 'A' ? "Sobresaliente": resultado=='B' ? "Aprobado" : "Suspenso";       
	}

}
