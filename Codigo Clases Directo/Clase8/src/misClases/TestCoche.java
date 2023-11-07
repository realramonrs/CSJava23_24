package misClases;

public class TestCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche c1 = new Coche();
		Coche c2 = new Coche("1234-JHY",30000);
		Coche c3 = new Coche("1234-YTR",30000,5000);
		System.out.println(c1.getKilometros() + " kms  --> " + c1.pasarRevision());
		
		System.out.println("Matrícula");
	}

	
}
